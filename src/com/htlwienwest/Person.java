package com.htlwienwest;

public class Person implements Greeter {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public void greet() {
        System.out.println("Seas from : " + getFirstName() + "  " + getLastName());
    }
}
