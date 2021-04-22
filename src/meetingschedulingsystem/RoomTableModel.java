package meetingschedulingsystem;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class RoomTableModel extends AbstractTableModel {
    private final String[] columnNames = {"Room", "Number of Meetings", "Slots taken"}; //same as before...
    private Object[][] data = {{}};//same as before...
    private ArrayList<Object[]> dataList = new ArrayList<>();
    private ArrayList<Room> roomsList = new ArrayList<>();

    public RoomTableModel() {
    }
    
    public void clearData() {
        roomsList.clear();
        dataList.clear();
        refreshTable();
    }
    
    public void addRoom(Room room) {
        roomsList.add(room);
        int meetingNum = room.getMeetings().size();
        int remSlots = 8 - meetingNum;
        Object[] roomData = {room.getID(), meetingNum, String.format("   %d/8", meetingNum)};
        dataList.add(roomData);
        refreshTable();
    }
    
    public void removeRoom(Room room) {
        dataList.remove(roomsList.indexOf(room));
        roomsList.remove(room);
        refreshTable();
    }
    
    public Room getRoomAtIndex(int indx) {
        return roomsList.get(indx);
    }
    
    public void refreshTable() {
        data = dataList.toArray(new Object[dataList.size()][]);
    }
    
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
}
