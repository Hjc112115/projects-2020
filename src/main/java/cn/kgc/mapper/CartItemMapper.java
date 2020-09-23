package cn.kgc.mapper;


import cn.kgc.entity.CartItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CartItemMapper {
    /**
     * 新增购物车信息
     * @param cartItem
     * @return
     */
    public Integer insertOneItem(CartItem cartItem);

    /**
     * 更新购物车商品数量
     * @param cartItem
     * @return
     */
    public Integer updateOneItem(CartItem cartItem);

    /**
     * 根据用户id和商品id查询购物车里是否已经存在
     * @param productId
     * @param customerId
     * @return
     */
    public CartItem selectByPidCid(@Param("productId") Integer productId,
                                   @Param("customerId") Integer customerId);

    /**
     * 根据用户查询商品的总数
     * @param customerId
     * @return
     */
    public Integer selectItemCount(Integer customerId);

    /**
     * 查询用户所有的购物商品
     * @param customerId
     * @return
     */
    public List<CartItem> selectItemsByCid(Integer customerId);

    /**
     * 删除 购物车商品信息
     * @param id
     * @return
     */
    public Integer deleteItemById(Integer id);

    /**
     * 通过用户Id customerId删除所有的购物车信息
     * @param customerId
     * @return
     */
    public Integer deleteItemsByCid(Integer customerId);
}
