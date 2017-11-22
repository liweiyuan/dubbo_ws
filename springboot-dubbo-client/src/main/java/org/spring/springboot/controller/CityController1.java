package org.spring.springboot.controller;

import com.alibaba.dubbo.remoting.exchange.ResponseFuture;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.protocol.dubbo.FutureAdapter;
import org.spring.springboot.domain.City;
import org.spring.springboot.dubbo.CityDubboConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by tingyun on 2017/3/21.
 */
@Controller
public class CityController1 {

    //@Autowired
    //private CityDubboConsumerService cityDubboConsumerService;

    @Autowired
    private AsyncHandler asyncHandler;

    @Autowired
    CityDubboConsumerService cityDubboConsumerService;

    //@GetMapping(value = "/web/city/{cityName}")
    @RequestMapping(value = "/web1/city/{cityName}")
    @ResponseBody
    public void getCity(@PathVariable String cityName, HttpServletRequest req, HttpServletResponse res) throws ExecutionException, InterruptedException {

        ResponseFuture future = (ResponseFuture) cityDubboConsumerService.printCity("北京");
        RpcContext.getContext().setFuture(new FutureAdapter<Object>(future));
    }
}
