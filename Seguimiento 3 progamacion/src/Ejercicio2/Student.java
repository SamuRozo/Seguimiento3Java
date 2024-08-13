package Ejercicio2;


import java.util.Arrays;

public class Student {

        private String firstName;
        private String lastName;
        private int grade;
        private int age;
        private double academicAverage;
        private String motherName;
        private String fatherName;
        private String[] contactNumbers;


        public Student(String firstName, String lastName, int grade, int age, double academicAverage,
                       String motherName, String fatherName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
            this.age = age;
            this.academicAverage = academicAverage;
            this.motherName = motherName;
            this.fatherName = fatherName;
            this.contactNumbers = new String[0];
        }


        public Student(String firstName, String lastName, int grade, int age, double academicAverage,
                       String motherName, String fatherName, String contactNumber) {
            this(firstName, lastName, grade, age, academicAverage, motherName, fatherName);
            this.contactNumbers = new String[1];
            this.contactNumbers[0] = contactNumber; // Add the contact number to the array
        }


        public Student(String firstName, String lastName, int grade, int age, double academicAverage,
                       String motherName, String fatherName, String contactNumber1, String contactNumber2) {
            this(firstName, lastName, grade, age, academicAverage, motherName, fatherName);
            this.contactNumbers = new String[2];
            this.contactNumbers[0] = contactNumber1;
            this.contactNumbers[1] = contactNumber2;
        }


        public void printInfo() {
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Grade: " + grade);
            System.out.println("Age: " + age);
            System.out.println("Academic Average: " + academicAverage);
            System.out.println("Mother's Name: " + motherName);
            System.out.println("Father's Name: " + fatherName);
            System.out.print("Contact Numbers: ");
            for (String number : contactNumbers) {
                System.out.print(number + " ");
            }
            System.out.println("\n-----------------------------------");
        }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                ", age=" + age +
                ", academicAverage=" + academicAverage +
                ", motherName='" + motherName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", contactNumbers=" + Arrays.toString(contactNumbers) +
                '}';
    }
}

