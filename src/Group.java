
public class Group {
    private String groupName;
    private final Student[] students = new Student[2];

    public Group() {
    }

    public Group(String groupName) {
        this.groupName = groupName;

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent (Student student) throws Exception {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return;
            }
        }
        throw new GroupOverflowException("No free space in the group.");
    }

    public Student searchStudentByLastName(String lastName) throws Exception {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getLastName().equals(lastName)) {
                return students[i];
            }
        }
        throw new StudentsNotFoundException("Student not found by last name.");
    }

    public boolean removeStudentByID(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                students[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "Group" + "\n";
        for (Student student : students) {
            if (student != null) {
                result += student + "\n";
            }
        }
        return result;
    }
}
