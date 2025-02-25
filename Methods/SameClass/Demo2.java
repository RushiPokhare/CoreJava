package Methods.SameClass;
//Calling Instance method from static method

//In Java, objects can be created in various places, including:
    //Instance methods
    //Static methods
    //Constructors
    //Static blocks
    //Instance initializer blocks
public class Demo2 {
    public int add(int num1, int num2){
        return num1+num2;
    }
    public static int mul(int num1,int num2){
//      we create object in static method to call an instance method
        Demo2 demo2=new Demo2();
        System.out.println("This is an instance method"+demo2.add(2,4));
        return  num1*num2;
    }

    public static void main(String[] args) {
        System.out.println("This is a main method");
        System.out.println("This is a static method"+Demo2.mul(6,7));
    }
}
