/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.lab3_assignment2;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author haing
 */
public class FullTimeEmployee extends Employee{
    private float salary;
    
    static Scanner sc = new Scanner(System.in);
    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String id, String name, int yearOfBirth, String address, String phone, float salary) {
        super(id, name, yearOfBirth, address, phone);
        this.salary = salary;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
    
    public String getInfo(){
        return "ID: " + id + "\n" + "Name: " + name +"\n" + "Year of birth: " + yearOfBirth + "\n" + "Address: " + address + "\n" + "Phone: " + phone + "\n" + "Salary: " + salary + "\n" + "Payment: " + salary + "\n";
    }
    
    public float getPayment(){
        return salary;
    }
    
    public void ftEdit(int i){
        switch (i) {
            case 1:
                System.out.println("Enter new one: ");
                String newName = sc.next();
                this.name = newName;
                break;
            case 2 :
                System.out.println("Enter new one: ");
                int newYear = sc.nextInt();
                this.yearOfBirth = newYear;
                break;
            case 3:
                System.out.println("Enter new one: ");
                String newAddre = sc.next();
                this.address = newAddre;
                break;
            case 4:
                System.out.println("Enter new one: ");
                String newPhone = sc.next();
                this.phone = newPhone;
                break;
             case 5:
                System.out.println("Enter new one: ");
                float newSa = sc.nextFloat();
                this.salary = newSa;
                break;
            default:
                System.out.println("Try again");
        }
    }
    
    static Comparator<FullTimeEmployee> compareAboutAge_Payment = new Comparator<>(){
        public int compare(FullTimeEmployee f1, FullTimeEmployee f2){
            Calendar instance = Calendar.getInstance();
            int current = instance.get(Calendar.YEAR);
            if((current - f1.getYearOfBirth()) > (current - f2.getYearOfBirth())) return 1;
            if((current - f1.getYearOfBirth()) < (current - f2.getYearOfBirth())) return 1;
            
            if((current - f1.getYearOfBirth()) == (current - f2.getYearOfBirth())){
               if (f1.getPayment()< f2.getPayment()) return 1;
               if (f1.getPayment()> f2.getPayment()) return -1;
               
            }
            return 0;
        }
    };
    
    static Comparator<FullTimeEmployee> compareById = new Comparator<FullTimeEmployee>() {
        @Override
        public int compare(FullTimeEmployee o1, FullTimeEmployee o2) {
            if (o1.getId().compareTo(o2.getId()) == 1) return 1;
            if (o1.getId().compareTo(o2.getId()) == -1) return -1;
            return 0;
        }
    };
            
 
}
