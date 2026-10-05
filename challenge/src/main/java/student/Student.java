package student;

import java.util.Locale;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom, nom, telephone, email);
        this.cne = cne;
        this.major = major;
        major.addStudent(this);
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(prenom, nom, telephone, email);
        this.cne = cne;
        this.major = Major.COMPUTER_SCIENCE;
        Major.COMPUTER_SCIENCE.addStudent(this);
    }

    // Getters
    public String getCne() {
        return cne;
    }

    public Major getMajor() {
        return major;
    }

    public String getFullNameFormatted() {
        return String.format("%s, %s", secondName.toUpperCase(), firstName);
    }

    // Setters
    public void setCne(String cne) {
        this.cne = cne;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public String toString() {
        return String.format("%d. %s %s %s", id, cne, secondName, firstName);
    }
}

