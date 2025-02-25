package Methods.SameClass;

public class Demo1 {
       static int add(int number1,int number2){
        return number1+number2;
    }
    static int mul(int number1,int number2){
//        calling static method from static method in same class
//        we are in same class we can call directly...but it's recommend to call static method using class name
        System.out.println("Calling static method from another static method [NOT RECOMMEND]:  "+add(5,10));
//                  OR
        System.out.println("calling static method from another static method [RECOMMEND]:  "+Demo1.add(2,3));
        return number1*number2;
    }

    public static void main(String[] args) {
        System.out.println("Calling Add Method"+Demo1.mul(3,4));
    }
}