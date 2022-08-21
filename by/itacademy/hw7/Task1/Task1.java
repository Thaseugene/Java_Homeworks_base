package by.itacademy.hw7.Task1;

public class Task1 {

    public static void main(String[] args) {

        Student studentOne = new Student("John", "Smith", "96011n", 4.9);
        Student studentTwo = new Student("Rachel", "Johnson", "96012g", 5.0);

        Aspirant aspirantOne = new Aspirant("Peter", "Jackson", "111752", 5.0,
                "Psychologiс work");
        Aspirant aspirantTwo = new Aspirant("Dina", "Hurts", "101729", 4.7,
                "Engineering work");

        Student[] students = {studentOne, studentTwo, aspirantOne, aspirantTwo};

        for (Student st : students) {
            System.out.println(st.getName() + " " + st.getSurname() + " with average mark " + st.getAveragePoint() +
                    " will get next fellowship - " + st.getFellowship() + " usd.");
        }

    }
}
