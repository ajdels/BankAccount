package com.company;

public class BankAccount {
    private double balance;
    private float interestRate;

    public BankAccount(){
            interestRate = 0.02f;
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public double interest(){
        var interest = balance * interestRate;
        balance += interest;
        return balance;
    }
    public boolean withdraw(double amount){
        if(balance < amount)
            return false;
        balance -= amount;
        return true;
    }
    public double checkBalance(){
        return balance;
    }

    public static class Main {
    }
}
