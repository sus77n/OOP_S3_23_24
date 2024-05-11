/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cse203.lab3_assignment2;

import java.util.Scanner;

/**
 *
 * @author haing
 */
public class Lab3_Assignment2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ManageEmployee manage = new ManageEmployee();
        int command = 0;
        do {            
            System.out.println("1. Add Full-time Employee (ArrayList)\n" +
"2. Add Part-time Employee (ArrayList)\n" +
"3. Show all Full-time Employee\n" +
"4. Show all Part-time Employee\n" +
"5. Show all Employee\n" +
"6. Search Employee by Id\n" +
"7. Delete Employee by Id\n" +
"8. Edit Employee information by Id\n" +
"9. Search Employee by payment\n" +
"10. Sort Full-time Employee and Part-Time employee in ascending order by age, payment.\n" +
"11. Exit \n" + "Number: ");
            command = sc.nextInt();
            switch (command) {
                case 1:
                    manage.AddFullTime();
                    break;
                case 2:
                    manage.AddPartTime();
                    break;
                case 3:
                    manage.ShowAllFullTime();
                    break;
                case 4:
                    manage.ShowAllPartTime();
                    break;
               case 5:
                    manage.ShowAllEmployee();
                    break;    
                case 6:
                    manage.SearchEmployeeByID();
                    break;
                case 7:
                    manage.Delete();
                    break;
                case 8:
                    manage.Edit();
                    break;
                case 9:
                    manage.SearchEmployeeByPayment();
                    break;
                case 10:
                    manage.SortAscending();
                    break;
                default:
                    System.out.println("Try again");
            }
            
        } while (command !=11);
    }
}
