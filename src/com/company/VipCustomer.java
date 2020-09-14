package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(String name, double creditLimit, String email) {
        setName(name);
        setCreditLimit(creditLimit);
        setEmail(email);
    }
    public VipCustomer() {
        this("Default name", 1000 , "default@default.com");
    }
    public VipCustomer(String name, double creditLimit){
       this(name,creditLimit, "default@default.com");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
