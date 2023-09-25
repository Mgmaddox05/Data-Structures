import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Student> students = new HashMap<>();
        int choice = 1;

        while(choice != 5)
        {
            System.out.println("Student Menu: ");
            System.out.println("1 - Add Student");
            System.out.println("2 - Delete Student");
            System.out.println("3 - Find Student");
            System.out.println("4 - Show Students");
            System.out.println("5 - Exit and Go home");
            choice = scanner.nextInt();
        }
    }
}
