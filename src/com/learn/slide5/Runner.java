package com.learn.slide5;

public class Runner {
    public static void main(String[] args) {
        Person person = new Person("01019083285","Lasha","Modzmanashvili");
        Person person1=new Person("01019071969","Mariam","Amirejibi");
        System.out.println(person.equals(person1));
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
        System.out.println(person);
        System.out.println(person1);
    }
}
