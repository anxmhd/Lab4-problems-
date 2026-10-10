package instructor;

public class Instructor extends Person {
    private String employeeNumber;
    private Subject[] subjects;
    private int subjectCount = 0;
    private int subjectCapacity = 10;

    public Instructor(String firstName, String secondName, String telephone, String email, String employeeNumber) {
        super(firstName, secondName, telephone, email);
        this.employeeNumber = employeeNumber;
        subjects = new Subject[subjectCapacity];
    }

    public String cleanEmployeeNumber() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < employeeNumber.length(); i++) {
            char c = employeeNumber.charAt(i);
            if(c != ' ') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public String summaryLine() {
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]", employeeNumber, secondName, firstName);
    }

    public String toCard() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instructor\n");
        sb.append("----------\n");
        sb.append("Employee #: ").append(employeeNumber);
        sb.append("\nName : ").append(secondName).append(", ").append(firstName);
        sb.append("\nEmail : ").append(email);
        sb.append("\nPhone : ").append(phone);

        return sb.toString();
    }

    public String displayName() {
        StringBuilder sb = new StringBuilder();
        sb.append(secondName.toUpperCase()).append(" ");
        if(firstName != null) sb.append(firstName);
        return sb.toString();
    }

    public void addSubject(Subject subject) {
        if(subjectCount == subjectCapacity) {
            Subject[] newList = new Subject[subjectCapacity * 2];
            for(int i = 0; i < subjectCount; i++) {
                newList[i] = subjects[i];
            }
            subjects = newList;
            subjectCapacity *= 2;
        }

        subjects[subjectCount] = subject;
        subjectCount++;   
    }
}
