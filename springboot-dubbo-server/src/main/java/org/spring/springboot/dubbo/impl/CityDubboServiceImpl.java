package org.spring.springboot.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.spring.springboot.domain.City;
import org.spring.springboot.dubbo.CityDubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 城市业务 Dubbo 服务层实现层
 *
 * Created  on 21/03/2017.
 */
// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {

    public City findCityByName(String cityName) {

        //return new City(1L,2L,"温岭","是我的故乡");
        City city=new City();
        city.setId(new Long(1));
        city.setCityName(cityName);
        city.setDescription("北京欢迎你");
        city.setProvinceId(new Long(254));
        return city;
    }
}
