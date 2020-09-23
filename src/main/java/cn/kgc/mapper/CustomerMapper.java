package cn.kgc.mapper;

import cn.kgc.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {
    /**
     * 注册用户登录信息
     * @param customer
     * @return
     */
    public Integer insertOneCustomer(Customer customer);

    /**
     * 根据用户信息username登录
     * @param username
     * @return
     */
    public Customer selectByUsername(String username);

    /**
     * 修改用户信息
     * @param customer
     * @return
     */
    public Integer updateOneCustomer(Customer customer);
}
