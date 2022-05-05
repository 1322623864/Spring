package com.archegos.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")
// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
public class User {
    @Value("zzl")
    // 相当于配置文件中 <property name="name" value="秦疆"/>
  public String name ;

}
