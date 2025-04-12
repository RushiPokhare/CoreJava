package methods;


public class BankAccount {
    int account_no;
    int balance;
    String HolderName;

    void deposit(int amount) {
//        this.balance=this.balance+amount; behind the below sense.
        balance = balance + amount;
    }

    void withdraw(int amount){
        balance-=amount;
    }

    public static void main(String[] args) {
        BankAccount RushiKaBankAccount=new BankAccount();
        System.out.println(RushiKaBankAccount.account_no);
        System.out.println(RushiKaBankAccount.balance);
        System.out.println(RushiKaBankAccount.HolderName);

        RushiKaBankAccount.deposit(500);
        System.out.println("After Diposite into account :"+RushiKaBankAccount.balance);

        RushiKaBankAccount.withdraw(200);
        System.out.println("After Withdraw money :"+RushiKaBankAccount.balance);
    }
}
