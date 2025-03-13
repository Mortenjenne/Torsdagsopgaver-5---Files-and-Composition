package Task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //1.e Opret en Arraylist som kaldes customer
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Chris","Prat","Star-Lord"));
        customers.add(new Customer("Mads","Mikkelsen","Le Chiffre"));
        customers.add(new Customer("Viggo","Mortensen","Aragorn"));
        customers.add(new Customer("Bradley","Cooper","Rocket Racoon"));

        printCustomer(customers);
    }
    //1.f Lav en static metode printCustomers der printer alle kunder ud
    public static void printCustomer(ArrayList<Customer> customers) {
        for(Customer c: customers) {
            System.out.println(c);
        }
    }
}