package meetingschedulingsystem;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * The Room class, this is used to create room objects, it holds meeting objects held in the room.
 */

/**
 * A class for room objects in this project
 */
public class Room implements Serializable{
    
    private final String ID;
    private ArrayList<Meeting> meetings;
    
    /** 
     * Constructor  
     * @param ID unique identification of the room
     */
    public Room(String ID) {
        this.ID = ID;
        meetings = new ArrayList<>(10); // initial capacity 10
    }
    
    /** 
     * Constructor  
     * @param ID unique identification of the room
     */
    public Room(Integer ID) {
        this(ID.toString());
    }

    /**
     * Get the value of ID
     *
     * @return the value of ID
     */
    public String getID() {
        return ID;
    }   
    
    /**
     * Adds a meeting to the room
     * @param meet Meeting being added
     */
    public void addMeeting(Meeting meet) {
        meetings.add(meet);
    }
    
    /**
     * Remove a meeting from the room
     * @param meet Meeting being removed
     */
    public void removeMeeting(Meeting meet) {
        System.out.println(meetings.remove(meet));
    }

    /**
     * Checks if the time slot is taken
     * @param time Integer time (hour) being checked
     * @return true if time slot is taken
     */
    public boolean isTimeslotTaken(int time) {
        for (Meeting meet : meetings) {
            if (time == meet.getTimeSlot()) {
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Meeting> getMeetings() {
        return meetings;
    }

    @Override
    public String toString() {
        return ID; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
