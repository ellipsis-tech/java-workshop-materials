class Animal {
    public void speak() {
        System.out.println("Animal noise");
    }
}

class Fox extends Animal {
    @Override
    public void speak(){ // override the speak method
        System.out.println("ring ding ding ding");
    }
}

public class Zoo {
    public static void main(String[] args) {
        
    }
}