package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.spring.springboot.dubbo.CityDubboConsumerService;
import org.spring.springboot.dubbo.CityDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tingyun on 2017/3/21.
 */
@RestController
public class CityController {

    @Autowired
    private CityDubboConsumerService cityDubboConsumerService;

    @GetMapping(value = "/web/city/{cityName}")
    public City getCity(@PathVariable String cityName) {
        return cityDubboConsumerService.printCity(cityName);
    }
}
