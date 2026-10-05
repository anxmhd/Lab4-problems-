package problem6;

public class Square extends Forme {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSurface() {
        return this.side * this.side;
    }

    public String toString() {
        return String.format("%s (side %.1f cm)", super.toString(), side);
    }
}
