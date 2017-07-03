package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.spring.springboot.dubbo.CityDubboConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.AsyncContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * Created by tingyun on 2017/3/21.
 */
@RestController
public class CityController {

    //@Autowired
    //private CityDubboConsumerService cityDubboConsumerService;

    @Autowired
    private AsyncHandler asyncHandler;

    @GetMapping(value = "/web/city/{cityName}")
    public void getCity(@PathVariable String cityName, HttpServletRequest req, HttpServletResponse res) {

        //return cityDubboConsumerService.printCity(cityName);

        /**
         * 配置线程池
         */
        ScheduledThreadPoolExecutor poolExecutor=new ScheduledThreadPoolExecutor(7);
        //配置异步请求
        //AsyncContext asyncContext=req.startAsync(req,res);

        //設置屬性
        AsyncHandler.cityName=cityName;
        poolExecutor.execute(asyncHandler);
   }
}
