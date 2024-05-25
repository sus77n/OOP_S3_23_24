/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.assignment1;

import java.util.Scanner;

/**
 *
 * @author haing
 */
public class CollegeStudent extends Student {
    static Scanner sc = new Scanner(System.in);
    private double gradExamScore;

    public CollegeStudent() {
    }

    public CollegeStudent(double gradExemScore) {
        super();
        this.gradExamScore = gradExemScore;
    }
    
    @Override
    public void Input(){
        super.Input();
        System.out.print("Enter graduation exam score: ");
        gradExamScore = sc.nextDouble();
    }
    
    @Override
    public void Output(){
        super.Output();
        System.out.println("Graduation exam score: " + gradExamScore);
    }

    
    @Override
    public boolean CheckGraduation(){
        if (gradExamScore < 5 ){
            return false;
        }
        return super.CheckGraduation();
    }
    
   
    
    
}
