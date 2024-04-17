import task_1_2.Applicant;
import task_2_1.Faculty;
import task_2_1.Institute;
import task_2_1.Student;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        task_1_2();
        task_2_1();
        task_3_2();
    }

    private static void task_1_2() {
        int budget = 3;
        int contract = 2;

        List<Applicant> contractApplicants = getApplicantStream()
                .filter(applicant -> applicant.getPoints() >= 60)
                .sorted(Comparator.comparingInt(Applicant::getPoints).reversed())
                .skip(budget)
                .limit(contract)
                .collect(Collectors.toList());

        System.out.println("Contract applicants:");
        contractApplicants.forEach(System.out::println);
        System.out.println();
    }

    private static Stream<Applicant> getApplicantStream() {
        return Stream.of(new Applicant("Tom", 60), new Applicant("Mason", 45), new Applicant("Jackson", 0),
                new Applicant("Harper", 80), new Applicant("Jack", 100), new Applicant("Avery", 70), new Applicant("Wyatt", 65),
                new Applicant("Carter", 75), new Applicant("Grayson", 10), new Applicant("Grayson", 90));
    }

    private static void task_2_1() {
        List<Student> sortedStudents = Stream.of(getInstitute())
                .map(Institute::getFaculties)
                .flatMap(Collection::stream)
                .map(Faculty::getStudents)
                .flatMap(Collection::stream)
                .sorted(
                        Comparator.comparing(Student::getLastName)
                                .thenComparing(Student::getFirstName)
                                .thenComparing(Student::getScoreBookNumber))
                .collect(Collectors.toList());

        System.out.println("Sorted students:");
        sortedStudents.forEach(System.out::println);
        System.out.println();
    }

    private static Institute getInstitute() {
        return new Institute("KPI", List.of(
                new Faculty("Faculty1",
                        List.of(new Student("firstName1", "lastName1", 10, 20), new Student("firstName2", "lastName2", 30, 40),
                                new Student("firstName3", "lastName3", 10, 20), new Student("firstName4", "lastName4", 150, 10))),
                new Faculty("Faculty2",
                        List.of(new Student("firstName5", "lastName5", 10, 20), new Student("firstName6", "lastName6", 30, 40),
                                new Student("firstName7", "lastName7", 10, 20), new Student("firstName8", "lastName8", 150, 10)))));
    }

    private static void task_3_2() {
        List<String> notIncludedApplicantsLastNames = getApplicantStream()
                .filter(applicant -> applicant.getPoints() < 60)
                .map(Applicant::getLastName)
                .collect(Collectors.toList());

        System.out.println("Not included applicants last names:");
        notIncludedApplicantsLastNames.forEach(System.out::println);
    }
}
