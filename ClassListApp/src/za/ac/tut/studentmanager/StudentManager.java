/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.studentmanager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import za.ac.tut.student.Student;
import za.ac.tut.studentinterface.StudentInterface;

/**
 *
 * @author Student
 */
public class StudentManager implements StudentInterface {

    List<Student> studentsList = new ArrayList<>();
 
    @Override
    public void addStudent(Student stu) {
        studentsList.add(stu);
        System.out.println("Student added");
    }

    @Override
    public void displayAllStudents() {
        System.out.println("List of Students");
        for(int i = 0 ; i < studentsList.size(); i++){
            String name = studentsList.get(i).getName() +" "+ studentsList.get(i).getSurname() + " "+studentsList.get(i).getStudentNumber() +" "+ studentsList.get(i).getListOfSubjects().get(i).getSubjCode() +" "+ studentsList.get(i).getListOfSubjects().get(i).getSubjName();
            System.out.println(name + "\n");
        }
        
    }

    @Override
    public void removeStudent(Student stu) {
        studentsList.remove(stu);
        System.out.println("Student removed");
    }

    @Override
    public void searchStudent(Student stu) {

        if (studentsList.contains(stu)) {
            System.out.println("Student found");
            //int index = studentsList.indexOf(stu);
           // studentsList.get(index);
           
        }else{
            System.out.println("Student not in list");
        }
    }

    @Override
    public void update(Student stu) {

        if (studentsList.contains(stu)) {
            int index = studentsList.indexOf(stu);
            studentsList.set(index, new Student());
            System.out.println("Student updated");
        }
    }

    @Override
    public void storeDetails(File file) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            for(int i = 0 ; i < studentsList.size(); i++){
                String data = studentsList.get(i).getName() + studentsList.get(i).getSurname() + studentsList.get(i).getStudentNumber() + studentsList.get(i).getListOfSubjects().get(i).getSubjCode() + studentsList.get(i).getListOfSubjects().get(i).getSubjName();
                bw.write(data);
                bw.newLine();
                bw.close();
            }
            System.out.println("Content added");
        } catch (IOException ex) {
          ex.getMessage();
        }
    }

}
