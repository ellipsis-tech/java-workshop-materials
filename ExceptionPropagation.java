public class ExceptionPropagation {
    public static void main(String[] args) {
        System.out.println("In main");
        System.out.println(a());
    }

    public static int a() {
        System.out.println("In a");
        try {
            return b();
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    public static int b() {
        System.out.println("In b");
        return c();
    }

    public static int c() {
        System.out.println("In c");
        return methodDividingByZero();
    }

    public static int methodDividingByZero() {
        return 1 / 0;
    }
}
