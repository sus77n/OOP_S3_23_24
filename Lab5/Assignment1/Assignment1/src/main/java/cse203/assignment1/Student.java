/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.assignment1;

import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author haing
 */
public class Student {
    protected String StNumber;
    protected String name;
    protected int numOfCredit;
    protected double average;
    Scanner sc = new Scanner(System.in);

    public Student() {
    }

    public Student(String StNumber, String name, int numOfCredit, double average) {
        this.StNumber = StNumber;
        this.name = name;
        this.numOfCredit = numOfCredit;
        this.average = average;
    }

    public String getStNumber() {
        return StNumber;
    }

    public String getName() {
        return name;
    }

    public void Input() {
        System.out.print("Enter student number: ");
        StNumber = sc.next();
        System.out.print("Enter student's name: ");
        name = sc.next();
        System.out.print("Enter number of credit: ");
        numOfCredit = sc.nextInt();
        System.out.print("Enter average: ");
        average = sc.nextDouble();
    }

    public void Output() {
        System.out.println("Student number: " + StNumber);
        System.out.println("Student name: " + name);
        System.out.println("Number of credits: " + numOfCredit);
        System.out.println("Average: " + average);
    }

    public boolean CheckGraduation() {
        if (numOfCredit < 100) {
            return false;
        }
        if (average < 5) {
            return false;
        }
        return true;
    }

    public static Comparator<Student> compareClass = new Comparator<Student>() {
        @Override
        public int compare(Student a, Student b) {
            if (a.getClass().toString().compareTo("class cse203.assignment3.CollegeStudent") == 0 && b.getClass().toString().compareTo("class cse203.assignment3.UniversityStu") == 0) {
                return -1;
            } else if (a.getClass().toString().compareTo("class cse203.assignment3.UniversityStu") == 0 && b.getClass().toString().compareTo("class cse203.assignment3.CollegeStudent") == 0) {
                return 1;
            } else {
                return Integer.parseInt(a.StNumber) - Integer.parseInt(b.StNumber);
            }
        }
    };
}
