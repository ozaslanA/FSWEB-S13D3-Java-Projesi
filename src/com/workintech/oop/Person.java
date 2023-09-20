package com.workintech.oop;

public class Person {
    // instance variable(field)
    String firstName;
    String lastName;
    int age;
    String job;
    double salary;
    boolean isMarried;


    //constructor
    public Person ( String firstName,String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;


    }

    //constructor overload
    public Person ( String firstName,String lastName, int age,String job,double salary
    )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.job=job;
        this.salary=salary;


    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

    public String getJob(){
        return job;
    }
    public double getSalary(){
        return salary;
    }



    }
