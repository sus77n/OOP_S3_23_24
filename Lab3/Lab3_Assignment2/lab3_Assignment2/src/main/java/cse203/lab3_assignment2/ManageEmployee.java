/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.lab3_assignment2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author haing
 */
public class ManageEmployee {
    private List<FullTimeEmployee> listFullTime = new ArrayList<>();
    private List<PartTimeEmployee> listPartTime = new ArrayList<>();
    
    static Scanner sc = new Scanner(System.in);
    
    public ManageEmployee() {
    }
    
    public ManageEmployee(List<FullTimeEmployee> listFullTime,List<PartTimeEmployee> listPartTime ) {
        this.listFullTime = listFullTime;
        this.listPartTime = listPartTime;
    }
    
    public void AddFullTime(){
        System.out.println("How many: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
             System.out.println("Enter ID: ");
        String id = sc.next();
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter year of birth: ");
        int year = sc.nextInt();
        System.out.println("Enter address: ");
        String address = sc.next();
        System.out.println("Enter phone: ");
        String phone = sc.next();
        System.out.println("Enter salary; ");
        float salary = sc.nextFloat();
        FullTimeEmployee ft = new FullTimeEmployee(id, name, year, address, phone, salary); 
        listFullTime.add(ft);
        }
       
    }
    
    public void AddPartTime(){
        System.out.println("How many: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
        System.out.println("Enter ID: ");
        String id = sc.next();
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter year of birth: ");
        int year = sc.nextInt();
        System.out.println("Enter address: ");
        String address = sc.next();
        System.out.println("Enter phone: ");
        String phone = sc.next();
        System.out.println("Enter working hours: ");
        int wh = sc.nextInt();
        System.out.println("Enter pay rate: ");
        float pr = sc.nextFloat();
        PartTimeEmployee pt = new PartTimeEmployee(wh, pr, id, name, year, address, phone);
        listPartTime.add(pt);
        }
    }
    
    public void ShowAllFullTime(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < listFullTime.size(); i++) {
            sb.append(listFullTime.get(i).getInfo()).append("\n");
        }
        System.out.println(sb);
    }
    
    public void ShowAllPartTime(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < listPartTime.size(); i++) {
          sb.append(listPartTime.get(i).getInfo()).append("\n");
        }
        System.out.println(sb);
    }
    
    public void ShowAllEmployee(){
        ShowAllFullTime();
        ShowAllPartTime();
    }
   
    
    public void SearchEmployeeByID(){
        System.out.println("Enter ID: ");
        String searchId = sc.next();
        int index = Collections.binarySearch(listFullTime, new FullTimeEmployee(searchId,"", 0, "", "", 0), FullTimeEmployee.compareById);
        if (index == -1){
            index = Collections.binarySearch(listPartTime, new PartTimeEmployee(0, 0, searchId,"", 0, "",""), PartTimeEmployee.compareById);
            if (index == -1)
            System.out.println("not found");
            else 
                System.out.println(listPartTime.get(index).getInfo());
        } else {
            System.out.println(listFullTime.get(index).getInfo());
        }
    }
    
    public void Delete(){
        System.out.println("Enter ID: ");
        String searchId = sc.next();
        int index = Collections.binarySearch(listFullTime, new FullTimeEmployee(searchId,"", 0, "", "", 0), FullTimeEmployee.compareById);
        if (index == -1){
            index = Collections.binarySearch(listPartTime, new PartTimeEmployee(0, 0, searchId,"", 0, "",""),PartTimeEmployee.compareById);
            if (index == -1)
            System.out.println("not found");
            else 
                listPartTime.remove(index);
        } else {
            listFullTime.remove(index);
        }
    }
    
    public void Edit(){
        System.out.println("Enter ID: ");
        String searchId = sc.next();
        int index = Collections.binarySearch(listFullTime, new FullTimeEmployee(searchId,"", 0, "", "", 0), FullTimeEmployee.compareById);
        if (index == -1){
            index = Collections.binarySearch(listPartTime, new PartTimeEmployee(0, 0, searchId,"", 0, "",""), PartTimeEmployee.compareById);
            if (index == -1){
            System.out.println("not found");
            }
            else {
                System.out.println("Choose your edited object\n" +
                                   "1. Name\n" +
                                   "2. Year of birth\n" +
                                   "3. Address\n" +
                                   "4. Phone\n" +
                                   "5. Working hour\n" +
                                   "6. Payrate\n" + "Number: ");
                int obj = sc.nextInt();
                listPartTime.get(index).ptEdit(obj);
            }
        } else {
            System.out.println("Choose your edited object\n" +
                               "1. Name\n" +
                               "2. Year of birth\n" +
                               "3. Address\n" +
                               "4. Phone\n" +
                               "5. Salary\n"+ "Number: ");
                int obj = sc.nextInt();
                listFullTime.get(index).ftEdit(obj);
        }
    }
   
    public void SearchEmployeeByPayment(){
        System.out.println("Enter min: ");
        float min = sc.nextFloat();
        System.out.println("Enter max: ");
        float max = sc.nextFloat();
        for (int i = 0; i < listFullTime.size(); i++) {
            if(listFullTime.get(i).getPayment()>= min && listFullTime.get(i).getPayment() <= max){
                System.out.println(listFullTime.get(i).getInfo());
            }
        }
        
        for (int i = 0; i < listPartTime.size(); i++) {
            if(listPartTime.get(i).getPayment() >= min && listPartTime.get(i).getPayment() <= max){
                System.out.println(listPartTime.get(i).getInfo());
            }
        }
    }
    
    public void SortAscending(){
        listFullTime.sort(FullTimeEmployee.compareAboutAge_Payment);
        listPartTime.sort(PartTimeEmployee.compareAboutAge_Payment);
    }
    
    
}
