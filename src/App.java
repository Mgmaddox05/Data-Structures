import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        int choice = 1;

        while(choice != 5)
        {
            System.out.println("Student Menu: ");
            System.out.println("1 - Add Student");
            System.out.println("2 - Delete Student");
            System.out.println("3 - Find Student");
            System.out.println("4 - Show Students");
            System.out.println("5 - Exit and Go home");
            System.out.println("enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter student ID: ");
                    String stuID = scanner.nextLine();
                    
                    System.out.println("Enter Student Name: ");
                    String stuName = scanner.nextLine();
                    Student stu = new Student(stuName);
                    System.out.println("New Victim added!");
                    students.put(stuID , stu);
                    System.out.println(students);
                    break;
                
                case 2:
                    System.out.println("Enter the Students' ID you want to remove: ");
                    stuID = scanner.nextLine();

                    Student removedStudent =students.remove(stuID);
                    if (removedStudent != null) {
                        System.out.println("Student deleted: " + removedStudent.getName());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.println("Enter victims' ID to be found: ");
                    stuID = scanner.nextLine();
                    Student foundStudent = students.get(stuID);
                    if (foundStudent != null) {
                        System.out.println("Student found: " + foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("List of all students:");
                    for (Student student : students.values()) {
                        System.out.println(student);
                    }
                    break;
                
                case 5:
                    System.out.println("Go Find more victims to find!");
                    System.exit(1);
                    
                    


                    
            }
        }
    }
}
