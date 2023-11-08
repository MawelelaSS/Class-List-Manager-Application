/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.subject;

/**
 *
 * @author Student
 */
public class Subject {

    private String subjName;
    private String subjCode;

    public Subject() {
        this.subjName = "Advanced object oriented";
        this.subjCode = "AOP216D";
    }

    public Subject(String subjName, String subjCode) {
        this.subjName = subjName;
        this.subjCode = subjCode;
    }

    public String getSubjName() {
        return subjName;
    }

    public void setSubjName(String subjName) {
        this.subjName = subjName;
    }

    public String getSubjCode() {
        return subjCode;
    }

    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }
 
}
