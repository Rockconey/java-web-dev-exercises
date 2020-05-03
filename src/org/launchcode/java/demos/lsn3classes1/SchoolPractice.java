package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student me = new Student("Shaw", 1, 1, 4.0);
        me.setName("Shaw Coney");
        me.setStudentId(7519);
        me.setNumberOfCredits(1);
        me.setGpa(4.0);

        System.out.println("Please welcome " + me.getName());

        Course java = new Course();
        System.out.println(me.toString());

    }



}
