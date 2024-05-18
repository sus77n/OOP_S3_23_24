/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.assignment2;

import java.util.Scanner;

/**
 *
 * @author haing
 */
public class BankFactory {
    static Scanner sc = new Scanner(System.in);
    private String bankName;

    public BankFactory(String bankName) {
        this.bankName = bankName;
    }

    public BankFactory() {
    }
    
    public static void getBank(){
        System.out.println("Choose bank: \n 1.Vietcombank \n 2.TPbank");
        int n = sc.nextInt();
        switch(n){
            case 1:
                Bank vc = new Vietcombank();
                System.out.println(vc.getBankName());
                break;
            case 2:
                Bank tp = new TPbank();
                System.out.println(tp.getBankName());
                break;
        }
    }
}
