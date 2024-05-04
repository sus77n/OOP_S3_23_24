/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankaccount;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Bank {
    ArrayList<BAccount> listAcc = new ArrayList<>();

    public Bank() {
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            BAccount acc= new BAccount();
            acc.Input();
            listAcc.add(acc);
        }
    }
    
    public void Print(){
        for (int i = 0; i < listAcc.size(); i++) {
            listAcc.get(i).Print();
        }
    }
    
    public void DepositAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input account number: ");
        int accNum = sc.nextInt();
        System.out.println("Input money: ");
        double money = sc.nextDouble();
        for (int i = 0; i < listAcc.size(); i++) {
            if (listAcc.get(i).Compare(accNum)){
                listAcc.get(i).Deposit(money);
                System.out.println("Success");
            }
        }
        System.out.println("not found account");
    }
    
    public void WithDrawAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input account number: ");
        int accNum = sc.nextInt();
        System.out.print("Input withdraw: ");
        double money = sc.nextDouble();
        for (int i = 0; i < listAcc.size(); i++) {
            if (listAcc.get(i).Compare(accNum)){
                listAcc.get(i).Withdraw(money);
                System.out.println("Success");
            }
        }
      System.out.println("not found account");
    }
    
    public void TransferMoney(){
        int accSend, accRe;
        double money;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input money: ");
        money = sc.nextDouble();
        System.out.print("Input account send: ");
        accSend = sc.nextInt();
        System.out.print("Input account recieve: ");
        accRe = sc.nextInt();
        BAccount accountSend = null;
        for (int i = 0; i < listAcc.size(); i++) {
            if (listAcc.get(i).Compare(accSend)){
                accountSend = listAcc.get(i);
            }
        }
        BAccount accountRecieve = null;
        for (int i = 0; i < listAcc.size(); i++) {
            if (listAcc.get(i).Compare(accRe)){
                accountRecieve = listAcc.get(i);
            }
        }
     
        if (accountRecieve != null && accountSend != null){
            accountSend.transferMoney(accountRecieve, money);
            accountSend.Print();
            accountRecieve.Print();
        } else {
            System.out.println("not found account");
        }
       
    }
    

}
