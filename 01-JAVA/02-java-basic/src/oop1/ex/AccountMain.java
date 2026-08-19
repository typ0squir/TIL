package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        
        account.amount = 10000;
        account.balance = account.deposit();

        account.amount = 9000;
        account.balance = account.withdraw();

        account.amount = 2000;
        account.balance = account.withdraw();
        
        System.out.println("잔고: " + account.balance);
    }
}
