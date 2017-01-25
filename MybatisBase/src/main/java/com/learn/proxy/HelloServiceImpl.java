package com.learn.proxy;

/**
 * Created by Administrator on 2017/1/25.
 */
public class HelloServiceImpl implements HelloService{
    @Override
    public void sayHello(String name) {
        System.out.println("hello"+name);
    }
}
