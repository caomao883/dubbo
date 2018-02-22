package com.alibaba.dubbo.consumer;

import com.alibaba.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        //加载spring配置
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        //打印代理类型，底层dubbo使用NIO的RCP做远程调用
        System.out.println("打印引用类型:"+demoService.getClass());

    }
}

