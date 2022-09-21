package com.bridgelabz.employee;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to EMPLOYEE WAGES");
        int salary;
        int fullTime = 1;
        int partTime = 2;
        int perHrsWage = 20;
        int hrs = 0;
        int empWage = 0;
        double check = Math.floor(Math.random() * 10 ) % 2;
        switch (check){
            case fullTime:
                System.out.println("Employee is Full time ");
                hrs = 8;
                empWage = perHrsWage * hrs;
                System.out.println("Employe wage salary is " + empWage);
                break;
            case partTime:
                System.out.println("Employe is part time");
                hrs =4;
                empWage =perHrsWage * hrs;
                System.out.println(empWage);
                break;
            default:
                System.out.println("Employee is absent ");
                hrs = 0;
                empWage = perHrsWage * hrs;
                System.out.println(empWage);
        }
    }
}
