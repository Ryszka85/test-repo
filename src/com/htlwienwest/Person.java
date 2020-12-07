package com.htlwienwest;

public class Person implements Gretter {
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
