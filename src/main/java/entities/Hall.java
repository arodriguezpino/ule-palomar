package entities;

import java.util.List;

public class Hall {
    private List<Student> students;
    private int size;

    public Hall(List<Student> students, int size) {
        this.students = students;
        this.size = size;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
