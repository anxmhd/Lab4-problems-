package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;

    private int studentCount;

    public static final Major COMPUTER_SCIENCE = new Major("23", "computer science");
    public static final int MAX_CAPACITY = 50;

    public Major(String code, String name) {
        this.id = nextId++;
        this.code = code;
        this.name = name;
        students = new Student[MAX_CAPACITY];
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

    public int getStudentCount() {
        return studentCount;
    }

    public int getCapacity() {
        return MAX_CAPACITY;
    }

    public Student findStudentByCNE(String cne) {
        for(int i = 0; i < studentCount; i++) {
            if(students[i].getCne() == cne) {
                return students[i];
            }
        }
        return null;
    }

    public boolean removeStudentByCNE(String cne) {
        for(int i = 0; i < studentCount; i++) {
            if(students[i].getCne() == cne) {
                for(int j = i; j < studentCount-1; j++) {
                    students[j] = students[j+1];
                }
                students[studentCount-1] = null;
                studentCount--;
                return true;
            }
        }
        return false;
    }

    public void getOccupancyRate() {
        double occRate =  100 * (double) studentCount / MAX_CAPACITY;
        System.out.println("Occupancy rate = " + occRate + "%");
    }

    public String getStudentListAsString() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < studentCount; i++) {
            sb.append(students[i]);
            sb.append("\n");
        }

        return sb.toString();
    }

    // Display all students in the major
    public void displayStudents() {
        for(int i = 0; i < studentCount; i++) System.out.println(students[i]);
    }
}
