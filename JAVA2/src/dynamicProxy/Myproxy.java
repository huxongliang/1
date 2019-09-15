package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Myproxy implements InvocationHandler {
	private Object star;

    public Myproxy( Object star) {
        this.star =star ;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //代理扩展逻辑
        System.out.println("代理人通知被代理人：");
        return method.invoke(star, args);
    }
}
