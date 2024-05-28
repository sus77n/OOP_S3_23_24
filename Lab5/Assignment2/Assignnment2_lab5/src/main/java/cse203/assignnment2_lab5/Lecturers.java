/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.assignnment2_lab5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author haing
 */
public class Lecturers extends Staff {

    private int academicRank;
    private String academicDegree;
    private int teachingYears;
    private List<String> taughtSubject = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Lecturers() {
    }

    public Lecturers(int academicRank, String academicDegree, int teachingYears, List<String> taughtSubject) {
        super();
        this.academicRank = academicRank;
        this.academicDegree = academicDegree;
        this.teachingYears = teachingYears;
        this.taughtSubject = taughtSubject;
    }

    @Override
    public void CalculateSalary() {
        salary = (taughtSubject.size() * teachingYears * 0.12) * 20000;
    }

    @Override
    public void Input() {
        super.Input();
        while (true) {
            try {
                System.out.print("Enter academic rank: ");
                academicRank = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.print("Please enter academic rank again (integer)");
                sc.nextLine();
            }
        }

        System.out.print("Enter academic degree: ");
        academicDegree = sc.next();

        while (true) {
            try {
                System.out.print("Enter number of teaching years: ");
                teachingYears = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.print("Please enter teaching years again (integer)");
                sc.nextLine();
            }
        }

        while (true) {
            try {
                System.out.print("Enter number of taught subjects: ");
                int n = sc.nextInt();

                for (int i = 0; i < n; i++) {
                    System.out.print("Enter subject " + (i + 1) + ": ");
                    taughtSubject.add(sc.next());
                }

                break;
            } catch (Exception e) {
                System.out.print("Please enter number of taught subjects again (integer)");
                sc.nextLine();
            }
        }

    }

    public String toString() {
        String n = super.toString();
        n = n + "Academic rank: " + academicRank + "\nAcademic degree: " + academicDegree + "\nNumber of teaching years: " + teachingYears + "\nNumber of taught subjects: " + taughtSubject + "are:\n";
        for (String string : taughtSubject) {
            n += string + "\n";
        }
        n += "Salary: " + salary + "\n";
        return n;
    }
}
