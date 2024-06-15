/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.lab3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author haing
 */
public class ManageCD {
    private static List<ObCD> listCD = new ArrayList<>();

    public static List<ObCD> getListCD() {
        return listCD;
    }

    public static void setListCD(List<ObCD> listCD) {
        ManageCD.listCD = listCD;
    }

    public ManageCD() {
    }
    
    public ManageCD(List<ObCD> listCD) {
        this.listCD = listCD;
    }
    
    public static boolean AddCD(ObCD newCD){
        for (ObCD obCD : listCD) {
            if (obCD.getId() == newCD.getId()) {
                return false;
            }
        }
        listCD.add(newCD);
        return true;
    }
    public static boolean DeleteByTitle(String deTitle){
        boolean flag = false;
        for (int i = 0; i < listCD.size(); i++) {
            if(listCD.get(i).getTitle().equals(deTitle)){
                listCD.remove(i);
                flag = true;
            }
        }
        return flag;
    }
    public static List SearchByTitle(String Stitle){
        List<ObCD> list = new ArrayList<>();
        for (int i = 0; i < listCD.size(); i++) {
            if(listCD.get(i).getTitle().equals(Stitle)){
                list.add(listCD.get(i));
            }
        }
        return list;
    }
    
     public static List SearchByCollection(String Scollection){
         List<ObCD> list = new ArrayList<>();
        for (int i = 0; i < listCD.size(); i++) {
            if(listCD.get(i).getCollection().equals(Scollection)){
               list.add(listCD.get(i));
            }
        }
       return list;
    }
     
     public static List SearchByType(String Stype){
        List<ObCD> list = new ArrayList<>();
        for (int i = 0; i < listCD.size(); i++) {
            if(listCD.get(i).getType().equals(Stype)){
               list.add(listCD.get(i));
            }
        }
       return list;
    }
     
     public static List SearchByPrice(Double SPrice){
        List<ObCD> list = new ArrayList<>();
        for (int i = 0; i < listCD.size(); i++) {
            if(listCD.get(i).getType().equals(SPrice)){
               list.add(listCD.get(i));
            }
        }
       return list;
    }
    
    
    public static void Delete(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id: ");
        long deletedId = sc.nextLong();
        int index = Collections.binarySearch(listCD, new ObCD(deletedId,"","","",0, 0),ObCD.compareAboutID);
        if (index == -1) {
            System.out.println("not found");
        }
        else
        listCD.remove(index);
    }
    
    public static void Edit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id: ");
        long editId = sc.nextLong();
        int index = Collections.binarySearch(listCD, new ObCD(editId,"","","",0, 0),ObCD.compareAboutID);
        if (index == -1) {
            System.out.println("not found");
        }
        else{
        String obj = sc.next();
        listCD.get(index).Editob(obj);
        }
    }
    
    public static void DisplayAll(){
        for (ObCD obCD : listCD) {
            System.out.println(obCD.toString());
        }
    }
    
    public static void sortCD(){
        listCD.sort(ObCD.compareAboutID);   
    }
    
    
}
