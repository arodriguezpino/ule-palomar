package entities;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Result {

    private UUID executionId;
    private Map<Month, Integer> monthMatches;
    private Map<LocalDate, List<Student>> dayMatches;
    private int hallSize;
    private int students;
    private int totalDaysMatched;
    private int totalMonthsMatched;

    public Result(UUID executionId, Map<Month, Integer> monthMatches, Map<LocalDate, List<Student>> dayMatches, int hallSize, int students, int totalDaysMatched, int totalMonthsMatched) {
        this.executionId = executionId;
        this.monthMatches = monthMatches;
        this.dayMatches = dayMatches;
        this.hallSize = hallSize;
        this.students = students;
        this.totalDaysMatched = totalDaysMatched;
        this.totalMonthsMatched = totalMonthsMatched;
    }

    public UUID getExecutionId() {
        return executionId;
    }

    public void setExecutionId(UUID executionId) {
        this.executionId = executionId;
    }

    public Map<Month, Integer> getMonthMatches() {
        return monthMatches;
    }

    public void setMonthMatches(Map<Month, Integer> monthMatches) {
        this.monthMatches = monthMatches;
    }

    public Map<LocalDate, List<Student>> getDayMatches() {
        return dayMatches;
    }

    public void setDayMatches(Map<LocalDate, List<Student>> dayMatches) {
        this.dayMatches = dayMatches;
    }

    public int getHallSize() {
        return hallSize;
    }

    public void setHallSize(int hallSize) {
        this.hallSize = hallSize;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public int getTotalDaysMatched() {
        return totalDaysMatched;
    }

    public void setTotalDaysMatched(int totalDaysMatched) {
        this.totalDaysMatched = totalDaysMatched;
    }

    public int getTotalMonthsMatched() {
        return totalMonthsMatched;
    }

    public void setTotalMonthsMatched(int totalMonthsMatched) {
        this.totalMonthsMatched = totalMonthsMatched;
    }
}
