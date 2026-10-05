package instructor;

public class Subject {
    private static int nextId = 1;
    private int id;
    private String code;
    private String title;
    private Instructor instructor;

    public Subject(String code, String title, Instructor instructor) {
        this.id = nextId++;
        this.code = code;
        this.title = title;
        if (instructor == null) {
            throw new IllegalArgumentException("Instructor cannot be null");
        }
        this.instructor = instructor;
    }

    public String normalizedCode() {
        return code.trim().toUpperCase();
    }

    public String properTitle() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < title.length(); i++) {
            char c = title.charAt(i);
            if(c != ' ' && i == 0) sb.append(Character.toUpperCase(c));
            else sb.append(c);

            if(c == ' ' && i != title.length() - 1) {
                sb.append(Character.toUpperCase(title.charAt(i+1)));
                i++;
            }
        }
        return sb.toString();
    }

    public boolean isIntroCourse() {
        return title.startsWith("Intro") || code.startsWith("INTRO-");
    }

    public String syllabusLine() {
        StringBuilder sb = new StringBuilder();
        sb.append(code);
        sb.append(" - ");
        sb.append(title);
        sb.append(" (Instructor : ").append(instructor.displayName()).append(")");

        return sb.toString();
    }
}
