/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanelsEntity;

import AddFrames.AddOddzialy;
import AddFrames.UpdateOddzialu;
import bank_projekt1.DataListOddzialy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daria
 */
public class Oddzialy extends javax.swing.JPanel {

    static Statement st;
    private Connection con;
    private ResultSet rs, rs1;
    private String USERa, PASSa;
    private AddOddzialy AddO;
    private UpdateOddzialu UpDate;
    //private ArrayList data = new ArrayList();
    DefaultTableModel dlm = new DefaultTableModel();
    
    
    public Oddzialy(String PASS, String USER) {
        initComponents();
        PASSa = PASS;
        USERa = USER;
        AddO = new AddOddzialy(PASS, USER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonAddOddzialy = new javax.swing.JButton();
        ButtonEditOddzialy = new javax.swing.JButton();
        ButtonDeleteOddzialy = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ButtonWyswietlAll = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();

        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ButtonAddOddzialy.setText("DODAJ");
        ButtonAddOddzialy.setPreferredSize(new java.awt.Dimension(69, 23));
        ButtonAddOddzialy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddOddzialyActionPerformed(evt);
            }
        });

        ButtonEditOddzialy.setText("EDYTUJ");
        ButtonEditOddzialy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditOddzialyActionPerformed(evt);
            }
        });

        ButtonDeleteOddzialy.setText("USUŃ");
        ButtonDeleteOddzialy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteOddzialyActionPerformed(evt);
            }
        });

        jButton1.setText("FILTRUJ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ButtonWyswietlAll.setText("WYŚWIETL  CAŁOŚĆ");
        ButtonWyswietlAll.setActionCommand("P");
        ButtonWyswietlAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonWyswietlAllActionPerformed(evt);
            }
        });

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Miejscowosc", "Ulica", "Nr Budynku", "Nr telefonu", "Email", "Data założenia", "Kod pocztowy"
            }
        ));
        jScrollPane1.setViewportView(Table1);
        if (Table1.getColumnModel().getColumnCount() > 0) {
            Table1.getColumnModel().getColumn(0).setResizable(false);
            Table1.getColumnModel().getColumn(0).setPreferredWidth(5);
            Table1.getColumnModel().getColumn(1).setPreferredWidth(10);
            Table1.getColumnModel().getColumn(3).setResizable(false);
            Table1.getColumnModel().getColumn(3).setPreferredWidth(5);
            Table1.getColumnModel().getColumn(4).setPreferredWidth(10);
            Table1.getColumnModel().getColumn(6).setPreferredWidth(10);
            Table1.getColumnModel().getColumn(7).setPreferredWidth(7);
        }

        jCheckBox1.setText("Miejscowość");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Ulica");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonEditOddzialy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonAddOddzialy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonDeleteOddzialy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(296, 296, 296)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonWyswietlAll)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jCheckBox2))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonWyswietlAll, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonAddOddzialy, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(ButtonEditOddzialy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonDeleteOddzialy)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonWyswietlAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonWyswietlAllActionPerformed
               
           
        
            Object[] columnNames = {"ID", "Miejscowosc", "Ulica", "Nr Budynku",
                                  "Nr telefonu", "Email", "Data założenia", "Kod pocztowy"};
           // DefaultTableModel dlm = new DefaultTableModel();
            for( int i = dlm.getRowCount() - 1; i >= 0; i-- )
            {
                dlm.removeRow(i);
            }
            
            ArrayList data = new ArrayList();
            dlm.setColumnIdentifiers(columnNames);
            
        
            try 
                {
                    
                    Class.forName("oracle.jdbc.OracleDriver");
                    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:bank",USERa,PASSa);
                    st = con.createStatement();
                    String sql = "SELECT * FROM ODDZIALY_BANKOWE";
                    rs = st.executeQuery(sql);
                    
                    String Miejscowosc = "null";
                    String Kod_pocztowy = "null";
                    

                    while(rs.next())
                    {
                        String ID_O = rs.getString("ID_ODDZIALU");
                        int ID_2 = rs.getInt("ID_POCZTY");                  
                        String Ulica = rs.getString("ULICA");
                        String Nr_Budynku = rs.getString("NR_BUDYNKU");
                        String Nr_telefonu = rs.getString("NUMER_KONTAKTOWY");
                        String Email= rs.getString("MAIL");
                        String Data_założenia = rs.getString("DATA_ZALOZENIA"); 
               
                        DataListOddzialy l = new DataListOddzialy(ID_O, Ulica, Nr_Budynku,Nr_telefonu, Email, Data_założenia, ID_2);
                        data.add(l);
      
                    }
                    
                    for (int i = 0; i < data.size(); i++) 
                    {
        		DataListOddzialy l = (DataListOddzialy)data.get(i);
                        String sql1 = "SELECT * FROM POCZTY WHERE ID_POCZTY =" + "'"+l.ID_P+"'";
                        rs1 = st.executeQuery(sql1);
                        
                        while(rs1.next())
                        {
                            Miejscowosc = rs1.getString("MIEJSCOWOSC");
                            Kod_pocztowy = rs1.getString("KOD_POCZTOWY");
                            Object[] object = {l.ID_O,Miejscowosc, l.Ulica, l.Nr_Budynku, l.Nr_telefonu, l.Email, l.Data_zalozenia, Kod_pocztowy};
                            dlm.addRow(object);
                        }
                    
                    }
                    
                    rs.close();
                    st.close();
                    con.close();
                }
            catch(Exception e){JOptionPane.showMessageDialog(null, e);}
           
           Table1.setModel(dlm);
           
           
           
    }//GEN-LAST:event_ButtonWyswietlAllActionPerformed

    private void ButtonAddOddzialyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddOddzialyActionPerformed
        // TODO add your handling code here:
        AddO.setVisible(true);
    }//GEN-LAST:event_ButtonAddOddzialyActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void ButtonDeleteOddzialyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteOddzialyActionPerformed
        // TODO add your handling code here:
        
        if (Table1.getSelectedRow() != -1) 
        {
             String id_r = (Table1.getValueAt(Table1.getSelectedRow(), 0)).toString();
             int a = 0;
             try 
                {
                    Class.forName("oracle.jdbc.OracleDriver");
                    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:bank",USERa,PASSa);
                    st = con.createStatement();
                    //String sql = "SELECT * FROM ODDZIALY_BANKOWE";
                    String sql = "DELETE FROM \"ODDZIALY_BANKOWE\" WHERE \"ID_ODDZIALU\" = " + id_r;
                    rs = st.executeQuery(sql);
                }
             
             catch(Exception e)
             {
                a = 1;
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Nie można usunąć oddziału.");
             }
         if (a == 0)  {JOptionPane.showMessageDialog(null, "Usunięto oddział");}
        }
    }//GEN-LAST:event_ButtonDeleteOddzialyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
        
        Object[] columnNames = {"ID", "Miejscowosc", "Ulica", "Nr Budynku",
                                  "Nr telefonu", "Email", "Data założenia", "Kod pocztowy"};
        
        for( int i = dlm.getRowCount() - 1; i >= 0; i-- )
            {
                dlm.removeRow(i);
            }
            
            ArrayList data = new ArrayList();
            ArrayList data1 = new ArrayList();
            dlm.setColumnIdentifiers(columnNames);
        
        try
        {
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:bank",USERa,PASSa);
            Statement st = con.createStatement();
            String sql = "SELECT * ODDZIALY_BANKOWE";
            
           /* if(jCheckBox1.isSelected())
            {
                sql = "SELECT * FROM POOCZTY WHERE MIEJSCOWOSC =" + "'"+jTextField1.getText()+"'";
                String id_poczty; 
                while(rs1.next())
                        {
                            id_poczty = rs1.getString("ID_POCZTY");
                            data1.add(id_poczty);
                        }
                for(int j= 0; j<= data1.size()-1; j++)
                
                {
                    sql = "SELECT * FROM ODDZIALY_BANKOWE WHERE ID_POCZTY =" + "'"+data1.get(j)+"'";
                
                rs = st.executeQuery(sql);
                    
                    String Miejscowosc = "null";
                    String Kod_pocztowy = "null";
                    

                    while(rs.next())
                    {
                        String ID_O = rs.getString("ID_ODDZIALU");
                        int ID_2 = rs.getInt("ID_POCZTY");                  
                        String Ulica = rs.getString("ULICA");
                        String Nr_Budynku = rs.getString("NR_BUDYNKU");
                        String Nr_telefonu = rs.getString("NUMER_KONTAKTOWY");
                        String Email= rs.getString("MAIL");
                        String Data_założenia = rs.getString("DATA_ZALOZENIA"); 
               
                        DataListOddzialy l = new DataListOddzialy(ID_O, Ulica, Nr_Budynku,Nr_telefonu, Email, Data_założenia, ID_2);
                        data.add(l);
      
                    }
                    
                    for (int i = 0; i < data.size(); i++) 
                    {
        		DataListOddzialy l = (DataListOddzialy)data.get(i);
                        String sql1 = "SELECT * FROM POCZTY WHERE ID_POCZTY =" + "'"+l.ID_P+"'";
                        rs1 = st.executeQuery(sql1);
                        
                        while(rs1.next())
                        {
                            Miejscowosc = rs1.getString("MIEJSCOWOSC");
                            Kod_pocztowy = rs1.getString("KOD_POCZTOWY");
                            Object[] object = {l.ID_O,Miejscowosc, l.Ulica, l.Nr_Budynku, l.Nr_telefonu, l.Email, l.Data_zalozenia, Kod_pocztowy};
                            dlm.addRow(object);
                        }
                    
                    }
                    
                    rs.close();
                    st.close();
                    con.close();
                }
                
            }*/
            if(jCheckBox2.isSelected())
            {
                sql = "SELECT * FROM ODDZIALY_BANKOWE WHERE ULICA =" + "'"+jTextField2.getText()+"'";
                
                rs = st.executeQuery(sql);
                    
                    String Miejscowosc = "null";
                    String Kod_pocztowy = "null";
                    

                    while(rs.next())
                    {
                        String ID_O = rs.getString("ID_ODDZIALU");
                        int ID_2 = rs.getInt("ID_POCZTY");                  
                        String Ulica = rs.getString("ULICA");
                        String Nr_Budynku = rs.getString("NR_BUDYNKU");
                        String Nr_telefonu = rs.getString("NUMER_KONTAKTOWY");
                        String Email= rs.getString("MAIL");
                        String Data_założenia = rs.getString("DATA_ZALOZENIA"); 
               
                        DataListOddzialy l = new DataListOddzialy(ID_O, Ulica, Nr_Budynku,Nr_telefonu, Email, Data_założenia, ID_2);
                        data.add(l);
      
                    }
                    
                    for (int i = 0; i < data.size(); i++) 
                    {
        		DataListOddzialy l = (DataListOddzialy)data.get(i);
                        String sql1 = "SELECT * FROM POCZTY WHERE ID_POCZTY =" + "'"+l.ID_P+"'";
                        rs1 = st.executeQuery(sql1);
                        
                        while(rs1.next())
                        {
                            Miejscowosc = rs1.getString("MIEJSCOWOSC");
                            Kod_pocztowy = rs1.getString("KOD_POCZTOWY");
                            Object[] object = {l.ID_O,Miejscowosc, l.Ulica, l.Nr_Budynku, l.Nr_telefonu, l.Email, l.Data_zalozenia, Kod_pocztowy};
                            dlm.addRow(object);
                        }
                    
                    }
                    
                    rs.close();
                    st.close();
                    con.close();
            
           
         
          
            }
            if(jCheckBox1.isSelected() && jCheckBox2.isSelected())
            {
                 sql = "SELECT * FROM ODDZIALY_BANKOWE WHERE ULICA =" + "'"+jTextField2.getText()+"'" +" AND MIEJSCOWOSC =" + "'"+jTextField1.getText()+"'";
            }
            
            
        }
        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
        Table1.setModel(dlm);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ButtonEditOddzialyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditOddzialyActionPerformed
        // TODO add your handling code here:
         if (Table1.getSelectedRow() != -1) 
        {
        String id_oddzialu = (Table1.getValueAt(Table1.getSelectedRow(), 0)).toString();
        UpDate = new UpdateOddzialu(PASSa,USERa,id_oddzialu);
        UpDate.setVisible(true);
        
        }
        
    }//GEN-LAST:event_ButtonEditOddzialyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAddOddzialy;
    private javax.swing.JButton ButtonDeleteOddzialy;
    private javax.swing.JButton ButtonEditOddzialy;
    private javax.swing.JButton ButtonWyswietlAll;
    private javax.swing.JTable Table1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
