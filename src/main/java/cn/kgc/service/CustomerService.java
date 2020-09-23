package cn.kgc.service;

import cn.kgc.entity.Customer;

public interface CustomerService {
    /**
     * 注册用户登录信息
     * @param customer
     * @return
     */
    public Integer addOneCustomer(Customer customer);

    /**
     * 根据用户信息username登录
     * @param username
     * @return
     */
    public Customer getByUsername(String username);

    /**
     * 修改用户信息
     * @param customer
     * @return
     */
    public Integer setOneCustomer(Customer customer);
}
