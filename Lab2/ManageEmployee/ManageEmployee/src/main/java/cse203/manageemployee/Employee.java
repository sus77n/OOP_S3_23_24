/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.manageemployee;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author haing
 */
public class Employee {
    private String code;
    private String name;
    private int numOfYear;
    private double coeffi;
    private double salary;

    public Employee(String code, String name, int numOfYear, double coeffi, double salary) {
        this.code = code;
        this.name = name;
        this.numOfYear = numOfYear;
        this.coeffi = coeffi;
        this.salary = salary;
    }

    public Employee() {
    }

    public double getSalary() {
        return salary;
    }

    public double getCoeffi() {
        return coeffi;
    }

    public void setSalary(double salary) {
        this.salary = salary *coeffi;
    }

    
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input code: ");
        this.code = sc.next();
        
        System.out.print("Input name: ");
        this.name = sc.next();
        
        System.out.print("Input start year: ");
        int startyear = sc.nextInt();
        LocalDate localDate = LocalDate.now();
        int currentyear = localDate.getYear();
        this.numOfYear = currentyear - startyear;
        
        System.out.print("Input salary coefficient: ");
        this.coeffi = sc.nextDouble();
    }
    
    
    
    public double calculateSalary(double salary){
        double ans = salary * coeffi;
        return ans;
    }
    
    public void Print(){
        System.out.println("Code number: " + code);
        System.out.println("Name: " + name);
        System.out.println("Number of years: " + numOfYear);
        System.out.println("Salary coefficient: " + coeffi);
        System.out.println("Salary: " + salary);
    }
}
