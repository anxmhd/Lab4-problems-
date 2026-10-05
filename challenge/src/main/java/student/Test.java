package student;

public class Test {
    public static void main(String[] args) {
        Major math = new Major("10", "math");
        Major physic = new Major("11", "physic");

        Student s1 = new Student("Amal", "Safi", "0612345678", "amal@gmail.com", "22885676");
        Student s2 = new Student("Samir", "Alami", "0612345678", "samir@gmail.com", "23585976");
        Student s3 = new Student("Youssef", "Mouar", "0612345678", "youssef@gmail.com", "2345678", math);

        // Display computer science students
        Major.COMPUTER_SCIENCE.displayStudents();

        Student student1 = new Student("Anass", "Mhd", "0612345678", "amal@gmail.com", "CNE001");
        Student student2 = new Student("Youssef", "Alaoui", "0612345678", "amal@gmail.com","CNE002");
        Student student3 = new Student("Sara", "Bennani", "0612345678", "amal@gmail.com","CNE003");

        // 1. Test getFullNameFormatted()
        System.out.println("\n=== Full Name Formatted ===");
        System.out.println(student1.getFullNameFormatted());
        System.out.println(student2.getFullNameFormatted());
        System.out.println(student3.getFullNameFormatted());

        // 2. Test findStudentByCNE()
        System.out.println("\n=== Find Student By CNE ===");

        Student found = Major.COMPUTER_SCIENCE.findStudentByCNE("CNE002");
        System.out.println("Student found: " + found.getFullNameFormatted());

        // Test with a CNE that does not exist
        Student notFound = Major.COMPUTER_SCIENCE.findStudentByCNE("CNE999");
        System.out.println("Student not found.");


        // 3. Test getStudentCount()
        System.out.println("\n=== Student Count ===");
        System.out.println("Current enrollment: " + Major.COMPUTER_SCIENCE.getStudentCount());

        // 4. Test getOccupancyRate()
        System.out.println("\n=== Occupancy Rate ===");
        Major.COMPUTER_SCIENCE.getOccupancyRate();

        // 5. Test getStudentListAsString()
        System.out.println("\n=== Student List ===");
        System.out.println(Major.COMPUTER_SCIENCE.getStudentListAsString());

        // 6. Test removeStudentByCNE()
        System.out.println("\n=== Remove Student ===");

        boolean removed = Major.COMPUTER_SCIENCE.removeStudentByCNE("CNE002");

        if (removed) {
            System.out.println("Student CNE002 was removed.");
        } else {
            System.out.println("Student CNE002 was not found.");
        }

        // 7. Check count after removal
        System.out.println("\n=== After Removal ===");
        System.out.println("Current enrollment: "
                + Major.COMPUTER_SCIENCE.getStudentCount());

        // 8. Check updated student list
        System.out.println("\n=== Updated Student List ===");
        System.out.println(Major.COMPUTER_SCIENCE.getStudentListAsString());

        // 9. Check updated occupancy rate
        System.out.println("\n=== Updated Occupancy Rate ===");
        Major.COMPUTER_SCIENCE.getOccupancyRate();

        // 10. Try removing a student that doesn't exist
        boolean removedAgain = Major.COMPUTER_SCIENCE.removeStudentByCNE("CNE999");

        System.out.println("\nTrying to remove CNE999: " + removedAgain);
    }
}


