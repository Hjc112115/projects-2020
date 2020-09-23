package cn.kgc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置类，用于替代xml文件配置方式
 */

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截/cart/和/order/开头的链接
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/cart/**", "/order/**");
    }
}
