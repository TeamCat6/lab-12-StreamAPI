package task_2_1;

public class Student {

    private String firstName;
    private String lastName;
    private int scoreBookNumber;
    private int averageScore;

    public Student(String firstName, String lastName, int scoreBookNumber, int averageScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.scoreBookNumber = scoreBookNumber;
        this.averageScore = averageScore;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getScoreBookNumber() {
        return scoreBookNumber;
    }

    public void setScoreBookNumber(int scoreBookNumber) {
        this.scoreBookNumber = scoreBookNumber;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", scoreBookNumber=" + scoreBookNumber +
                ", averageScore=" + averageScore +
                '}';
    }
}
