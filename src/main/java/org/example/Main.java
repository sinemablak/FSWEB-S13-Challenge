package org.example;

public class Main {
    public static void main(String[] args) {
        String[] healthPlans = new String[3];
        Employee employee=new Employee(1,"Sinem Ablak","sinemablakk1@gmail.com","1234",healthPlans);
        System.out.println(employee);
        employee.addHealthPlan(0, "Basic Health Plan");
        System.out.println(employee);
    }
}