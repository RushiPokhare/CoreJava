package Methods;

public class Instance_Method1 {
    public static void main(String[] args) {
        System.out.println("main method");

//        object created because we need to call the instance method
        Instance_Method1 sm=new Instance_Method1();
        System.out.println(sm.add(1,2));
    }
    public int add(int a,int b){
        return a+b;
    }
}