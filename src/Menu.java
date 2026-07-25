import java.util.Scanner;

public class Menu {
    private final StudentData students = new StudentData();
    private final Scanner input = new Scanner(System.in);

    public void mainMenu() {
        int choice;

        do {
            printMenu();
            choice = readInt("Enter a choice (1, 2, 3, 4, 5, 6): ");

            switch (choice) {
                case 1:
                    registerStudent();
                    break;
                case 2:
                    deleteStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    students.display();
                    break;
                case 5:
                    System.out.println("Total student population: " + students.getPopulation());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Wrong choice. Please enter a number from 1 to 6.");
            }
        } while (choice != 6);
    }

    private void printMenu() {
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("			COURSE REGISTRATION PROGRAM");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("	1. Register a Student");
        System.out.println("	2. Delete a Student");
        System.out.println("	3. Search a Student");
        System.out.println("	4. Display all Students");
        System.out.println("	5. Show total Student Population");
        System.out.println("	6. EXIT");
    }

    private void registerStudent() {
        String name = readText("Name: ");
        int admNo = readInt("Registration number: ");
        String course = readText("Course: ");

        students.createStudent(name, admNo, course);
        System.out.println("Student registered successfully.");
    }

    private void deleteStudent() {
        int admNo = readInt("Enter registration number: ");

        if (students.delete(admNo)) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private void searchStudent() {
        int admNo = readInt("Enter registration number: ");
        Student student = students.search(admNo);

        if (student == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println(student);
        }
    }

    private int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);

            if (input.hasNextInt()) {
                int value = input.nextInt();
                input.nextLine();
                return value;
            }

            System.out.println("Invalid number. Please try again.");
            input.nextLine();
        }
    }

    private String readText(String prompt) {
        String value;

        do {
            System.out.print(prompt);
            value = input.nextLine().trim();

            if (value.isEmpty()) {
                System.out.println("This field cannot be empty.");
            }
        } while (value.isEmpty());

        return value;
    }
}
