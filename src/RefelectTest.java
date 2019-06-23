import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefelectTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException {
        Class<?> c = methodClass.class;
        Object object = c.newInstance();
        Method[] methods = c.getMethods();
        Method[] declaredMethods = c.getDeclaredMethods();
        //获取methodClass类的add方法
        Method method = c.getMethod("add", int.class, int.class);
        //getMethods()获取所有方法
        System.out.println("getMethods获取的方法");
        for(Method m:methods) {
            System.out.println(m);
        }
        System.out.println("getDeclaredMethods获取的方法");
        for(Method m:declaredMethods)
            System.out.println(m);

        Class<?> cls = methodClass.class;
        Object obj = cls.newInstance();
        Method method1 = cls.getMethod("add", int.class, int.class);
        Object result = method1.invoke(obj, 1, 4);
        System.out.println(result);

        Class<?> kls = Class.forName("java.lang.String");
        Object array = Array.newInstance(kls, 25);
        Array.set(array, 0, "hello");
        Array.set(array,1,"Java");
        Array.set(array,2,"fuck");
        Array.set(array,3,"Scala");
        Array.set(array,4,"Clojure");
        System.out.println(Array.get(array,3));

    }
    }

class methodClass {
    public final int a = 3;
    public int add (int a, int b) {
        return a+b;
    }
    public int sub(int a, int b) {
        return a-b;
    }
}