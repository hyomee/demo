package com.hyomee.demo.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class HyundauiCarServiceImpl implements CarService{

    public HyundauiCarServiceImpl() {
        System.out.println("HyundauiCarServiceImpl 생성");
    }

    @PostConstruct
	public void hyundauiPostConstruct() {
		 System.out.println("HyundauiCarServiceImpl PostConstruct  생성");
	}

	@PreDestroy
	public void hyundauiPreDestroy() {
		System.out.println("HyundauiCarServiceImpl  PreDestroy 삭제");
    }

    public void init() {
		System.out.println("HyundauiCarServiceImpl init  생성");
	}

    public void cleanup() {
		System.out.println("HyundauiCarServiceImpl cleanup  생성");
	}

    @Override
    public void sale(String manufacturer, String carType) {
        System.out.println("제조사 : "  +manufacturer + " 차종 : " + carType + " 판매힙니다.");
     }

    
}
