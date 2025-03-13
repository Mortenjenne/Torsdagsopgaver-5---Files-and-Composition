package Task1;

public class Customer {
    //1.a Lav en klasse Customer
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter = 0;

    //1.b Lav en konstruktør der tager kundens navn og brugernavn som parameter
    Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        //1.c Counter tælles op med en hver gang konstruktøren bliver kaldt og brug counter til at initialisere id
        counter ++;
        this.id = counter;
    }

    //1.d lav toString + getters + setters
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUserName() {
        return this.userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String s =  "Customer ID: " + this.id + ", Name: " + this.firstName + " " + this.lastName + ", Username: " + this.userName;
        return s;
    }
}
