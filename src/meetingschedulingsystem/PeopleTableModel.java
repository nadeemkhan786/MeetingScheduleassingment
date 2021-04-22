package meetingschedulingsystem;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class PeopleTableModel extends AbstractTableModel {
    private final String[] columnNames = {"First", "Last", "Phone"};//same as before...
    private Object[][] data;
    private final ArrayList<Object[]> dataList = new ArrayList<>();
    private final ArrayList<Person> peopleList = new ArrayList<>();

    public PeopleTableModel() {
        this.data = new Object[][]{};
    }
    
    public void clearData() {
        peopleList.clear();
        dataList.clear();
        refreshTable();
    }
    
    public void addPerson(Person pers) {
        peopleList.add(pers);
        Object[] meetData = {pers.getFirstName(), pers.getLastName(), pers.getPhoneNumber()};
        dataList.add(meetData);
        refreshTable();
    }
    
    public void removeMeeting(Person pers) {
        dataList.remove(peopleList.indexOf(pers));
        peopleList.remove(pers);
        refreshTable();
    }
    
    public Person getPersonAtIndex(int indx) {
        return peopleList.get(indx);
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
