
public class Main {
    public static void main(String[] args) {

        Group g1 = new Group("Group-101");

        Student s1 = new Student("Lesia", "Ukrainka", Gender.FEMALE, 1011, g1.getGroupName());
        Student s2 = new Student("Taras", "Shevchenko", Gender.MALE, 2022, g1.getGroupName());
        Student s3 = new Student("Ivan", "Franko", Gender.MALE, 3022, g1.getGroupName());

        try {
            g1.addStudent(s1);
            g1.addStudent(s2);
            g1.addStudent(s3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(g1);

        try {
            g1.searchStudentByLastName("Shevchenko").setName("Andrii"); // StudentsNotFoundException check.
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(g1);
        System.out.println(g1.removeStudentByID(1011)); // False if ID doesn't exist
        System.out.println(g1);
    }
}
