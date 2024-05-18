/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.assignnment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author haing
 */
public class DictionaryEngViet {
    static Scanner sc = new Scanner(System.in);
    private Map<String, String> hashmap = new HashMap<>();

    public DictionaryEngViet() {
    }
    
    public DictionaryEngViet(Map<String, String> hashmap) {
        this.hashmap = hashmap;
    }
    
    public void Input(){
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter word(English Vietnamese): ");
            hashmap.put(sc.next(), sc.next());
        }
    }
    
    public void CheckContains(){
        System.out.print("Enter english word: ");
        String word = sc.next();
        if (hashmap.containsKey(word)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    public void FindMeaning(){
        System.out.print("Enter english word: ");
        String word = sc.next();
        System.out.println("Meaning is: " + hashmap.get(word));
    }
    
    public void MainRequest(){
        System.out.print("Enter english word: ");
        String word = sc.next();
        if (hashmap.containsKey(word)){
            System.out.println("Meaning is: " + hashmap.get(word));
        } else {
            System.out.println("Dictionary do not have this word");
        }
    }
}
