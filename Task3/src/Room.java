//3.a create class Room
public class Room {
    private int numberOfLamps;
    private int numberOfWindows;

    //3.b create constructor which assigns values to the attributes
    public Room(int numberOfLamps, int numberOfWindows) {
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }
    //3.c create getter and setters for the fields
    public int getNumberOfLamps(){
        return this.numberOfLamps;
    }
    public int getNumberOfWindows() {
        return this.numberOfWindows;
    }
    public void setNumberOfLamps(int numberOfLamps){
        this.numberOfLamps = numberOfLamps;
    }
    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

}
