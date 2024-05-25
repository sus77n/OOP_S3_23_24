/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.assignment1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Vector;
import java.io.*;

/**
 *
 * @author haing
 */
public class ManageStudent extends Vector<Student> {

    static Scanner sc = new Scanner(System.in);

    public ManageStudent() {
    }

    public void AddNewCollege() {
        Student newC = new CollegeStudent();
        newC.Input();
        this.add(newC);
    }

    public void AddNewUniversity() {
        Student newU = new UniversityStu();
        newU.Input();
        this.add(newU);
    }

    public void removeBycode() {
        System.out.print("Enter student code: ");
        String code = sc.next();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getStNumber().equals(code)) {
                this.remove(i);
                System.out.println("Success");
            }
        }
    }

    public void PrintAll() {
        for (int i = 0; i < this.size(); i++) {
            this.get(i).Output();
        }
    }

    public void PrintEliGradu() {
        int count = 0;
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).CheckGraduation()) {
                this.get(i).Output();
                count++;
            }
        }
        System.out.println("Number of eligible student: " + count);
    }

    public void FindByName() {
        System.out.println("Enter name: ");
        String findName = sc.next();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getName().equals(findName)) {
                this.get(i).Output();
            }
        }
    }

    public void Sort() {
        this.sort(Student.compareClass);
        System.out.println("Success");
    }

    public void saveToFile(String fName) {
        if (this.size() == 0) {
            System.out.println("Empty list");
            return;
        }
        try {
            FileOutputStream f = new FileOutputStream(fName);
            ObjectOutputStream fo = new ObjectOutputStream(f);
            for (Student st : this) {
                fo.writeObject(st);
            }
            fo.close();
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void loadFile(String fname) throws FileNotFoundException, IOException {
        if (this.size() > 0) {
            this.clear();
        }
        try {
            File f = new File(fname);
            if (!f.exists()) {
                return;
            }
            FileInputStream fi = new FileInputStream(f);
            ObjectInputStream fo = new ObjectInputStream(fi);
            Student st;
            while((st = (Student) (fo.readObject())) != null)
            {
                this.add(st);
            }
            fo.close();
            fi.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
