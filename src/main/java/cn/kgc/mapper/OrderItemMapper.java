package cn.kgc.mapper;

import cn.kgc.entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderItemMapper {
    //新增订单详情
    public Integer insertAllItems(List<OrderItem> items);

    /**
     * 根据id查询订单详情
     * @param orderId
     * @return
     */
    public List<OrderItem> selectItemsByOid(Integer orderId);
}
