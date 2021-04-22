package meetingschedulingsystem;


public class MeetingSchedulingSystem {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        init();
        initGUI();
    }
    
    /**
     * Initializes application
     */
    public static void init() {
        DataManager.init();
        
        // Some Sample data
        Room room1 = new Room(1);
        Room room2 = new Room(2);
        Room room3 = new Room("Meeting Rooms");
        Meeting sample1 = new Meeting("USA meeting onshore", "1", 9);
        Meeting sample2 = new Meeting("Offshore meeting", "2", 12);
        DataManager.addRoom(room1);
        DataManager.addRoom(room2);
        DataManager.addRoom(room3);
        boolean x = DataManager.addMeeting(sample1);
        boolean y = DataManager.addMeeting(sample2);
        Person me = new Person("Person1", "a", "717-460-6012");
        Person pers1 = new Person("person2", "b", "123-989-0123");
        DataManager.addPerson(me);
        DataManager.addPerson(pers1);
    }
    
    /**
     * Initializes GUI of application
     */
    public static void initGUI() {
        LoadingFrame load = new LoadingFrame();
        MainMenu main = new MainMenu();
    }
}
