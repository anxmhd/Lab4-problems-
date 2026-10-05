package instructor;

public class Instructor extends Person {
    String employeeNumber;

    public Instructor(String firstName, String secondName, String telephone, String email, String employeeNumber) {
        super(firstName, secondName, telephone, email);
        this.employeeNumber = employeeNumber;
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
}
