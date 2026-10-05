package instructor;

public class Test {

    public static void main(String[] args) {

        // =========================
        // Create an Instructor
        // =========================

        Instructor instructor = new Instructor(
                "Anass",
                "Mhd",
                "0612345678",
                "anass@example.com",
                " AB 123 "
        );

        // =========================
        // Create a Subject
        // =========================

        Subject subject = new Subject(
                " cs-101 ",
                "introduction to java",
                instructor
        );

        // =========================
        // 1. cleanEmployeeNumber()
        // =========================

        System.out.println("=== Clean Employee Number ===");
        System.out.println(instructor.cleanEmployeeNumber());

        // Expected:
        // AB123


        // =========================
        // 2. normalizedCode()
        // =========================

        System.out.println("\n=== Normalized Code ===");
        System.out.println(subject.normalizedCode());

        // Expected:
        // CS-101


        // =========================
        // 3. properTitle()
        // =========================

        System.out.println("\n=== Proper Title ===");
        System.out.println(subject.properTitle());

        // Expected:
        // Introduction To Java


        // =========================
        // 4. summaryLine()
        // =========================

        System.out.println("\n=== Instructor Summary ===");
        System.out.println(instructor.summaryLine());

        // Expected:
        // Instructor[employeeNumber= AB 123 ,
        // lastName=Mhd, firstName=Anass]


        // =========================
        // 5. isIntroCourse()
        // =========================

        System.out.println("\n=== Intro Course? ===");
        System.out.println(subject.isIntroCourse());

        // Expected:
        // false


        // =========================
        // 6. toCard()
        // =========================

        System.out.println("\n=== Instructor Card ===");
        System.out.println(instructor.toCard());


        // =========================
        // 7. syllabusLine()
        // =========================

        System.out.println("\n=== Syllabus Line ===");
        System.out.println(subject.syllabusLine());
    }
}
