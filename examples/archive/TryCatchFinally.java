public class TryCatchFinally {

    public static void main(String[] args) {
        try {
            methodDividingByZero();
        } catch (ArithmeticException e) {
            System.out.println("This is run when there is an error!");
        } finally {
            System.out.println("This is always run!");
        }
    }

    public static void methodDividingByZero() {
        System.out.println(10 / 0);
    }
}
