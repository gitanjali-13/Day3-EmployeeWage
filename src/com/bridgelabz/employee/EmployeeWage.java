package com.bridgelabz.employee;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to EMPLOYEE WAGES");
        int salary;
        int fullTime = 1;
        int perHrsWage = 20;
        double check = Math.floor(Math.random() * 10 ) % 2;
        if ( check == fullTime ) {
            System.out.println("Employee is present.");
            int Hrs = 8;
            salary = perHrsWage * Hrs;
            System.out.println("Salary of employee" +salary );
        }else {
            System.out.println("Employee is not present.");
            int Hrs = 0;
            salary = perHrsWage * Hrs;
            System.out.println("Salary of employee"+salary);
        }
    }
}
