/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cse203.assignment1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author haing
 */
public class Assignment1 {

    public static void main(String[] args) throws IOException {
        String filename = "D:\\Assignment1_Lab5\\Student.dat";
        Scanner sc = new Scanner(System.in);
        int n = 0;
        ManageStudent manage = new ManageStudent();
        manage.loadFile(filename);
        while (n != 8) {
            System.out.println("Choose command: \n1. Add a new college student.\n"
                    + "2. Add a new university student.\n"
                    + "3. Remove a student from the list with the student code entered from the keyboard.\n"
                    + "4. Print student list.\n"
                    + "5. Print the list of students eligible for graduation and indicate the number of eligible\n"
                    + "students.\n"
                    + "6. Sort the student list ascending by Student type (College, university) and student code\n"
                    + "7. Find student list by student's full name (Contains).\n"
                    + "8. Exit");
            System.out.print("Choose: ");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    manage.AddNewCollege();
                    manage.saveToFile(filename);
                    break;
                case 2:
                    manage.AddNewUniversity();
                    manage.saveToFile(filename);
                    break;
                case 3:
                    manage.removeBycode();
                    manage.saveToFile(filename);
                    break;
                case 4:
                    manage.PrintAll();
                    break;
                case 5:
                    manage.PrintEliGradu();
                    break;
                case 6:
                    manage.Sort();
                    manage.saveToFile(filename);
                    break;
                case 7:
                    manage.FindByName();
                    break;
            }
        }
    }
}
