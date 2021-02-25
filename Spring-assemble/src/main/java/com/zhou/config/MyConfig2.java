package com.zhou.config;

import com.zhou.pojo.Cat;
import com.zhou.pojo.Cats;
import com.zhou.pojo.Dog;
import com.zhou.pojo.Dogs;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//标注这是一个配置类
@Configuration
public class MyConfig2 {

//  通过方法注册一个Bean，这里返回值就是Bean的类型，方法名就是Bean的id;
    @Bean
    public Cats cats(){
        return new Cats();
    }
}
