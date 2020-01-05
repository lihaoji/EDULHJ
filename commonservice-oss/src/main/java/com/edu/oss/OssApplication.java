package com.edu.oss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author lihaoji
 * @create 2019-12-08 16:34
 */
@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages={"com.edu.oss","com.edu.entity"})
public class OssApplication {

    public static void main(String[] args) {
        SpringApplication.run(OssApplication.class, args);
    }
}