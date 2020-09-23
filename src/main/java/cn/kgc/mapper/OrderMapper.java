package cn.kgc.mapper;

import cn.kgc.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {
    /**
     * 新增订单
     * @param order
     * @return
     */
    public Integer insertOneOrder(Order order);

    /**
     * 订单状态
     * @param status
     * @return
     */
    public List<Order> selectOrdersByCid(@Param("customerId") Integer customerId,
                                         @Param("status") Integer status);
}
