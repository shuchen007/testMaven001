import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static Main t1 = new Main() ;
//    public static T t2 = new T() ;
//    public static int i = print("xf") ;
//    public int j = print("j") ;
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        String str = "Tx";
        Class c = Class.forName(str);
        Object o = c.newInstance();
        Method[] methods = c.getMethods();
        System.out.println(methods.length);
        for(Method m : methods){
            System.out.println(m.getName());
            if(m.getName().equals("mm")){
                m.invoke(o);
            }
            if(m.getName().equals("mx")){
                m.invoke(o,1,2);
                Class[] classes = m.getParameterTypes();
                System.out.println(classes.length);
                Class x = m.getReturnType();
                System.out.println(x.getName());
                for(Class paramType : m.getParameterTypes()){
                    System.out.println(paramType.getName());
                }

            }

        }
//        T t = new T();
//        Main main = new Main();
        System.out.println("Hello World!");
    }
    public static int print(String x){
        System.out.println("静态函数");
        return 2;
    }


    static {
        System.out.println("Main静态代码块");
    }
    {
        System.out.println("Main非静态代码块");
    }
    public Main(){
        System.out.println("Main构造函数");
    }
}

class Tx{
    static {
        System.out.println("Tx静态代码块");
    }
    {
        System.out.println("Tx非静态代码块");
    }
    public Tx(){
        System.out.println("Tx构造函数");
    }
    public static void main(String[] args){
        System.out.println("Tx-Main函数");
    }
    public void mm(){
        System.out.println("Tx-mm");
    }
    public String mx(int x,int y){
        System.out.println("Tx-mx");
        return "doyou";
    }
}

