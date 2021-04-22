package meetingschedulingsystem;

import javax.swing.table.DefaultTableModel;


public class MeetingScheduleTableModel extends DefaultTableModel {

    public MeetingScheduleTableModel(Object[][] data, Object[] columnNames) {
        super(data, columnNames);
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        return false; //To change body of generated methods, choose Tools | Templates.
    }
}
