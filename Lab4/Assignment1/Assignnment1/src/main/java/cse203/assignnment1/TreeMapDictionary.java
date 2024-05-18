/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.assignnment1;

import static cse203.assignnment1.DictionaryEngViet.sc;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author haing
 */
public class TreeMapDictionary {
    static Scanner sc = new Scanner(System.in);
    private TreeMap<String, String> treeMap = new TreeMap<>();

    public TreeMapDictionary() {
    }
    
    public TreeMapDictionary(TreeMap<String, String> treeMap) {
        this.treeMap= treeMap;
    }
    
    public void Input(){
        for (int i = 0; i < 10; i++) {
           System.out.print("Enter word(English Vietnamese): ");
           treeMap.put(sc.next(), sc.next());
        }
    }
    
    public void mainRequest(){
        System.out.print("Enter english word: ");
        String word = sc.next();
        if (treeMap.containsKey(word)){
            System.out.println("Meaning is: " + treeMap.get(word));
        } else {
            System.out.println("Dictionary do not have this word");
        }
    }
}
