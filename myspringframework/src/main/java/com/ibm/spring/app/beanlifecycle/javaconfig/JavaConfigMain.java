package com.ibm.spring.app.beanlifecycle.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService customerService = ctx.getBean(CustomerService.class);
        System.out.println(customerService.findAll());

        ProductService productService = ctx.getBean(ProductService.class);
        System.out.println(productService.findAll());
    }
}
