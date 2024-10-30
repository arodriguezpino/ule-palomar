package entities;

import java.time.LocalDate;
import java.util.Random;

public class Student {

    private final LocalDate birthDate;

    public Student(LocalDate localDate) {
        this.birthDate = localDate;
    }

    public Student() {
        this.birthDate = getRandomDate();
    }

    private LocalDate getRandomDate() {

        int randomDay = 0;
        int month = new Random().nextInt(12) + 1;

        if (month == 2) {
            randomDay = 28;
        }

        if ((month % 2 != 0 && month != 9 && month != 11) || month == 8 || month == 10 || month == 12) {
            randomDay = 31;
        }

        if (randomDay == 0)
            randomDay = 30;

        return LocalDate.of(2023, month, new Random().nextInt(0, randomDay) + 1);
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "birthDate=" + birthDate +
                '}';
    }
}
