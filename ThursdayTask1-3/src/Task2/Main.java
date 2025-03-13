package Task2;

//2.b create a class Main and a main method
public class Main {
    public static void main(String[] args) {

        //2.g create a instance of Cafe class and call the loadMenuDate()
        Cafe cafe = new Cafe();
        cafe.loadMenuData();

        //2.h print alle the elements in the list coffeeMenu
        System.out.println("Welcome to Java Beans Café! Here is our menu:");
        for(String coffee: cafe.getCoffeeMenu()){
            System.out.println(coffee);
        }

    }
}
