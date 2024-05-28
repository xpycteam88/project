public class Main {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 0;

        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
    }
}
