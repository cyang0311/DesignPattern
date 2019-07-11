import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        MiShu miShu = new MiShu();

        //1.反射时用的类加载器，只有一个类加载器
        //Proxy需要实现的接口
        //tongg接口调用方法时，用那个类的invoke方法
        GongNeng gongNeng = (GongNeng) Proxy.newProxyInstance(Boss.class.getClassLoader(),new Class[]{GongNeng.class},miShu);
        gongNeng.Eat();
    }
}
