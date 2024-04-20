/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        int num = 3;
        String str = "abba";
        Question6 q6 = new Question6(str);
        System.out.print(q6.checkPalindrome());
    }
    
}
