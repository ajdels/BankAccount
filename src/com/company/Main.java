package com.company;

public class Main {

    public static void main(String[] args) {
        var myAccount = new BankAccount();
        var yourAccount = new BankAccount(2000,0.05f);
        myAccount.deposit(1000);
        myAccount.interest();
        yourAccount.interest();
        System.out.println("Your account with ID: " + yourAccount.getAccountID() + "currently has a balance of: "+yourAccount.checkBalance());
        System.out.println("Your account currently has a balance of "+yourAccount.checkBalance());
        var didSuceeed = myAccount.withdraw(2000);
        if(didSuceeed)
            System.out.println("Successfully made withdrawl");
        else
            System.out.println("Could not withdraw, from account number " +  myAccount.getAccountID() +
    "Current balance is " + myAccount.checkBalance());
    }
}
