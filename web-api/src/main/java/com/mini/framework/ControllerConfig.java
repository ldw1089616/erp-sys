package com.mini.framework;
import com.mini.framework.interceptor.AuthHandlerInterceptorAdapter;
import com.mini.framework.util.Constants;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.servlet.handler.MappedInterceptor;


/**
 * Controller设置
 */
@ControllerAdvice
public class ControllerConfig {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        // 去掉请求中的空格
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(Constants.HALF_SPACE + Constants.FULL_SPACE, false));
        // 设置需要包裹的元素个数，默认为256
        binder.setAutoGrowCollectionLimit(10000);
    }
    /**
     * 权限拦截器设置
     *
     * @return 拦截器
     */
//    @Bean
//    public MappedInterceptor authHandlerInterceptor() {
//        return new MappedInterceptor(new String[]{"/**"}, new AuthHandlerInterceptorAdapter());
//    }

}
