/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.student;

import java.util.ArrayList;
import java.util.List;
import za.ac.tut.subject.Subject;

/**
 *
 * @author Student
 */
public class Student {

    private String name;
    private String surname;
    private String studentNumber;
    private List<Subject> listOfSubjects;

    public Student() {
        this.name = "name";
        this.surname = "surname";
        this.studentNumber = "student Number";
        this.listOfSubjects = new ArrayList<>();
    }

    public Student(String name, String surname, String studentNumber, List<Subject> listOfSubjects) {
        this.name = name;
        this.surname = surname;
        this.studentNumber = studentNumber;
        this.listOfSubjects = listOfSubjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public List<Subject> getListOfSubjects() {
        return listOfSubjects;
    }

    public void setListOfSubjects(List<Subject> listOfSubjects) {
        this.listOfSubjects = listOfSubjects;
    }

    @Override
    public String toString() {
        return  name + ", " + surname + ", " + studentNumber + ", " + listOfSubjects;
    }
    
    

}
