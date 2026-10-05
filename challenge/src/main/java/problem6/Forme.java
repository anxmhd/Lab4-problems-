package problem6;

abstract class Forme {
    public abstract double getSurface();

    public String toString() {
        return this.getClass().getSimpleName();
    }
}
