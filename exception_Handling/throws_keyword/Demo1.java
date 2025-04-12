package exception_Handling.throws_keyword;

public class Demo1 {
    public static int div(int num1,int num2){
        int q=num1/num2;
        return q;
    }

    public static void main(String[] args) {
        System.out.println(div(10,0));
        System.out.println("Rest of code");
    }
}
