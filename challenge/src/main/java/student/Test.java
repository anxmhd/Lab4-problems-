package student;

public class Test {
    public static void main(String[] args) {
        Major math = new Major("10", "math");
        Major physic = new Major("11", "physic");

        Student s1 = new Student("Amal", "SAFI", "0612345678", "amal@gmail.com", "22885676");
        Student s2 = new Student("Samir", "ALAMI", "0612345678", "samir@gmail.com", "23585976");
        Student s3 = new Student("Youssef", "Mouar", "0612345678", "youssef@gmail.com", "2345678", math);

        // Display computer science students
        Major.COMPUTER_SCIENCE.displayStudents();
    }
}

