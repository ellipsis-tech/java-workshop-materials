import java.util.ArrayList;

// Draw the relationships below in a UML Diagram
class Bank {
    public int bankId;
    public String name;
    private ArrayList<Teller> tellers;

    Bank(){
        bankId = 0;
        name = "Ellipsis"
        tellers = new ArrayList<>();
    }

    public ArrayList<Teller> getTellers() {
        return tellers;
    }
}

// Teller class
class Teller extends Person {
    public Teller(int id, String name) {
        super(id, name); // this calls the constructor of the parent class... What is the parent class?
    }

    public void CollectMoney() {
        // Code ommitted for brevity
    }
}

// Customer class
class Customer extends Person {
    public Customer(int id, String name) {
        super(id, name); // this calls the constructor of the parent class... What is the parent class?
    }

    protected String getName() {
        return this.name;
    }
}

// Person class
class Person {
    protected int id;
    protected String name;

    public Person(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public Person(String name) {
        this(0, name);
    }
}