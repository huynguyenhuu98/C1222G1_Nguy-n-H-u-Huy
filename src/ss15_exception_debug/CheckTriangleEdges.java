package ss15_exception_debug;

public class CheckTriangleEdges {
    public void checkTriangleEdges(double a, double b, double c) throws IllegalTriangleException {
        if ((a <= 0 || b <= 0 || c <= 0) && ( a + b <= c || a + c <= b || b + c <= a)) {
            throw new IllegalTriangleException("Error: Triangle illegal!");
        } else {
            System.out.println("Triangle valid!");
        }
    }
}
