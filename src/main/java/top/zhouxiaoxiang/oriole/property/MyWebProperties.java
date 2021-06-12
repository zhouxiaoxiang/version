package top.zhouxiaoxiang.oriole.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Eric Zhou
 * @since 2021/6/12
 */
@Data
@ConfigurationProperties(prefix = MyWebProperties.PREFIX)
public class MyWebProperties {

    public static final String PREFIX = "service.name";
    private String prefix = "/{ver}/";
}
