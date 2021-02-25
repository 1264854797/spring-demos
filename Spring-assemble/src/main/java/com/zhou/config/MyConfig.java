package com.zhou.config;

import com.zhou.pojo.Dog;
import com.zhou.pojo.Dogs;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//标注这是一个配置类
@Configuration
@Import(MyConfig2.class)
public class MyConfig {

//  通过方法注册一个Bean，这里返回值就是Bean的类型，方法名就是Bean的id;
    @Bean
    public Dogs dogs(){
        return new Dogs();
    }
}
