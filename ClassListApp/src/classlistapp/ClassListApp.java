/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classlistapp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import za.ac.tut.student.Student;
import za.ac.tut.studentmanager.StudentManager;
import za.ac.tut.subject.Subject;

/**
 *
 * @author Student
 */
public class ClassListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Subject sub1 = new Subject("Object oriented programming", "OOP");
        Subject sub2 = new Subject("Advanced Object oriented programming", "OOP");
        
        List<Subject> listOfSubjects = new ArrayList<>();
        listOfSubjects.add(sub1);
        listOfSubjects.add(sub2);
        
        Student stu1 = new Student("Sibusiso", "Mawelela", "221834178",listOfSubjects);
        Student stu2 = new Student("Sicelo", "Mawelela", "22156225",listOfSubjects);
        
        
        StudentManager stuMan = new StudentManager();
        stuMan.addStudent(stu1);
        stuMan.addStudent(stu2);
        
         stuMan.displayAllStudents();
        
        
         /*  System.out.println("\n");
         stuMan.removeStudent(stu2);
         stuMan.displayAllStudents();*/
       //searching student
       /*stuMan.searchStudent(stu2);*/
       
       //updating student
        //stuMan.update(stu2);
        
        
        //storing contents to a file
        
        /*  File file = new File("students File.txt");
        if (file.exists()) {
        System.out.println("File exist");
        stuMan.storeDetails(file);
        System.out.println("Students Content Added to File " + file.getName());
        
        }
        else{
        System.out.println("File do not exist");
        file.createNewFile();
        stuMan.storeDetails(file);
        }*/
        
    }
    
}
