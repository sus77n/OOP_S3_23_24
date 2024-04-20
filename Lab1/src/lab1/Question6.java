/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Student
 */
public class Question6 {
    private String str;

    public Question6() {
    }

    public Question6(String str) {
        this.str = str;
    }
    
    public int findLengthQA(){
        return str.length();
    }
    
    public int findWordQB(){
        boolean word = false;
        int numofWord = 0;
        int end = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i)) && i!= end){
                word = true;
            } else if (!Character.isLetter(str.charAt(i)) && word){
                numofWord++;
                word = false;
            } else if((Character.isLetter(str.charAt(i))) && (i == end)){
                numofWord ++;
            }
        }
        return numofWord;
    }
    
    public String ConcatenateQC(String str2){
        String newStr = str + " " + str2;
        return newStr;
    }
    
    public boolean checkPalindrome(){
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        String newStr = sb.toString();
        if (str.equals(newStr)){
            return true;
        } else {
            return false;
        }
    }
}
