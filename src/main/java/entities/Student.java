package entities;

public class Student {

    private String name;
    private String registerNumber;
    private String cpf;

    private Course course;

    public Student() {
    }

    public Student(String name, String registerNumber, String cpf, Course course) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.cpf = cpf;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
