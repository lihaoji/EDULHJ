package com.edu.eduservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author lihaoji
 * @create 2019-11-10 13:18
 */
@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages={"com.edu","com.edu.entity"})
public class EduApplication {
    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class,args);
    }
}
