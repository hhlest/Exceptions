# Exceptions

1) Create a Human class.
Fields:
String name,
String lastName (last name),
Gender gender (gender. Implement with Enum).

Methods:
Standard (getters and setters, toString(), etc.)

2) Create a class Student as a subclass of Human.
Fields:
int id (study number),
String groupName (name of the group where he studies).

Methods:
Standard (getters and setters, toString(), etc.)

3) Create classes GroupOverflowException, StudentNotFoundException exceptions (heirs Exception) as custom exceptions.

4) Create class Group
Fields:
String groupName (name),
Student[] students = new Student[10]; (array of 10 students).

Methods:
Standard (getters and setters, toString(), etc.)
public void addStudent(Student student) throws GroupOverflowException (method of adding a student to a group. If 11 students are added, a custom exception should be thrown)
public Student searchStudentByLastName(String lastName) throws StudentNotFoundException (method to search for a student in a group. If a student is not found, a custom exception should be thrown)
public boolean removeStudentByID(int id) (method of removing a student by grade number, return true if there was such a student and he was removed and false otherwise)
