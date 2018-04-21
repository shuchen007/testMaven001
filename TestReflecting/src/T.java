class T{
    static {
        System.out.println("T静态代码块");
    }
    {
        System.out.println("T非静态代码块");
    }
    public T(){
        System.out.println("T构造函数");
    }
    public static void main(String[] args){
        System.out.println("T-Main函数");
    }
}
