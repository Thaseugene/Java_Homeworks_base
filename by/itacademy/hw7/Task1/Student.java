package by.itacademy.hw7.task1;

public class Student {

    private String name;
    private String surname;
    private String groupNumber;
    private double averagePoint;

    public Student(String name, String surname, String groupNumber, double averagePoint) {
        this.name = name;
        this.surname = surname;
        this.groupNumber = groupNumber;
        this.averagePoint = averagePoint;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public double getAveragePoint() {
        return averagePoint;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    private void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    private void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }

    public int getFellowship () {
        return averagePoint == 5 ? 100 : 80;
    }
}
