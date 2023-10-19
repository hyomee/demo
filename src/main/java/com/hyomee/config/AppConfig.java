package com.hyomee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hyomee.demo.service.CarService;
import com.hyomee.demo.service.HyundauiCarServiceImpl;
import com.hyomee.demo.service.SamsungCarServiceImpl;

@Configuration
public class AppConfig {
   
    @Bean(name = "Handaui", initMethod = "init", destroyMethod = "cleanup")
    public CarService hyundauiCarService() {
        return new HyundauiCarServiceImpl();
    }

    @Bean(name = "Sansung")
    public CarService samsungCarService() {
        return new SamsungCarServiceImpl();
    }
}
