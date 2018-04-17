package cn.gyyx.app.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author : east.Fu
 * @Description :权限过滤器
 * @Date : Created in  2018/4/17 10:43
 */
@Component
public class AuthFilter implements Filter{

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
        LOGGER.info("request uri : "+httpRequest.getRequestURI());

        String authHeader = httpRequest.getHeader("Authorization");

        LOGGER.info("authHeader : "+authHeader);
        filterChain.doFilter(httpRequest,httpResponse);
    }

    @Override
    public void destroy() {
    }
}
