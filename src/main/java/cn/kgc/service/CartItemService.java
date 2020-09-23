package cn.kgc.service;

import cn.kgc.entity.CartItem;

import java.util.List;

public interface CartItemService {
    /**
     * 新增购物车信息
     * @param cartItem
     * @return
     */
    public Integer addOneItem(CartItem cartItem);
    /**
     * 更新购物车商品数量
     * @param cartItem
     * @return
     */
    public Integer setOneItem(CartItem cartItem);

    /**
     * 根据用户id和商品id查询购物车里是否已经存在
     * @param productId
     * @param customerId
     * @return
     */
    public CartItem getByPidCid(Integer productId, Integer customerId);

    /**
     * 根据用户查询商品的总数
     * @param customerId
     * @return
     */
    public Integer getItemCount(Integer customerId);

    /**
     * 查询用户所有的购物商品
     * @param customerId
     * @return
     */
    public List<CartItem> getItemsByCid(Integer customerId);

    /**
     * 删除 购物车商品信息
     * @param id
     * @return
     */
    public Integer delItemById(Integer id);

    /**
     * 通过用户Id customerId删除所有的购物车信息
     * @param customerId
     * @return
     */
    public Integer delItemsByCid(Integer customerId);
}
