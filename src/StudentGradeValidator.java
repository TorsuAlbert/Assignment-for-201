public class StudentGradeValidator {
    private String name;
    private int age;
    private double grade;

    public StudentGradeValidator(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100)
            this.grade = grade;
        else
            System.out.println("Invalid Grade");
    }
    static void main(String[] args) {
        StudentGradeValidator G1 = new StudentGradeValidator("Albert", 18, 200);
        System.out.println(G1.grade);
        System.out.println(G1.age);
        System.out.println(G1.name);
    }


}
