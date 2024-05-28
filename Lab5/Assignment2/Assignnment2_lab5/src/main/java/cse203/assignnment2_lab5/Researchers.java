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
public class Researchers extends Staff {

    private List<String> projectCode = new ArrayList<>();
    private int numOfYearResearch;

    public Researchers() {
    }

    public Researchers(int numOfYearResearch) {
        super();
        this.numOfYearResearch = numOfYearResearch;
    }

    public int findNumOfProjectD() {
        int count = 0;
        for (int i = 0; i < projectCode.size(); i++) {
            if (projectCode.get(i).charAt(0) == 'D') {
                count++;
            }
        }
        return count;
    }

    @Override
    public void CalculateSalary() {
        salary = (double) ((numOfYearResearch * 2 + findNumOfProjectD()) * 20000);
    }

    @Override
    public void Input() {
        super.Input();
        while (true) {
            try {
                System.out.print("Enter number of project: ");
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.print("Enter code of project " + (i + 1) + ": ");
                    projectCode.add(sc.next());
                }
                break;
            } catch (Exception e) {
                System.out.print("Please enter number of project again (integer)");
                sc.nextLine();
            }
        }

        while (true) {
            try {
                System.out.print("Enter number of researched years: ");
                numOfYearResearch = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.print("Please enter number of researched years again (integer)");
                sc.nextLine();
            }
        }

    }

    public String toString() {
        String n = super.toString();
        n = n + "Number of project: " + n + "are:\n";
        for (String string : projectCode) {
            n += string + "\n";
        }
        n += "Salary: " + salary + "\n";
        return n;
    }
}
