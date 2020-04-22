package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapStudentIds {
    public static void main(String[] args){

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")){
                System.out.println("Student ID: ");
                Integer newId = input.nextInt();
                students.put(newId, newStudent);

                input.nextLine();
            }
        } while (!newStudent.equals(""));
            System.out.println("\nClass Roster: ");

            for (Map.Entry<Integer, String> student : students.entrySet()) {
                System.out.println(student.getKey() + ": " + student.getValue());


            }
        }
    }
