public class CheckedExceptionPropagation {

    public static void main(String[] args) {
        System.out.println("In main");
        System.out.println(a());
    }

    public static int a() {
        System.out.println("In a");
        try {
            return b();
        } catch (CheckedException e) {
            return 0;
        }
    }

    public static int b() throws CheckedException {
        System.out.println("In b");
        return c();
    }

    public static int c() throws CheckedException {
        System.out.println("In c");
        return methodThrowingException();
    }

    public static int methodThrowingException() throws CheckedException {
        throw new CheckedException("hello");
    }

}
