package com.company;

public class Main {

    public static void main(String[] args) {
        var myAccount = new BankAccount();
        var yourAccount = new BankAccount(2000,0.05f);
        myAccount.deposit(1000);
        myAccount.interest();
        var didSuceeed = myAccount.withdraw(2000);
        if(didSuceeed)
            System.out.println("Successfully made withdrawl");
        else
            System.out.println("Could not withdraw, current balance is " + myAccount.checkBalance());

    }
}
