package com.company;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        System.out.println("Empty constructor");
    }
    public BankAccount(int number, double balance, String customerName, String email, int phoneNumber){
        this.setEmail(email);
        this.balance = balance;
        this.accountNumber = number;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        System.out.println("Constructor with parameters created.");
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public double getBalance() {
      //  balance = Math.round (balance * 100);
       // balance = balance/100;
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void deposit(int a){
        if (a >= 0)
            this.balance += a;
        else
            System.out.println("Wrong value");
    }

    public void withdraw (int a){
        if ( a < this.balance)
            this.balance -= a;
        else
            System.out.println("Too much");
    }
}
