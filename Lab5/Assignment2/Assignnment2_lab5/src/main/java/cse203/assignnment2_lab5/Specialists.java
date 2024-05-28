/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.assignnment2_lab5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/**
 *
 * @author haing
 */
public class Specialists extends Staff {

    private List<String> eduProjectCode = new ArrayList<>();
    private int expYears;

    public Specialists() {
    }

    public Specialists(int expYears) {
        super();
        this.expYears = expYears;
    }

    public int findTProject() {
        int count = 0;
        for (int i = 0; i < eduProjectCode.size(); i++) {
            if (eduProjectCode.get(i).charAt(0) == 'T') {
                count++;
            }
        }
        return count;
    }

    @Override
    public void CalculateSalary() {
        salary = (double) ((expYears * 4 + findTProject()) * 18000);
    }

    @Override
    public void Input() throws InputMismatchException {
        super.Input();
        while (true) {
            try {
                System.out.print("Enter number of project: ");
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.print("Enter code of project " + (i + 1) + ": ");
                    eduProjectCode.add(sc.next());
                }
                break;
            } catch (Exception e) {
                System.out.print("Please enter number of project (integer)");
                sc.nextLine();
            }
        }

        while (true) {
            try {
                System.out.print("Enter number of experienced years: ");
                expYears = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.print("Please enter number of experienced years again (integer)");
                sc.nextLine();
            }
        }

    }

    public String toString() {
        String n = super.toString();
        n += "Experienced years: " + expYears + "\nNumber of project: " + eduProjectCode.size() + "are:\n";
        for (String string : eduProjectCode) {
            n += string + "\n";
        }
        n += "Salary: " + salary + "\n";
        return n;
    }
}
