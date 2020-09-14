package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }

    public void setLastName(String name){
        this.lastName = name;
    }

    public void setAge(int a){
        if (a < 0 || a > 100)
            this.age = 0;
        else
            this.age = a;
    }

    public boolean isTeen (){
        if (this.age > 12 && this.age < 20)
            return true;
        else
            return false;
    }

    public String getFullName () {
        if (firstName.isEmpty() && lastName.isEmpty())
            return "";
        else if (firstName.isEmpty())
            return this.lastName;
        else if (lastName.isEmpty())
            return this.firstName;
        else
            return this.firstName + " " + this.lastName;
    }
}
