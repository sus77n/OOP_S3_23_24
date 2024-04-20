/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Student
 */
public class Question2 {
    private int[] arrThreenums = new int[3];

    public Question2() {
    }
    
    public Question2(int[] arrThreenums) {
        this.arrThreenums = arrThreenums;
    }
   
    public int Findmin(){
        int min = arrThreenums[0];
        for (int i = 0; i < arrThreenums.length; i++) {
           if (arrThreenums[i] < min){
               min = arrThreenums[i];
           }          
        }
        return min;
    }
    
    
}
