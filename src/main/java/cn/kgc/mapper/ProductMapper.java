package cn.kgc.mapper;

import cn.kgc.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 商品信息
 */
@Mapper
public interface ProductMapper {
    //通过map传递参数,使用健名进行值的引用
    public List<Product> selectAllProducts(Map<String, Object> map);
    //根据商品id查询商品信息
    public Product selectProductById(Integer productId);
}
