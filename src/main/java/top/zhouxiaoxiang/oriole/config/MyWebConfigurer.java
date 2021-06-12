package top.zhouxiaoxiang.oriole.config;

import lombok.var;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import top.zhouxiaoxiang.oriole.property.MyWebProperties;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.function.Predicate;

/**
 * @author Eric Zhou
 * @since 2021/6/12
 */
@Configuration
@EnableConfigurationProperties(MyWebProperties.class)
public class MyWebConfigurer {
    @Resource
    private MyWebProperties myWebProperties;

    @Bean
    public WebMvcRegistrations webMvcRegistrationsHandlerMapping(){
        return new WebMvcRegistrations() {
            @Override
            public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
                var pathPrefixes = new LinkedHashMap<String, Predicate<Class<?>>>();
                var myRequestMappingHandlerMapping = new MyRequestMappingHandlerMapping();

                myRequestMappingHandlerMapping.setOrder(0);
                pathPrefixes.put(myWebProperties.getPrefix(), c -> c.isAnnotationPresent(RestController.class));
                myRequestMappingHandlerMapping.setPathPrefixes(pathPrefixes);
                return myRequestMappingHandlerMapping;
            }
        };
    }
}
