/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankaccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class BankAccount {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.Input();
        bank.Print();
        bank.TransferMoney();
    }
}
