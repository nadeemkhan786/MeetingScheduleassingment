package meetingschedulingsystem;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class PeopleMenu extends javax.swing.JFrame {
    
    private PeopleTableModel ptm = new PeopleTableModel();
    private ListSelectionModel lsm;
    
    /**
     * Creates new form MeetingsMenu
     */
    public PeopleMenu() {
        initComponents();
        initTable();
        initSettings();
        updateModel();
        initListenerUpdate();
    }
    
    private void showNoPersonSelected() {
        JOptionPane.showMessageDialog(this,
                "Please select a person first.",
                "Person not selected",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void initSettings() {
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(this);
    }
    
    private void initTable() {
        meetingTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        meetingTable.getTableHeader().setReorderingAllowed(false);
    }
    
    /**
     * Updates table every time it is somehow changed/affected/focused on etc.
     */
    private void initListenerUpdate() {
        this.addWindowStateListener(new WindowAdapter() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                updateModel();
            }
            @Override
            public void windowStateChanged(WindowEvent e) {
                updateModel();
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                updateModel();
            }
            
            @Override
            public void windowDeactivated(WindowEvent e) {
                updateModel();
            }
            
            @Override
            public void windowActivated(WindowEvent e) {
                updateModel();
            }
            
            @Override
            public void windowOpened(WindowEvent e) {
                updateModel();
            }
            
        });
    }
    
    private void updateModel() {
        ptm.clearData();
        for (Person pers : DataManager.getPeople()) {
            ptm.addPerson(pers);
        }
        ptm.refreshTable();
        meetingTable.setModel(ptm);
        meetingTable.getTableHeader().resizeAndRepaint();
        meetingTable.updateUI();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        meetingTable = new javax.swing.JTable();
        addNewButton = new javax.swing.JButton();
        delSelButton = new javax.swing.JButton();
        showSelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Participents List");

        meetingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title", "Room", "Time", "# Attendees"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        meetingTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        meetingTable.setShowVerticalLines(false);
        jScrollPane1.setViewportView(meetingTable);

        addNewButton.setText("Add New");
        addNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewButtonActionPerformed(evt);
            }
        });

        delSelButton.setText("Delete All Selected");
        delSelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delSelButtonActionPerformed(evt);
            }
        });

        showSelButton.setText("Show First Selected");
        showSelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addNewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delSelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showSelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showSelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delSelButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void addNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewButtonActionPerformed
        AddPersonDialog addDialog = new AddPersonDialog(this, true);
        addDialog.setVisible(true);
        addDialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                updateModel();
            }
        });
    }//GEN-LAST:event_addNewButtonActionPerformed
    
    private void delSelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delSelButtonActionPerformed
        if (meetingTable.getSelectedRows().length == 0){
            showNoPersonSelected();
            return;
        }
        int [] selectedRows = meetingTable.getSelectedRows();
        int confirmCancel = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to remove the selected person(s)?",
                "Removing Person", JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (confirmCancel == JOptionPane.YES_OPTION) {
            int removeCount = 0;
            boolean failRemove = false;
            for (int rowindx: selectedRows) {
                Person selectedPerson = ptm.getPersonAtIndex(rowindx);
                if (DataManager.removePerson(selectedPerson)) {
                    removeCount++;
                } else {
                    failRemove = true;
                }
            }
            if (failRemove) {
                JOptionPane.showMessageDialog(this,"Failed to remove: "+(selectedRows.length-removeCount)
                        +" person(s).\nYou cannot delete people attending meetings.", 
                        "Fail remove", JOptionPane.ERROR_MESSAGE);
            }
            updateModel();
            JOptionPane.showMessageDialog(this, removeCount+" Person(s) removed succesfully.");
        }
        meetingTable.clearSelection();
    }//GEN-LAST:event_delSelButtonActionPerformed
    
    private void showSelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSelButtonActionPerformed
        if (meetingTable.getSelectedRow() < 0){
            showNoPersonSelected();
            return;
        }
        int selectedRow = meetingTable.getSelectedRow();
        Person selectedPerson = ptm.getPersonAtIndex(selectedRow);
        ShowPersonDialog showpers = new ShowPersonDialog(this,true,selectedPerson);
        showpers.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e); //To change body of generated methods, choose Tools | Templates.
                updateModel();
            }
        });
        showpers.setVisible(true);
        meetingTable.clearSelection();
    }
    
    private javax.swing.JButton addNewButton;
    private javax.swing.JButton delSelButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable meetingTable;
    private javax.swing.JButton showSelButton;
   
}
