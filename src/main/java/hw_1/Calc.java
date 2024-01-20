package hw_1;

public class Calc {
    public static void main(String[] args) {
        System.out.println(sum(5, 5));
        System.out.println(mult(5, 5));
        System.out.println(div(5, 5));
        System.out.println(substract(5, 5));

    }

    static int sum(int x, int y) {
        return x + y;
    }
    static int mult(int x, int y) {
        return x * y;
    }
    static int div(int x, int y) {
        return x / y;
    }
    static int substract(int x, int y) {
        return x - y;
    }
}