
package meetingschedulingsystem;

import java.io.Serializable;
import java.util.ArrayList;


public class Data implements Serializable {
    private final ArrayList<Room> rooms;
    private final ArrayList<Person> people;
    private final ArrayList<Meeting> meetings;

    public Data(ArrayList<Room> rooms, ArrayList<Person> people, ArrayList<Meeting> meetings) {
        this.rooms = rooms;
        this.people = people;
        this.meetings = meetings;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public ArrayList<Meeting> getMeetings() {
        return meetings;
    }
    
}
