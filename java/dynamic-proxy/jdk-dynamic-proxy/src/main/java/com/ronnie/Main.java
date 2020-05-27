package com.ronnie;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        InvocationHandler hander = new InvocationHandlerImpl(service);
        Service proxy = (Service) Proxy.newProxyInstance(service.getClass().getClassLoader(), service.getClass().getInterfaces(), hander);
        proxy.doSomething("test jdk dynamic proxy");
    }
}
