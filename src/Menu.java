import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    StudentLinkedList list;
    boolean isRunning = true;

    public Menu() {
        while (isRunning) {
            System.out.println("===========================================================");
            System.out.println("\t\t\t\t\tSTUDENT\tREGISTRATION");
            System.out.println("===========================================================");
            System.out.println("\t\t1. Register Student");
            System.out.println("\t\t2. Remove Student");
            System.out.println("\t\t3. Search Student");
            System.out.println("\t\t4. Display Students");
            System.out.println("\t\t5. Count Students");
            System.out.println("\t\t6. Exit"+ "\n");
            System.out.println("\tChoose:\t");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("NAME:\t");
                    String name = input.next();
                    System.out.println("REG NO:\t");
                    int regNo = input.nextInt();
                    System.out.println("COURSE:\t");
                    String course = input.next();
                    list = new StudentLinkedList(new Student(regNo, name, course));
                    list.addItem();
                    break;
                case 2:
                    System.out.println("Enter admission number to delete:\t");
                    int regNumber = input.nextInt();
                    list.removeItem(regNumber);
                    break;
                case 3:
                    System.out.println("Enter admission number to search:\t");
                    int adm = input.nextInt();
                    list.searchItem(adm);
                    break;
                case 4:
                    list.displayStudents();
                    break;
                case 5:
                    System.out.println(list.showPopulation());
                    break;
                case 6:
                    System.out.println("exiting the system...");
                    isRunning = false;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
}
