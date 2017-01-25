package com.learn.proxy;

/**
 * Created by Administrator on 2017/1/25.
 */
public class HelloServiceMain {
    public static void main(String[] args){
        HelloServiceProxy helloHandler = new HelloServiceProxy();
        HelloService proxy = (HelloService)helloHandler.bind(new HelloServiceImpl());
        proxy.sayHello("Tom");
    }
}
