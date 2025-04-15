import java.util.Scanner;
public class Schooltest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Details: ");
        System.out.print("Name: ");
        String studentName =scanner.nextLine();
        System.out.print("ID: ");
        int studentID = scanner.nextInt();
        System.out.print("GradeLevel: "); 
        String studentGradeLevel = scanner.nextLine();
        scanner.nextLine();

        Students student = new Students (studentName, studentID, studentGradeLevel);


        System.out.println("Enter Teacher Details: ");
        System.out.print("Name: ");
        String teacherName =scanner.nextLine();
        System.out.print("ID: ");
        int teacherID = scanner.nextInt();
        System.out.print("Subject: "); 
        String teacherSubject = scanner.nextLine();
        scanner.nextLine();

        Teacher teacher = new Teacher (teacherName, teacherID, teacherSubject);


        System.out.println("Enter Staff Details: ");
        System.out.print("Name: ");
        String staffName =scanner.nextLine();
        System.out.print("ID: ");
        int staffID = scanner.nextInt();
        System.out.print("Department: "); 
        String staffDepartment = scanner.nextLine();
        scanner.nextLine();

        Staff staff = new Staff (staffName, staffID, staffDepartment);

        System.out.println("\nStudent Details: ");
        student.displayInfo();

        System.out.println("\nTeacher Details: ");
        teacher.displayInfo();

        System.out.println("\nStaff Details: ");
        staff.displayInfo();

        scanner.close();

    }
}