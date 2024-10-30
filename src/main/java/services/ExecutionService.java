package services;

import entities.Execution;
import entities.Hall;
import entities.Result;
import entities.Student;

import java.util.ArrayList;
import java.util.List;

public class ExecutionService {

    public static void main(String... args) {
        Hall moreThan12 = new Hall(createNStudents(13), 13);
        Hall moreThan365 = new Hall(createNStudents(366), 366);

        Result resultMoreThan12 = new Execution(moreThan12).execute();
        Result resultMoreThan365 = new Execution(moreThan365).execute();

        System.out.println("More Than 12\nShould be at least 1 month match :\n" + resultMoreThan12.getMonthMatches() + "\n");
        System.out.println("More Than 365\nShould be at least 1 day match :\n" + resultMoreThan365.getDayMatches() + "\n");

        executeNTimes(12, 366).forEach(result -> {
            System.out.println("Execution : " );
            System.out.println("How many months there are where 1 or more people serving 1 or more days in the same day in the same class : " + result.getTotalMonthsMatched());
            System.out.println("How many days there are where 1 or more people serving 1 or more days in the same day in the same class : " + result.getTotalDaysMatched());
            System.out.println("\n");
        });
    }

    public static List<Student> createNStudents(int numberOfStudents) {
        List<Student> result = new ArrayList<>();
        for (int i = 0; i < numberOfStudents; i++) {
            result.add(new Student());
        }
        return result;
    }

    public static List<Result> executeNTimes(int numberOfExecutions, int numberOfStudents) {
        List<Result> results = new ArrayList<>();
        for (int i = 0; i < numberOfExecutions; i++) {
            results.add(new Execution(new Hall(createNStudents(numberOfStudents), numberOfStudents)).execute());
        }
        return results;
    }
}
