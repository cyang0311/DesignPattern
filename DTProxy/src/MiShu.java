import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MiShu implements InvocationHandler {
    private Boss boss = new Boss();
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置");
        Object result = method.invoke(boss,args);
        System.out.println("后置");
        return result;
    }
}
