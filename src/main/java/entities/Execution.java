package entities;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Execution {

    private final UUID id;
    private final Hall hall;

    public Execution(Hall hall) {
        this.hall = hall;
        this.id = UUID.randomUUID();
    }

    public Result execute() {
        Map<Month, Integer> checkMonthMatches = checkMonthMatches();
        Map<LocalDate, List<Student>> checkDayMatches = checkDayMatches();
        return new Result(
                this.id,
                checkMonthMatches,
                checkDayMatches,
                hall.getSize(),
                hall.getStudents().size(),
                checkDayMatches.size(),
                checkMonthMatches.size()
        );
    }

    private Map<Month, Integer> checkMonthMatches() {
        Map<Month, Integer> result = new HashMap<>();
        for (int i = 1; i <= 12; i++) {
            int month = i;
            long total = hall.getStudents().stream().filter(student -> student.getBirthDate().getMonth().getValue() == month).count();
            if (total > 1)
                result.put(Month.of(i), (int) total);
        }
        return result;
    }

    private Map<LocalDate, List<Student>> checkDayMatches() {
        Map<LocalDate, List<Student>> result = new HashMap<>();
        List<LocalDate> checkedDates = new ArrayList<>();
        hall.getStudents().forEach(sampleStudent -> {
            LocalDate targetDate = sampleStudent.getBirthDate();
            if (checkedDates.contains(targetDate)) return;
            checkedDates.add(targetDate);
            List<Student> matchedStudents = hall.getStudents().stream().filter(student -> student.getBirthDate().equals(targetDate)).toList();
            if (matchedStudents.size() > 1)
                result.put(targetDate, matchedStudents);
        });
        return result;
    }
}
