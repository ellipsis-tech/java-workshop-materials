public class TypeCasting {
    public static void main(String[] args) {
        
        char myCharacter = 'a';
        int myCharacterAsInt = myCharacter;
        char myCharacterAsChar = (char) myCharacterAsInt;

        System.out.println(myCharacter);
        System.out.println(myCharacterAsInt);
        System.out.println(myCharacterAsChar);

    }
}
