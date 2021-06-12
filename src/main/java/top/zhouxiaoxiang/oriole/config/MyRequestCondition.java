package top.zhouxiaoxiang.oriole.config;

import cn.hutool.core.util.ReUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.servlet.mvc.condition.RequestCondition;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Eric Zhou
 * @since 2021/6/12
 */
@Data
@AllArgsConstructor
public class MyRequestCondition implements RequestCondition<MyRequestCondition> {
    private int ver;

    @Override
    public MyRequestCondition combine(MyRequestCondition o) {
        return new MyRequestCondition(o.getVer());
    }

    @Override
    public MyRequestCondition getMatchingCondition(HttpServletRequest r) {
        String uri = r.getRequestURI();
        try {
            return Integer.parseInt(ReUtil.getGroup1("/v(\\d+)/", uri)) >= getVer() ? this : null;
        } catch (Exception e) {
            throw new RuntimeException("Must supply a right version instead of " + uri);
        }
    }

    @Override
    public int compareTo(MyRequestCondition o, HttpServletRequest r) {
        return o.getVer() - getVer();
    }
}
