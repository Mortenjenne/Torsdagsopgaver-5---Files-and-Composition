package Task3;

import java.util.ArrayList;

//3.d Create a class building with rooms and numberOfFLoors
public class Building {
    private ArrayList<Room> rooms;
    private int numberOfFloors;

    //3.e Create a constructor that populates the fields
    public Building(ArrayList<Room> rooms, int numberOfFloors) {
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    //3.f
    public ArrayList<Room> getRooms(){
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms){
        this.rooms = rooms;
    }

    public int getNumberOfFloors(){
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors){
        this.numberOfFloors = numberOfFloors;
    }
}
