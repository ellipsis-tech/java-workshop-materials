public class StringConcat {
    public static void main(String[] args) {
        String a = 3 + 4 + "";
        String b = 3 + "" + 4;    
        String c = "" + 2 + 5;
        c += 5.0;

        // What are the outputs
        System.out.println(a); // 7
        System.out.println(b); // 34
        System.out.println(c); // 255.0
    }

}
