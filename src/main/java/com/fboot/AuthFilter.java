package com.fboot;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

/**
 *
 * @author RipPer
 */
@Component
public class AuthFilter implements Filter {

    @Override
    public void init(FilterConfig fc) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
        try {
            if (((HttpServletRequest) sr).getSession().getAttribute("logged") != null) {
            } else {
                
            }
            {
                fc.doFilter(sr, sr1);
            }
        } catch (IOException | ServletException ex) {
        }
    }

    @Override
    public void destroy() {
    }

}
