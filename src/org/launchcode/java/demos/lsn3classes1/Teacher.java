package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private Integer yearsTeaching;

    public String getFirstName(){
        return firstName;
    }

    protected void setFirstName(String aFirstName){
        firstName = aFirstName;
    }

    public String getLastName(){
        return lastName;
    }

    protected void setLastName(String aLastName){
        lastName = aLastName;
    }

    public String getSubject(){
        return subject;
    }

    protected void setSubject(String aSubject){
        subject = aSubject;
    }

    public Integer getYearsTeaching(){
        return yearsTeaching;
    }

    protected void setYearsTeaching(Integer aYearsTeaching){
        yearsTeaching = aYearsTeaching;
    }
}
