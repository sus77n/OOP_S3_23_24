/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.assignnment2_lab5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author haing
 */
public class ListStaff extends ArrayList<Staff>  {
    Scanner sc = new Scanner (System.in);
    
    public ListStaff(){
        super();
    }
    
    public void addLecture(){
        Staff lec = new Lecturers();
        lec.Input();
        this.add(lec);
        savaToFile("D:\\cse203\\Assignment2_Lab5\\EiuStaff.eiu.txt");
    }
    
    public void addResearch(){
        Staff res = new Researchers();
        try{
          res.Input();  
        }
        catch (InputMismatchException e){
            System.out.println(e);
        }
        this.add(res);
         savaToFile("D:\\cse203\\Assignment2_Lab5\\EiuStaff.eiu.txt");
    }
    
    public void addTeachingAssitant(){
        Staff ta = new TeachingAssistant();
        try {
        ta.Input();
        }
        catch (InputMismatchException e){
            
        }
        this.add(ta);
    }
    
    public void addSpecialist(){
        Staff sp = new Specialists();
        sp.Input();
        this.add(sp);
        savaToFile("D:\\cse203\\Assignment2_Lab5\\EiuStaff.eiu.txt");
    }
    
    public void savaToFile(String fName){
        if (this.size() == 0){
            System.out.println("Empty list");
            return;
        }
        try {
            File f = new File(fName);
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for (Staff st : this){
                pw.println(st.toString());
            }
            pw.close();
            fw.close();        
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    

}
