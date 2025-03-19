package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    //2.c create class cafe with ArrayList coffeeMenu and getList() method
    private ArrayList<String> coffeeMenu;

    public Cafe() {
        this.coffeeMenu = new ArrayList<>();
    }

    public ArrayList<String> getCoffeeMenu(){
        return coffeeMenu;
    }

    //2.c make a method loadData()
    public void loadMenuData() throws FileNotFoundException {
        //2.d read the file using a scanner object
        //try {
            File file = new File("data/coffees.txt");
            Scanner sc = new Scanner(file);
            //2.e Loop trough file and add to the lines to coffeeMenu
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                coffeeMenu.add(line);
            }

        //} catch (FileNotFoundException e) {
            //throw new RuntimeException("File not found. Check path or filename",e);

       // }
    }
}
