package com.wmy.springCloud;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class SpringCloudApplicationTests {

    private MockMvc build;

    @Before
    public void setUp() {
        /**
         * MockMvcBuilders 构造器构造单机版app,实例化HelloController
         */
        build = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void hello() throws Exception {
        /**
         * MockMvcRequestBuilders
         * 通过mvc请求构造器请求url地址，指定请求格式为application/json
         */
        build.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk()) // 请求状态为200
        .andExpect(content().string(equalTo("Hello World"))); // 判断url请求结果返回值是否为Hello World
    }

}
