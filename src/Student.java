public class Student {
    private String name;
    private int regNo;
    private String course;
    private int population = 0;

    public Student(int regNo, String name, String course) {
        this.regNo = regNo;
        this.name = name;
        this.course = course;
        this.population++;
    }

    public Student() {
        this.regNo = 0;
        this.name = "ABEL";
        this.course = "Mechanical Engineering";
    }

    protected String getName() {
        return this.name;
    }

    protected int getRegNo() {
        return this.regNo;
    }

    public void printData() {
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", regNo=" + regNo +
                ", course='" + course + '\'' +
                ", population=" + population +
                '}');
    }
}
