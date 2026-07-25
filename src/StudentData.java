public class StudentData {
    private Node head;
    private Node tail;
    private int size;

    StudentData() {
        this.size = 0;
    }

    public void createStudent(String name, int admNo, String course) {
        addLast(new Student(name, admNo, course));
    }

    public int getPopulation() {
        return size;
    }

    private static class Node {
        private final Student student;
        private Node next;

        public Node(Student student) {
            this.student = student;
        }
    }

    private void addLast(Student student) {
        Node node = new Node(student);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        size++;
    }

    public boolean delete(int admNo) {
        if (head == null) {
            return false;
        }

        if (head.student.getRegNo() == admNo) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return true;
        }

        Node current = head;

        while (current.next != null) {
            if (current.next.student.getRegNo() == admNo) {
                if (current.next == tail) {
                    tail = current;
                }
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public Student search(int admNo) {
        Node current = head;

        while (current != null) {
            if (current.student.getRegNo() == admNo) {
                return current.student;
            }
            current = current.next;
        }

        return null;
    }

    public void display() {
        Node current = head;

        if (current == null) {
            System.out.println("No students registered.");
            return;
        }

        while (current != null) {
            System.out.println(current.student);
            current = current.next;
        }
    }
}
