package cn.kgc.controller;


import cn.kgc.entity.CartItem;
import cn.kgc.entity.Customer;
import cn.kgc.entity.Order;
import cn.kgc.entity.OrderItem;
import cn.kgc.service.CartItemService;
import cn.kgc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderItemController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private CartItemService cartItemService;

    @RequestMapping("/")
    public String index(HttpSession session, Model model, Integer status) {
        Integer num = status == null? 0 : status;

        Customer user = (Customer) session.getAttribute("user");

        List<Order> orders = orderService.getOrdersByCid(user.getId(), num);

        for (Order order : orders) {
            System.out.println(order.getOrderNumber());

            for (OrderItem orderItem : order.getOrderItems()) {
                System.out.println(orderItem.getProduct());
            }
        }

        model.addAttribute("orders", orders);

        return "all_orders";
    }

    @RequestMapping("add_order")
    public String addOneOrder(HttpSession session) {
        Customer user = (Customer) session.getAttribute("user");

        //取出购物车中所有商品
        List<CartItem> list = cartItemService.getItemsByCid(user.getId());

        //生成订单并清空购物车
        if (orderService.addOneOrder(list, user) > 0) {
            cartItemService.delItemsByCid(user.getId());
            user.setCartNum(0); //用户购物车数量清零
        }

        return "redirect:/order/";
    }
}
