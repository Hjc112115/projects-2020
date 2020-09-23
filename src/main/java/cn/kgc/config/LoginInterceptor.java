package cn.kgc.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 设置登录拦截器
 */

public class LoginInterceptor implements HandlerInterceptor {

    //调用controller前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //System.out.println("prehandler被调用");
        HttpSession session = request.getSession();

        //未登录
        if (session.getAttribute("user") == null) {
            response.sendRedirect("/customer/login_error"); //跳转至错误页面
            return false;   //返回false则不执行controller
        }
        else {
            return true;
        }
    }


        /*
    //调用controller后执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("posthandler被调用");
    }

    //调用controller完成后执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("after被调用");
    }
    */
}
