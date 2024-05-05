/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cse203.manageemployee;

/**
 *
 * @author haing
 */
public class ManageEmployee {

    public static void main(String[] args) {
        salaries manageSalary = new salaries();
        manageSalary.Input();
        manageSalary.PrintSalarySheet();
        manageSalary.HighestSalary();
        manageSalary.DecreaseSalary();
    }
}
