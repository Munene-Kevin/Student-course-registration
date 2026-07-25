public class Student {
    private final String fullName;
    private final int regNo;
    private final String course;

    public Student(String name, int admNo, String course) {
        this.fullName = name;
        this.regNo = admNo;
        this.course = course;
    }

    public int getRegNo() {
        return regNo;
    }

    @Override
    public String toString() {
        return "Name: " + fullName + ", Reg No: " + regNo + ", Course: " + course;
    }
}
