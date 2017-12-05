import java.util.ArrayList;

public class Hallway {

    private ArrayList<Student> hallKids;

    public Hallway() {
        this.hallKids = new ArrayList<>();
    }

    public int countDelinquents() {
        return this.hallKids.size();
    }

    public void addDelinquent(Student student) {
        this.hallKids.add(student);
    }
}
