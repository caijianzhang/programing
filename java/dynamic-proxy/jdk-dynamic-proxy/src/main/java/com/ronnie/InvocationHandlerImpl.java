package com.ronnie;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationHandlerImpl implements InvocationHandler {
    private Object target;

    InvocationHandlerImpl() {
        super();
    }

    InvocationHandlerImpl(Object target) {
        super();
        this.target = target;
    }

    public Object invoke(Object o, Method m, Object[] args) throws Throwable {
        System.out.println("before invoke " + m.getName());
        Object result = m.invoke(target, args);
        System.out.println("after invoke " + m.getName());
        return result;
    }
}
