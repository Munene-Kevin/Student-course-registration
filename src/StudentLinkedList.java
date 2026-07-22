public class StudentLinkedList extends Node{
    private Node head;
    private Node tail;
    private int size;

    public StudentLinkedList(Student student, Node next) {
        super(student, next);
    }

    public StudentLinkedList(Student student) {
        super(student);
    }

    public StudentLinkedList() {
        this.size = 0;
    }

    public void addItem(Student student) {
        Node temp = head;
        Node newNode = new Node(student);

        if (temp == null) {
            head = newNode;
            size++;
            System.out.println(student.getName() + " added successfully!");
            return;
        }

        newNode.next = temp;
        head = newNode;
        size++;
        System.out.println(student.getName() + " added successfully!");
    }

    public void removeItem(int admNo) {
        Node temp = head;
        int index = getNodeIndex(admNo);

        for (int i = 0; i < index - 1; i++) {
            temp.next = temp.next.next;
            System.out.println(admNo + " deleted from the system!");
            return;
        }
        System.out.println("Operation error!!");
    }

    public int getNodeIndex(int regNo) {
        Node temp = head;

        for (int i = 1; i < size; i++) {
            if (temp.getRegNo() == regNo) {
                return i;
            }
        }
        return 0;
    }

    public void searchItem(int regNo) {
        Node temp = head;

        int index = getNodeIndex(regNo);

        for (int i = 0; i < index; i++) {
            if (temp.getRegNo() == regNo) {
                temp.printData();
                return;
            }
        }
        System.out.println(regNo + " NOT FOUND!!");
    }

    public void displayStudents() {
        Node temp = head;

        for (int i = 0; i < size; i++) {
            temp.printData();
        }
        System.out.println();
    }

    public int showPopulation() {
        return this.size;
    }
}
