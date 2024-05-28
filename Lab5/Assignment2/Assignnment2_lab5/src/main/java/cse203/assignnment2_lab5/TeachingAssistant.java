/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.assignnment2_lab5;

import java.util.InputMismatchException;

/**
 *
 * @author haing
 */
public class TeachingAssistant extends Staff {

    private int numOfSubs;

    public TeachingAssistant() {
    }

    public TeachingAssistant(int numOfSubs) {
        super();
        this.numOfSubs = numOfSubs;
    }

    @Override
    public void CalculateSalary() {
        salary = (numOfSubs * 0.3) * 18000;
    }

    @Override
    public void Input() throws InputMismatchException {
        super.Input();
        while (true) {
            try {
                System.out.print("Enter number of subject assist: ");
                numOfSubs = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.print("Please enter number of subject assist again (integer)");
                sc.nextLine();
            }
        }

    }

    public String toString() {
        String n = super.toString();
        n = n + "Number of subject: " + numOfSubs + "\nSalary: " + salary + "\n";
        return n;
    }
}
