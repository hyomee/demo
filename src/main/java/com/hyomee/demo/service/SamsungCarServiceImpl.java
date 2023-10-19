package com.hyomee.demo.service;

public class SamsungCarServiceImpl implements CarService{

    @Override
    public void sale(String manufacturer, String carType) {
        System.out.println("제조사 : "  +manufacturer + " 차종 : " + carType + " 판매힙니다.");
    }
    
}
