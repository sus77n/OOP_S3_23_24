package lab1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Question1 {

    private long number;
    public Question1() {
    }
    
     public Question1(long number) {
         this.number = number;
    }
     public int SumFirstLastdigit(){
         int lastdigit = (int) (number % 10);
         int firstdigit = (int) number;
         while (firstdigit >= 10){
             firstdigit /= 10;
         }
         int sum = firstdigit + lastdigit;
         return (int) sum;
     }
}
