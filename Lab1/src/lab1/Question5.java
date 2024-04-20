/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
import java.util.*;
/**
 *
 * @author Student
 */
public class Question5 {
    private List<Integer> list = new ArrayList<Integer>();
    

    public Question5() {
    }
    
    public Question5(List<Integer> list) {
        this.list = list;
    }
    
    public boolean RemoveQA(int removednum) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == removednum){
                list.remove(i);
                return true;
            }  
        }
        return false;
}
  
    public void InsertAtPositionQB(int pos, int insertNum){
        list.add(pos, insertNum);
        list.remove(list.size() - 1);
    }
    
    public List<Integer> FindDuplicateQC(){
        List<Integer> duplicates = new ArrayList<>();
        
        for (int i = 0; i < list.size(); i++) {
            
            for (int j = i + 1; j < list.size() - 1; j++) {
                if (list.get(i).equals(list.get(j))){
                    duplicates.add(list.get(i));
                }
            }
          
        }

        return duplicates;
    }
    
    public List<Integer> RemoveDuplicateQD(){
        
        for (int i = 0; i < list.size(); i++) {
            
            for (int j = i + 1; j < list.size() - 1; j++) {
                if (list.get(i).equals(list.get(j))){
                    list.remove(j);
                }
            }
          
        }

        return list;
    }
    
    public void Output(){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
    
}
