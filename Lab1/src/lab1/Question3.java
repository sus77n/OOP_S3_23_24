/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Student
 */
public class Question3 {
    private int num;

    public Question3() {
    }
    
    public Question3(int num) {
        this.num = num;
    }
    
    public void findHailstonesequence(){
        while (num > 1){
            if (num % 2 == 0){
                num/=2;
            } else {
                num = num * 3 + 1;
            }
            System.out.println(num); 
        }
    }
    
    
}
