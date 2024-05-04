/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankaccount;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class BAccount {
    private int mAccNum;
    private String mName;
    private double mBalance;

    public BAccount(int mAccNum, String mName, double mBalance) {
        this.mAccNum = mAccNum;
        this.mName = mName;
        this.mBalance = mBalance;
    }

    public BAccount() {
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input account number: ");
        this.mAccNum = sc.nextInt();
        System.out.print("Input name: ");
        this.mName = sc.next();
        System.out.print("Input balance: ");
        this.mBalance = sc.nextDouble();
    }
    
    public void Deposit(double deposit){
        mBalance += deposit;
    }
    
    
    public boolean Withdraw(double withdraw){
        if (withdraw < 0) return false;
        if (mBalance < withdraw) return false;
        mBalance -= withdraw;
        return true;
    }
    
    public boolean transferMoney(BAccount acc2, double money){
        if (money < 0) return false;
        if (mBalance < money) return false;
        this.Withdraw(money);
        acc2.Deposit(money);
        return true;
    }
    
    public String toString(){
        String s = String.valueOf(mBalance);
        return s;
    }
    
    public void Print(){
        System.out.println("Account number: " +mAccNum);
        System.out.println("Account name: " +mName);
        System.out.println("Account balance: " +mBalance);
    }
   
    public boolean Compare(int acc){
        return acc== this.mAccNum;
    }
}
