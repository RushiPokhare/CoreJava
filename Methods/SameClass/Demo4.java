package Methods.SameClass;

public class Demo4 {
    int amt;
    public int Deposit(int value){
        amt=amt+value;
        return amt;
    }
    public int withdraw(int value){
//        using reference variable .this
        System.out.println("This is Deposit method using --> .this"+this.Deposit(1000));
//        we can access directly also
//        System.out.println(Deposit(10000));
        amt-=value;
        return amt;
    }

    public static void main(String[] args) {
        Demo4 demo4=new Demo4();
        System.out.println("This is Withdraw Method: "+demo4.withdraw(300));
    }
}
