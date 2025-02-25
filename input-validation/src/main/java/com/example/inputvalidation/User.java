package com.example.inputvalidation;

import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.CreditCardNumber;

public class User {
    private String name;

    @Min(18)
    private int age;

    @CreditCardNumber(message = "Invalid credit card number")
    private String creditCardNumber;

    // Constructor, Getters and Setters
    public User(String name, int age, String creditCardNumber) {
        this.name = name;
        this.age = age;
        this.creditCardNumber = creditCardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}
