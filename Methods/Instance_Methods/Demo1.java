package Methods.Instance_Methods;

public class Demo1 {
    public int mul(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        Demo1 d=new Demo1();
        System.out.println(d.mul(2,3));
    }
}
