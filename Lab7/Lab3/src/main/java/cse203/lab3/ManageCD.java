/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author haing
 */
public class ManageCD {
    private List<ObCD> listCD = new ArrayList<>();

    public List<ObCD> getListCD() {
        return listCD;
    }

    public void setListCD(List<ObCD> listCD) {
        this.listCD = listCD;
    }

    public ManageCD() {
    }
    
    public ManageCD(List<ObCD> listCD) {
        this.listCD = listCD;
    }
    
    public boolean AddCD(ObCD newCD){
        for (ObCD obCD : listCD) {
            if (obCD.getId() == newCD.getId()) {
                return false;
            }
        }
        listCD.add(newCD);
        return true;
    }
    
    public void SearchByTitle(){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        System.out.println("Input tilte: ");
        String searchTi = sc.next();
        for (int i = 0; i < listCD.size(); i++) {
            if(listCD.get(i).getTitle().equals(searchTi)){
                sb.append(listCD.get(i).toString()).append("\n");
                flag = true;
            }
        }
            if(!flag){
                sb.append("not found");
            }
        System.out.print(sb);
    }
    
     public void SearchByCollection(){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        System.out.println("Input collection: ");
        String searchCo = sc.next();
        for (int i = 0; i < listCD.size(); i++) {
            if(listCD.get(i).getCollection().equals(searchCo)){
                sb.append(listCD.get(i).toString()).append("\n");
                flag = true;
            }
        }
                    if(!flag){
                sb.append("not found");
            }
        System.out.print(sb);
    }
     
     public void SearchByType(){
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        System.out.println("Input type: ");
        String searchType = sc.next();
        for (int i = 0; i < listCD.size(); i++) {
            if(listCD.get(i).getType().equals(searchType)){
                sb.append(listCD.get(i).toString()).append("\n");
                flag = true;
            }
        }
                    if(!flag){
                sb.append("not found");
            }
        System.out.print(sb);
    }
    
    
    public void Delete(){
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
    
    public void Edit(){
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
    
    public void DisplayAll(){
        for (ObCD obCD : listCD) {
            System.out.println(obCD.toString());
        }
    }
    
    public void sortCD(){
        listCD.sort(ObCD.compareAboutID);   
    }
    
    
}
