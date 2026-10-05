package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;

    private int studentCount;

    public static final Major COMPUTER_SCIENCE = new Major("23", "computer science");

    public Major(String code, String name) {
        this.id = nextId++;
        this.code = code;
        this.name = name;
        students = new Student[50];
    }

    // Method to add a student
    public void addStudent(Student s) {
        if(studentCount == 50) System.out.println("Major capacity reached.");
        students[studentCount] = s;
        studentCount++;
    }

    // Getters
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    // Display all students in the major
    public void displayStudents() {
        for(int i = 0; i < studentCount; i++) System.out.println(students[i]);
    }
}
