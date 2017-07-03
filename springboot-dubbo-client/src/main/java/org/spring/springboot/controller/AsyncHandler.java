package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.spring.springboot.dubbo.CityDubboConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.AsyncContext;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by tingyun on 2017/6/30.
 */
@Component
public class AsyncHandler implements Runnable {

    public static  String cityName;

    @Autowired
    private CityDubboConsumerService cityDubboConsumerService;

    //private AsyncContext ctx;

    public AsyncHandler() {
    }
    @Override
    public void run() {
        City city=cityDubboConsumerService.printCity(cityName);
        System.err.println(city.toString());
    }
}
