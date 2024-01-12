public class Human implements Comparable<Human>{
    String firstName;
    String lastName;

    Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    @Override
    public int compareTo(Human h){
        int res = this.firstName.compareTo(h.getFirstName());
        
        if (res == 0) {
            return this.lastName.compareTo(h.getLastName());
        } else {
            return 0;
        }
    }
}