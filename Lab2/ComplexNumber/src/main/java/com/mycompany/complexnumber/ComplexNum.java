/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complexnumber;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ComplexNum {
    private double re;
    private double im;

    public ComplexNum() {
    }

        
    public ComplexNum(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
     
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input re: ");
        re = sc.nextDouble();
        System.out.println("Input im: ");
        im = sc.nextDouble();  
    }
    
    public void Print(){
        System.out.println(re + "+" + im);
    }
    
    public ComplexNum Plus(ComplexNum cp2){
        double resultRe = this.re + cp2.re;
        double resultIm = this.im + cp2.im;
        ComplexNum result = new ComplexNum(resultRe, resultIm);
        return result;
    }
    
    public ComplexNum Minus(ComplexNum cp2){
        double resultRe = this.re - cp2.re;
        double resultIm = this.im - cp2.im;
        ComplexNum result = new ComplexNum(resultRe, resultIm);
        return result;
    }
    
    public ComplexNum Multiply(ComplexNum cp2){
        double resultRe = (this.re*cp2.re) - (this.im*cp2.im); 
        double resultIm = (this.re*cp2.im) + (this.im*cp2.re);
        ComplexNum result = new ComplexNum(resultRe, resultIm);
        return result;
    }
}
