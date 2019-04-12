package cn.springBootDemo.annotation.springBootConfiguration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class Config {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Bean
    public Map createMap(){
        Map map = new HashMap();
        map.put("username","gxz");
        map.put("age",10);
        return map;
    }
}