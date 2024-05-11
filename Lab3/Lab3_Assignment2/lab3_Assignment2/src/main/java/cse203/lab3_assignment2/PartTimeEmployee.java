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
public class PartTimeEmployee extends Employee{
    private int workingHour;
    private float payRate;
    
    static Scanner sc = new Scanner(System.in);

    public PartTimeEmployee(int workingHour, float payRate, String id, String name, int yearOfBirth, String address, String phone) {
        super(id, name, yearOfBirth, address, phone);
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    public PartTimeEmployee() {
    }
    
    public String getInfo(){
        return "ID: " + id + "\n" + "Name: " + name +"\n" + "Year of birth: " + yearOfBirth + "\n" + "Address: " + address + "\n" + "Phone: " + phone + "\n" + "Working hour: " + workingHour + "\n" + "Payrate: " + payRate + "\n" + "Payment: " +getPayment()+ "\n";
    }
    
    public float getPayment(){
        return workingHour * payRate;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
    
    
    public void ptEdit(int i){
        switch(i){
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
                int newWh = sc.nextInt();
                this.workingHour = newWh;
                break;
            case 6:
                System.out.println("Enter new one: ");
                float newR = sc.nextFloat();
                this.payRate = newR;
                break;
            default:
                System.out.println("Try again");
        }
    }
    
    static Comparator<PartTimeEmployee> compareAboutAge_Payment = new Comparator<>(){
        public int compare(PartTimeEmployee f1, PartTimeEmployee f2){
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
    
    static Comparator<PartTimeEmployee> compareById = new Comparator<PartTimeEmployee>() {
        @Override
        public int compare(PartTimeEmployee o1, PartTimeEmployee o2) {
            if (o1.getId().compareTo(o2.getId()) == 1) return 1;
            if (o1.getId().compareTo(o2.getId()) == -1) return -1;
            return 0;
        }
    };
}
