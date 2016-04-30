package mysite.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(
        HttpServletRequest httpServletRequest,
        HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("my interceptor prehandle");
        return true;
    }

    @Override
    public void postHandle(
        HttpServletRequest httpServletRequest,
        HttpServletResponse httpServletResponse,
        Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("my interceptor postcomplete");
    }

    @Override
    public void afterCompletion(
        HttpServletRequest httpServletRequest,
        HttpServletResponse httpServletResponse,
        Object o, Exception e) throws Exception {
        System.out.println("my interceptor aftercomplete");
    }
}
