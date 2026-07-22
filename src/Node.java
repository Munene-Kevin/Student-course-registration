public class Node extends Student{
    private Student student;
    Node next;

    public Node(Student student, Node next) {
        super();
        this.student = student;
        this.next = next;
    }

    public Node(Student student) {
        this(student, null);
    }

    public Node() {
    }
}
