/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse203.assignment1_lab6;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author haing
 */
public class NewStudentDialog extends JDialog {

    private JTextField studentId, lastName, midName, firstName, yearOfBirth;
    private JRadioButton male, female;
    private JComboBox schoolStage;
    private JButton btnSave, btnClear, btnCancel;
    private Student newStudent;

    public Student getNewStudent() {
        return newStudent;
    }

    public NewStudentDialog(Frame owner, String title) {
        
        super(owner, title);
        this.setSize(300, 300);
        this.setLocation(200, 200);
        //  pack();
        this.setLayout(new GridLayout(5, 1));
        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.add(new JLabel("Student ID"));
        studentId = new JTextField();
        studentId.setPreferredSize(new Dimension(200, 20));
        panel1.add(studentId);
        this.add(panel1);

        JPanel panel2 = new JPanel(new FlowLayout());
        panel2.add(new JLabel("Last-Mid-First name"));
        lastName = new JTextField();
        lastName.setPreferredSize(new Dimension(50, 20));
        midName = new JTextField();
        midName.setPreferredSize(new Dimension(50, 20));
        firstName = new JTextField();
        firstName.setPreferredSize(new Dimension(50, 20));
        panel2.add(lastName);
        panel2.add(midName);
        panel2.add(firstName);
        this.add(panel2);

        JPanel panel3 = new JPanel(new FlowLayout());
        panel3.add(new JLabel("Year of birth"));
        yearOfBirth = new JTextField();
        yearOfBirth.setPreferredSize(new Dimension(200, 20));
        panel3.add(yearOfBirth);
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup rndGroup = new ButtonGroup();
        rndGroup.add(male);
        rndGroup.add(female);
        panel3.add(male);
        panel3.add(female);
        this.add(panel3);
        String[] data = {"Elementary School", "Middle School", "High School"};
        schoolStage = new JComboBox(data);
        this.add(schoolStage);

        JPanel panel4 = new JPanel(new FlowLayout());
        btnSave = new JButton("Save");
        btnSave.addActionListener((e) -> {
            SaveStudent();
            setVisible(false);
        });
        btnClear = new JButton("Clear");
        btnCancel = new JButton("Cancel");
        panel4.add(btnSave);
        panel4.add(btnClear);
        panel4.add(btnCancel);
        this.add(panel4);
    }

    public void setNewStudent(Student newStudent) {
        this.newStudent = newStudent;
    }

    private void SaveStudent() {
        String id = studentId.getText();
        String last = lastName.getText();
        String mid = midName.getText();
        String first = firstName.getText();
        int yOb = Integer.parseInt(yearOfBirth.getText());
        String gender = male.isSelected() == true ? "Male" : "Female";
        String school = schoolStage.getSelectedItem().toString();
        newStudent = new Student(id, last, mid, first, yOb, gender, school);
    }
}
