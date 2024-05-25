/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.assignment1;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author haing
 */
public class ManageStudent {
     static Scanner sc = new Scanner(System.in);
    private Vector <Student> v = new Vector<>();

    public ManageStudent() {
    }
    
    public ManageStudent(Vector <Student> v) {
        this.v = v;
    }
    
    public void AddNewCollege(){
        Student newC = new CollegeStudent();
        newC.Input();
        v.add(newC);
    }
    
    public void AddNewUniversity(){
        Student newU = new UniversityStu();
        newU.Input();
        v.add(newU);
    }
    
    public void removeBycode(){
        System.out.print("Enter student code: ");
        String code = sc.next();
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i).getStNumber().equals(code)){
                v.remove(i);
                System.out.println("Success");
            }
        }
    }
    
    public void PrintAll(){
        for (int i = 0; i < v.size(); i++) {
            v.get(i).Output();
        }
    }
    
    public void PrintEliGradu(){
        int i;
        for (i = 0; i < v.size(); i++) {
            if (v.get(i).CheckGraduation()){
                v.get(i).Output();
            }
        }
        System.out.println("Number of eligible student: " + i+1);
    }
    
    public void FindByName(){
        System.out.println("Enter name: ");
        String findName = sc.next();
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i).getName().equals(findName)){
                v.get(i).Output();
            }
        }
    }
    
    public void Sort(){
        v.sort(Student.compareClass);
        System.out.println("Success");
    }
}
