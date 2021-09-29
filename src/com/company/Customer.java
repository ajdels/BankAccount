package com.company;
import java.util.ArrayList;
import java.util.Optional;

public class Customer {
    private int CustomerID;
    private String name;
    private ArrayList<BankAccount> accounts;

    public Customer(String customerName, int taxID) {
        CustomerID = taxID;
        name = customerName;
        accounts = new ArrayList<BankAccount>();
    }

    public BankAccount openAccount(double initialBalance) {
        var newAccount = new BankAccount();
        newAccount.deposit(initialBalance);
        var didSucceed = accounts.add(newAccount);
        return newAccount;
    }

    public Optional<BankAccount> closeAccount(int accountNumber) {
        //look for the right account in accounts
        //if found remove account and return it in an optional
        for (var currentAccount : accounts) {
            if (currentAccount.getAccountID() == accountNumber) {
                accounts.remove(currentAccount);
                return Optional.of(currentAccount);
            }
        }
        //if not found empty optional
        System.out.println("Tried to remove an account that didn't exist");
        return Optional.empty();
    }

    public String getName(){
        return name;
    }
    public Integer getID(){
        return CustomerID;
    }
}
