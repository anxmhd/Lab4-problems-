package problem6;

public class Circle extends Forme {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getSurface() {
        return Math.PI * this.radius * this.radius;
    }

    public String toString() {
        return String.format("%s (radius %.1f cm)", super.toString(), radius);
    }
}
