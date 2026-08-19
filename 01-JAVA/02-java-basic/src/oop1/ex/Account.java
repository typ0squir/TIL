package oop1.ex;

public class Account {
    int balance;
    int amount;

    int deposit() {
        balance += amount;
        return balance;
    }

    int withdraw() {
        if (balance < amount) {
            System.out.println("잔액 부족");

        } else {
            balance -= amount;
        }

        return balance;
    }
}
