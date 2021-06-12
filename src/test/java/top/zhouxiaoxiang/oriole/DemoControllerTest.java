package top.zhouxiaoxiang.oriole;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;

/**
 * @author Eric Zhou
 * @since 2021/6/12
 */
@SpringBootTest
@AutoConfigureMockMvc
class DemoControllerTest {

    private static final String DEMO_V1 = "/v1/";
    private static final String DEMO_V2 = "/v2/";
    private static final String DEMO_V3 = "/v3/";

    @Resource
    private MockMvc mvc;

    @Test
    void get_v3() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get(DEMO_V3))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("true")));
    }

    @Test
    void get_v2() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get(DEMO_V2))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("true")));
    }

    @Test
    void get_v1() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get(DEMO_V1))
                .andExpect(MockMvcResultMatchers.status().isNotFound())
                .andReturn();
    }
}