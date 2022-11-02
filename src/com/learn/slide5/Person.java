package com.learn.slide5;

public class Person {
    private String identityNumber;
    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String identityNumber, String firstName, String lastName) {
        this.identityNumber = identityNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return this.identityNumber.equals(person.getIdentityNumber());
    }

    @Override
    public int hashCode() {
        return identityNumber.hashCode();
    }

    @Override
    public String toString() {
        return identityNumber + "  " + firstName + "  " + lastName;
    }
}

