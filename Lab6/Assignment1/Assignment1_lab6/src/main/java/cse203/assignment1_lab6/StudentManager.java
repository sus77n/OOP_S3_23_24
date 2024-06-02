/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.assignment1_lab6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author haing
 */
public class StudentManager {

    private ArrayList<Student> arrs = new ArrayList<>();

    public ArrayList<Student> getArrs() {
        return arrs;
    }

    public void setArrs(ArrayList<Student> arrs) {
        this.arrs = arrs;
    }

    public StudentManager() {
    }

    public boolean DeleteStudent(String studentId) {
        for (int i = 0; i < arrs.size(); i++) {
            if (arrs.get(i).getStudentID().equals(studentId)) {
                arrs.remove(i);
            }
        }
        return true;
    }

    public boolean AddStudent(Student stu) {
        for (Student s : arrs) {
            if (s.getStudentID().equals(stu.getStudentID())) {
                return false;
            }
        }
        arrs.add(stu);
        return true;
    }

    public ArrayList<Student> getStudentTableModel() {
        return arrs;
    }
}
