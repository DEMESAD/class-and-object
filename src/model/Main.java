package model;
import model.Student;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
        student.setName("kyle");
        student.setgender("male");
        student.setStudentAge(18);
        student.setStudentNumber(1001);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Gendere: " + student.getGender());
        System.out.println("Student Age: " + student.getStudentAge());
        System.out.println("Student Number: " + student.getStudentNumber());

	}

}
