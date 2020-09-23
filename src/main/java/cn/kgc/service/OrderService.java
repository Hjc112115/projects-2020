package cn.kgc.service;

import cn.kgc.entity.CartItem;
import cn.kgc.entity.Customer;
import cn.kgc.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderService {
    /**
     * 生产一个新的订单,,添加所有的订单详情
     *
     * @param user
     * @return
     */
    public Integer addOneOrder(List<CartItem> items, Customer user);

    /**
     * 订单状态
     * @param status
     * @return
     */
    public List<Order> getOrdersByCid(Integer customerId, Integer status);



}