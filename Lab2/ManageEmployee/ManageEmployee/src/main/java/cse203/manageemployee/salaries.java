/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.manageemployee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author haing
 */
public class salaries {
    
    ArrayList<Employee> list = new ArrayList<>();
    private double basicSalary;

    public salaries(double basicSalary, ArrayList list) {
        this.basicSalary = basicSalary;
        this.list = list;
    }

    public salaries() {
    }

    public double getSalary() {
        return basicSalary;
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input salary: ");
        basicSalary= sc.nextDouble();
        System.out.print("Input number of employee: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Employee employee = new Employee();
            employee.Input();
            list.add(employee);
        }
    }
    
    public void calculateSalaries(){
       for (int i = 0; i < list.size(); i++) {
            list.get(i).setSalary(basicSalary);
        } 
    }
    
    public void PrintSalarySheet(){
        calculateSalaries();
        for (int i = 0; i < list.size(); i++) {
            list.get(i).Print();
        }
    }
    
    Comparator<Employee> com = new Comparator<Employee>(){
        @Override
        public int compare (Employee e1, Employee e2){
            return (int) (e1.getSalary()-e2.getSalary());
        }
    };
   
    public void HighestSalary(){
        System.out.println("The highest salary:");
        list.sort(com);
        double maxSalary = list.get(list.size() - 1).getSalary();
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).getSalary() == maxSalary){
                list.get(i).Print(); 
            } 
        }
    }
    
    public void DecreaseSalary(){
        System.out.println("Decreasing salary: ");
       list.sort(com);
        for (int i = list.size() - 1; i >= 0; i--) {
            list.get(i).Print();  
        }
    }
}
