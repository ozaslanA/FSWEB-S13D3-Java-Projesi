package com.workintech.oop;

public class Main {
    public static void main(String[] args)
    {
        Person person = new Person("John", "Doe", 19,"engineer", 1000 );

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());
        System.out.println("Job: " + person.getJob());
        System.out.println( person.isTeen());


        System.out.println("Salary: " + person.getSalary());
        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }
}