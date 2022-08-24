package by.itacademy.hw7.task1;

public class Aspirant extends Student{

    private String scientificWork;

    public Aspirant(String name, String surname, String groupNumber, double averagePoint, String scientificWork) {
        super(name, surname, groupNumber, averagePoint);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    @Override
    public int getFellowship() {
        return getAveragePoint() == 5 ? 200 : 180;
    }
}
