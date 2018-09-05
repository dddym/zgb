package cn.zgbfour.zgb.config;

import cn.zgbfour.zgb.handle.ApiTokenValidateInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * author:liuda
 * Date:2018/9/6
 * Time:1:39
 */

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Bean
    public ApiTokenValidateInterceptor getApiTokenValidateInterceptor(){
        return new ApiTokenValidateInterceptor();
    }

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getApiTokenValidateInterceptor()).addPathPatterns("/api/**");
    }
}
