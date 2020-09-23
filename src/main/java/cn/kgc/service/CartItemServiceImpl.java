package cn.kgc.service;

import cn.kgc.entity.CartItem;
import cn.kgc.mapper.CartItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemServiceImpl implements CartItemService {
    @Autowired
    private CartItemMapper cartItemMapper;
    @Override
    public Integer addOneItem(CartItem cartItem) {
        return cartItemMapper.insertOneItem(cartItem);
    }

    @Override
    public Integer setOneItem(CartItem cartItem) {
        return cartItemMapper.updateOneItem(cartItem);
    }

    @Override
    public CartItem getByPidCid(Integer productId, Integer customerId) {
        return cartItemMapper.selectByPidCid(productId, customerId);
    }

    @Override
    public Integer getItemCount(Integer customerId) {
        return cartItemMapper.selectItemCount(customerId);
    }

    @Override
    public List<CartItem> getItemsByCid(Integer customerId) {
        return cartItemMapper.selectItemsByCid(customerId);
    }

    @Override
    public Integer delItemById(Integer id) {
        return cartItemMapper.deleteItemById(id);
    }

    @Override
    public Integer delItemsByCid(Integer customerId) {
        return cartItemMapper.deleteItemById(customerId);
    }


}
