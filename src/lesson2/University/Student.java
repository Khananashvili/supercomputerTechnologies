package lesson2.University;

public class Student {

    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;

    public Student (String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        return averageMark == 5 ? 100 : 80;
    }
}
