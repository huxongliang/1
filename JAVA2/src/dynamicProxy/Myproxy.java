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
        //������չ�߼�
        System.out.println("������֪ͨ�������ˣ�");
        return method.invoke(star, args);
    }
}
