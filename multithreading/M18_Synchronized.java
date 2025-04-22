package multithreading;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class M18_Synchronized {
    public static void main(String[] args) throws InterruptedException {
        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        @ToString
        class BankAccount{
            private int accountNumber;
            private double balance;
            private String accountHolderName;

            synchronized public void deposit(double amount){
                balance=balance+amount;
            }

            synchronized public void withdraw(double amount){
                balance=balance-amount;
            }

            synchronized public double checkBalance(){
                return balance;
            }
        }
        BankAccount bankAccount= new BankAccount(1,11000d,"rushi");
        
        Thread atm=new Thread(()->{
            for (int i = 0; i <= 100; i++) {
                bankAccount.withdraw(1);    //in this step we withdraw 1 rupee per step
            }
        },"ATM");

        Thread upi=new Thread(()->{
            for (int i = 0; i <= 900; i++) {
                bankAccount.deposit(1);    //in this step we withdraw 1 rupee per step
            }
        },"UPI");

        Thread netBanking=new Thread(()->{
            for (int i = 0; i <=200; i++) {
                bankAccount.withdraw(1);    //in this step we withdraw 1 rupee per step
            }
        },"Net_Banking");

        atm.start();
        upi.start();
        netBanking.start();

        atm.join();
        upi.join();
        netBanking.join();

        System.out.println("Current Account Balance is: "+bankAccount.getBalance());
    }
}
