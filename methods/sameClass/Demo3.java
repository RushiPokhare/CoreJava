package methods.sameClass;
public class Demo3 {
    int num1,num2;
    public static int div(int num1,int num2){
        return num1/num2;
    }
    public int mod(int num1,int num2){
//        we can call static method from instance method using [this,className,direcltyCall]
        System.out.println("This is a Static Method using --> reference THIS: "+this.div(10,3));
        System.out.println("This is a Static Method using --> Direct Call: "+div(10,4));
        System.out.println("This is a Static Method using --> ClassName  [**RECOMM...]: "+Demo3.div(10,6));
        this.num1=num1;
        this.num2=num2;
        return num1%num2;
    }

    public static void main(String[] args) {
        System.out.println("Calling static method from instance method");
        Demo3 demo3=new Demo3();
        System.out.println("This is a Instance Method: "+demo3.mod(8,7));
    }

}
