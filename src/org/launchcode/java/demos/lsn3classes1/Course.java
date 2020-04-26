package org.launchcode.java.demos.lsn3classes1;
import java.util.HashMap;

public class Course {
    private HashMap<String, Character> gradeBook = new HashMap<>();
    private String className;
    private String instructor;


   public String getCassName() {
       return className;
    }

    protected void setClassName(String aClassName){
       className = aClassName;
    }

    public String getInstructor(){
       return instructor;
    }
    protected void setInstructor(String aInstructor){
       instructor = aInstructor;
    }

    public HashMap getGradeBook(){
       return gradeBook;
    }




}
