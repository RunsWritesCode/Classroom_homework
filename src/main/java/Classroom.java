import java.util.ArrayList;

public class Classroom {

    private int capacity;
    private ArrayList<Student> students;

    public Classroom(int inputCapacity) {
        this.capacity = inputCapacity;
        this.students = new ArrayList<>();
    }

    public int countStudents() {
        return this.students.size();
    }


    public void addStudent(Student student) {
        if (countStudents() < capacity) {
            this.students.add(student);
        }
    }


    public void removeStudent(Student student) {
        this.students.remove(student);
    }
}
