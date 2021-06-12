package top.zhouxiaoxiang.oriole;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zhouxiaoxiang.oriole.annotation.V;

/**
 * @author Eric Zhou
 * @since 2021/6/12
 */
@SpringBootApplication
@RestController
@RequestMapping
@V(2)
public class DemoController {
    public static void main(String[] args) {
        SpringApplication.run(DemoController.class, args);
    }

    @GetMapping
    public Boolean get() {
        return true;
    }
}
