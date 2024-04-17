package task_1_2;

public class Applicant {

    private String lastName;
    private int points;

    public Applicant(String lastName, int points) {
        this.lastName = lastName;
        this.points = points;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "lastName='" + lastName + '\'' +
                ", points=" + points +
                '}';
    }
}
