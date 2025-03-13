package Task3;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        //3.g Instantiate at least three different rooms
        Room room1 = new Room(8,4);
        Room room2 = new Room(3,1);
        Room room3 = new Room(4,2);
        Room room4 = new Room(6,3);

        //3.h add the rooms to ArrayList<Room> rooms
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);

        //3.i Instantiate a new building with rooms from 3.h
        Building building = new Building(rooms,3);
        Building aNormalBuilding = new Building(rooms,5);

        System.out.println("Total number of lamps in the building: " + countLampsInBuilding(building));

        System.out.println("Total number of windows in the building: " + countWindowsInBuilding(building));

        System.out.println("Total number of rooms in the building: " + countRoomsInBuilding(building));

        System.out.println("Is the building normal? " + isNormal(building));
        System.out.println("Is the aNormalBuilding normal? " + isNormal(aNormalBuilding));

    }//main method

    //3.j create a static methods, that returns number of lamps, windows and rooms in the building.
    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room r: building.getRooms()) {
            totalLamps+= r.getNumberOfLamps();
        }
        return totalLamps;
    }
    public static int countWindowsInBuilding(Building building) {
        int totalWindows = 0;
        for(Room r: building.getRooms()){
            totalWindows += r.getNumberOfWindows();
        }
        return totalWindows;
    }
    public static int countRoomsInBuilding(Building building) {
        return building.getRooms().size();
    }

    //3.k create static method isNormal()
    public static boolean isNormal(Building building){
        return  building.getNumberOfFloors() <= countRoomsInBuilding(building);
    }

}//class Main