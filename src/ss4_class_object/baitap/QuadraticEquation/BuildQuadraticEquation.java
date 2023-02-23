package ss4_class_object.baitap.QuadraticEquation;

public class BuildQuadraticEquation {
    double a;
    double b;
    double c;

    public BuildQuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
    }

    public double getRoot0() {
        return -this.b / (2 * this.a);
    }
}
