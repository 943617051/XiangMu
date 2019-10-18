package com.itcanteen.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author baimugudu
 * @email 2415621370@qq.com
 * @date 2019/8/31 10:09
 */

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args){
        SpringApplication.run(TestApplication.class,args);
    }
}
