package cn.kgc.entity;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * 购物车信息
 */

public class CartItem {
    private Integer id;
    private Product product;   //商品信息
    private Customer customer;  //用户信息
    private Integer number;     //数量
    private Date createDate;   //时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
