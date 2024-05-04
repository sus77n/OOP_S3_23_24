/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.complexnumber;

/**
 *
 * @author Student
 */
public class ComplexNumber {

    public static void main(String[] args) {
        ComplexNum cp1 = new ComplexNum();
        ComplexNum cp2 = new ComplexNum(2, 3);
        cp1.Input();
        cp1.Print();
        ComplexNum plus = cp1.Plus(cp2);
        ComplexNum minus = cp1.Minus(cp2);
        ComplexNum multiply = cp1.Multiply(cp2);
        plus.Print();
        minus.Print();
        multiply.Print();
    }
}
