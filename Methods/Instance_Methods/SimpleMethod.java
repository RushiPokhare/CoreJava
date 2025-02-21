package Methods.Instance_Methods;

public class SimpleMethod {
    public static void main(String[] args) {
        System.out.println("main method");

//        object created because we need to call the instance method
        SimpleMethod sm=new SimpleMethod();
        System.out.println(sm.add(1,2));
    }
    public int add(int a,int b){
        return a+b;
    }
}