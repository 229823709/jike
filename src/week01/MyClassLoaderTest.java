package week01;

import java.lang.reflect.Method;

public class MyClassLoaderTest {
    public static void main(String[] args) throws Exception {
        // 指定类加载器加载调用
       // week01.MyClassLoader classLoader = new week01.MyClassLoader();
        //System.out.println(classLoader.findClass("Hello"));
        //classLoader.loadClass("Hello").getMethod("hello").invoke(null);
        MyClassLoader mcl = new MyClassLoader();
        Class<?> c1 = Class.forName("Hello", true, mcl);
        Object obj = c1.newInstance();
        Method method = obj.getClass().getMethod("hello");
        String str = (String) method.invoke(obj);

    }
}

