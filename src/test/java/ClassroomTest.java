import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class ClassroomTest {
    Classroom classroom;
    Student student;
    Hallway hallway;

    @Before
    public void before() {
        classroom = new Classroom(42);
        student = new Student();
        hallway = new Hallway();
    }

    @Test
    public void classroomIsEmpty() {
        assertEquals(0, classroom.countStudents());
    }

    @Test
    public void addStudent() {
        classroom.addStudent(student);
        assertEquals(1, classroom.countStudents());
    }

    @Test
    public void canExcludeStudent() {
        classroom.addStudent(student);
        classroom.removeStudent(student);
        hallway.addDelinquent(student);
        assertEquals(0, classroom.countStudents());
        assertEquals(1, hallway.countDelinquents());
    }





}
