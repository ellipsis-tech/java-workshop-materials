// Method overLOADING example

public class Display {
    public static void display(int number){
        System.out.println("First number: " + number);
    }
    public static void display(int number1, int number2){
        System.out.println("First number: " + number1 + " second number: " + number2);
    }   

    // PS: Will this compile?
    // public void display(int number3, int number4){
    //     System.out.println("First number: " + number3 + " second number: " + number4);
    // }

    public static void main(String[] args) {
        display(10);
        display(11, 12);
        // Java automatically knows which one you are calling, as long as the parameters are different. 
    }
}
