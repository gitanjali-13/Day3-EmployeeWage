package com.bridgelabz.employee;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to EMPLOYEE WAGES");
        int fullTime = 1;
        double check = Math.floor(Math.random() * 10 ) % 2;
        if ( check == fullTime ) {
            System.out.println("Employee is present.");
        }else {
            System.out.println("Employee is not present.");
        }
    }
}
