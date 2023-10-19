package com.hyomee.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.hyomee.demo.service.CarService;
import com.hyomee.demo.service.HyundauiCarServiceImpl;
import com.hyomee.demo.service.SamsungCarServiceImpl;

@Component
public class DemoApplicationScanRun implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
       try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext()) {
            ctx.scan("com.hyomee.config");
            ctx.refresh();
            CarService hyundauiService = (CarService) ctx.getBean("Handaui");
            CarService samsungService = ctx.getBean(SamsungCarServiceImpl.class); 
            System.out.println("************************");
       
            hyundauiService.sale("현대", "그랜저");
            samsungService.sale("삼성", "SM3");
        }
    }
}