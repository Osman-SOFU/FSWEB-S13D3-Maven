package org.example;

public class Person {
    int size;
    int weight;
    double notes;

    String firstName;
    String lastName;
    int age;

    public Person(int size, int weight, double notes){
        this.size = size;
        this.weight = weight;
        this.notes = notes;
    }

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public Boolean isTeen(){
        if(age>=13 && age<=19){
            return true;
        }else {
            return false;
        }
    }
}
