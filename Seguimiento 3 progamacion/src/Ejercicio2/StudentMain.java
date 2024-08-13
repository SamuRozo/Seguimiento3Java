package Ejercicio2;

public class StudentMain {
    public static void main(String[] args) {
        // Create a student with basic attributes
        Student student1 = new Student("Juan", "Sanchez", 10, 15, 4.5, "Maria Zapata", "Carlos Sanchez");
        student1.printInfo();

        // Create a student with basic attributes + 1 contact number
        Student student2 = new Student("Anna", "Martinez", 11, 16, 4.8, "Laura Martinez", "George Aguilar", "1234567890");
        student2.printInfo();

        // Create a student with basic attributes + 2 contact numbers
        Student student3 = new Student("Luis", "Ramirez", 9, 14, 4.2, "Carmen Ramirez", "Manuel Ramirez", "0987654321", "1122334455");
        student3.printInfo();
    }
}
