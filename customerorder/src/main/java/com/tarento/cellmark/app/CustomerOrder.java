package com.tarento.cellmark.app;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "com.tarento")
@EnableAutoConfiguration
@MapperScan("com.tarento.cellmark.mapper")
@Slf4j
public class CustomerOrder  {

    private static ApplicationContext context;
    private static SpringApplication application = new SpringApplication(CustomerOrder.class);

    public static void main(String[] args) {
        context = application.run(args);
    }
}
