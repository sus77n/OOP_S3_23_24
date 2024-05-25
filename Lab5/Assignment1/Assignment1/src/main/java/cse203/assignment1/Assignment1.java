/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cse203.assignment1;

import java.util.Scanner;

/**
 *
 * @author haing
 */
public class Assignment1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0 ;
        ManageStudent manage = new ManageStudent();
        while(n!=8){
            System.out.println("Choose command: \n1. Add a new college student.\n" +
                                "2. Add a new university student.\n" +
                                "3. Remove a student from the list with the student code entered from the keyboard.\n" +
                                "4. Print student list.\n" +
                                "5. Print the list of students eligible for graduation and indicate the number of eligible\n" +
                                "students.\n" +
                                "6. Sort the student list ascending by Student type (College, university) and student code\n" +
                                "7. Find student list by student's full name (Contains).\n" +
                                "8. Exit");
            n = sc.nextInt();
            
            switch (n) {
                case 1:
                    manage.AddNewCollege();
                    break;
                case 2:
                    manage.AddNewUniversity();
                    break;
                case 3:
                    manage.removeBycode();
                    break;
                case 4:
                    manage.PrintAll();
                    break;
                case 5:
                    manage.PrintEliGradu();
                    break;
                case 6:
                    manage.Sort();
                    break;
                case 7:
                    manage.FindByName();
                    break;
            }
        }
    }
}
