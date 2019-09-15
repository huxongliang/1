package dynamicProxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Star star = new Star();
        Action proxy = (Action)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Action.class}, new Myproxy(star));
        proxy.sing("¶öÀÇ´«Ëµ");
    }
}
