
public class Main {
    public static void main(String[] args) {

        Group g1 = new Group("Group-101");

        Student s1 = new Student("Lesia", "Ukrainka", "Female", 1011, g1.getGroupName());
        Student s2 = new Student("Taras", "Shevchenko", "Male", 2022, g1.getGroupName());
        Student s3 = new Student("Ivan", "Franko", "Male", 3022, g1.getGroupName());

        try {
            g1.addStudent(s1);
            g1.addStudent(s2);
            g1.addStudent(s3); // GroupOverflowException check.
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(g1);

        try {
            g1.searchStudentByLastName("Shevchenk").setName("Andrii"); // StudentsNotFoundException check.
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(g1);

        try {
            g1.removeStudentByID(1012);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(g1);
    }
}
