/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.assignnment2_lab5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author haing
 */
public class Staff {

    private String fullname;
    private String dateOfBirth;
    private long IDnumber;
    protected double salary;
    Scanner sc = new Scanner(System.in);

    public Staff(String fullname, String dateOfBirth, long IDnumber, double salary) {
        this.fullname = fullname;
        this.dateOfBirth = dateOfBirth;
        this.IDnumber = IDnumber;
        this.salary = salary;
    }

    public Staff() {
    }

    public void CalculateSalary() {

    }

    public void Input() {
        System.out.print("Enter Full name: ");
        fullname = sc.next();
        System.out.print("Enter date of birth:  ");
        dateOfBirth = sc.next();
        while (true) {
            try {
                System.out.print("Enter id number: ");
                IDnumber = sc.nextLong();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Please enter id number again: ");
                sc.nextLine();
            }
        }

    }

    public String toString() {
        return "ID number: " + IDnumber + "\nFullname: " + fullname + "\nDate of birth: " + dateOfBirth + "\n";
    }
}
