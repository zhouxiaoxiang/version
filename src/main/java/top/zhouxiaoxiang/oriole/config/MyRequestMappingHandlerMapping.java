package top.zhouxiaoxiang.oriole.config;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.servlet.mvc.condition.RequestCondition;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import top.zhouxiaoxiang.oriole.annotation.V;

import java.lang.reflect.Method;

/**
 * @author Eric Zhou
 * @since 2021/6/12
 */
public class MyRequestMappingHandlerMapping extends RequestMappingHandlerMapping {

    @Override
    protected RequestCondition<?> getCustomTypeCondition(Class<?> handlerType) {
        return createRequestCondition(handlerType);
    }

    @Override
    protected RequestCondition<?> getCustomMethodCondition(Method method) {
        return createRequestCondition(method);
    }

    private <T> RequestCondition<?> createRequestCondition(T t) {
        V v = null;
        if (t instanceof Class) {
            v = AnnotationUtils.findAnnotation((Class<?>) t, V.class);
        } else if (t instanceof Method) {
            v = AnnotationUtils.findAnnotation((Method) t, V.class);
        }
        return v == null ? null : new MyRequestCondition(v.value());
    }
}
