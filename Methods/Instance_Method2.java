package Methods;

public class Instance_Method2 {
    public int mul(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        Instance_Method2 d=new Instance_Method2();
        System.out.println(d.mul(2,3));
    }

}
