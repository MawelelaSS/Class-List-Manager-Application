/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.studentinterface;

import java.io.File;
import java.util.List;
import za.ac.tut.student.Student;

/**
 *
 * @author Student
 */
public interface StudentInterface {
    
    public void addStudent(Student stu);
    public void displayAllStudents();
    public void removeStudent(Student stu);
    public void searchStudent(Student stu);
    public void update(Student stu);
    public void storeDetails(File file);
    
}
