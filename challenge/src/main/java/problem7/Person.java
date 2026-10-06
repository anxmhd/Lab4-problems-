package problem7;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("I am " + name + " the " + this.getClass().getSimpleName());
    }
}

