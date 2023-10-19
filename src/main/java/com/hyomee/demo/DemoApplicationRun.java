package com.hyomee.demo;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.hyomee.demo.service.CarService;
import com.hyomee.demo.service.HyundauiCarServiceImpl;
import com.hyomee.demo.service.SamsungCarServiceImpl;

@Component
public class DemoApplicationRun implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //  ApplicationContext ctx = new AnnotationConfigApplicationContext(HyundauiCarServiceImpl.class,
        //             SamsungCarServiceImpl.class);
        //   CarService hyundauiService = ctx.getBean(HyundauiCarServiceImpl.class);
        //   CarService samsungService = ctx.getBean(SamsungCarServiceImpl.class); 
        //   hyundauiService.sale("현대", "그랜저");
        //   samsungService.sale("삼성", "SM3");
    }

}
