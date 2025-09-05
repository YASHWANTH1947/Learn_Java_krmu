import java.util.Scanner;

class Student{
    String rollNo;
 String name;
 String course;
 double marks;
 String grade;
 Scanner sc = new Scanner(System.in);

public void inputStudentDetails(){
    System.out.println("Enter Roll Number:");
    rollNo = sc.nextLine();
    System.out.println("Enter Name:");
    name = sc.nextLine();
    System.out.println("Enter Course:");
    course = sc.nextLine();
    System.out.println("Enter Marks:");
    marks = sc.nextDouble();
    calculateGrade();
}

public void calculateGrade(){
    if (marks >= 90) grade = "A+";
 else if (marks >= 80) grade = "A";
 else if (marks >= 70) grade = "B";
 else if (marks >= 60) grade = "C";
 else if (marks >= 50) grade = "D";
 else grade = "F";

}
public void displayStudentDetails(){
    System.out.println("Roll No: " + rollNo);
 System.out.println("Name: " + name);
 System.out.println("Course: " + course);
 System.out.println("Marks: " + marks);
 System.out.println("Grade: " + grade);
 System.out.println("-----------------------------------");

}

}
class StudentManagementSystem{
    Student[] students;
    int count;
    Scanner sc = new Scanner(System.in);
public void initializeSystem(int size){
    students = new Student[size];
    count = 0;}
    public void addStudent(){
        if(count < students.length){
            Student student = new Student();
            student.inputStudentDetails();
            students[count] = student;
            count++;
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Student list is full.");
        }
    }
    public void displayAllStudents(){
        if(count == 0){
            System.out.println("No students to display.");
        } else {
            for(int i = 0; i < count; i++){
                students[i].displayStudentDetails();
            }
        }
    }


}

public class Lab_assignment_1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();
        System.out.println("Enter the number of students:");
        int totalStudents = sc.nextInt();
        sms.initializeSystem(totalStudents);
        boolean exit = true;
        while(exit){
            System.out.println("Choose an option:");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    sms.addStudent();
                    break;
                case 2:
                    sms.displayAllStudents();
                    break;
                case 3:
                    exit = false;
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}