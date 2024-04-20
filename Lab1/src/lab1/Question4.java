/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Student
 */
public class Question4 {
    private int [] nums;

    public Question4() {
    }

    public Question4(int[] nums) {
        this.nums = nums;
    }
    
    public long findSumEven(){
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                sum +=nums[i];
            }
            
        }
        return sum;
    }
}
