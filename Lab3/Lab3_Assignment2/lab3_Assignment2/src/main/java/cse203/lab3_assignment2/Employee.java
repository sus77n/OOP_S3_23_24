/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.lab3_assignment2;

import java.util.Comparator;

/**
 *
 * @author haing
 */
public abstract class Employee {
    protected String id;
    protected String name;
    protected int yearOfBirth;
    protected String address;
    protected String phone;

    public Employee(String id, String name, int yearOfBirth, String address, String phone) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phone = phone;
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }
    
    
    
    public abstract String getInfo();
    public abstract float getPayment();
    
    
    
}
