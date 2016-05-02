/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanelsEntity;

import AddFrames.AddUrzadzenie;
import AddFrames.UpdateUrzadzenia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Urzadzenia extends javax.swing.JPanel 
{
    private AddUrzadzenie AddU;
    private Connection con;
    private Statement st;
    private ResultSet Res;
    private DefaultTableModel DIM;
    private String PASS, USER;
    private UpdateUrzadzenia UpDate;
   
    public Urzadzenia(String pass, String user) 
    {
        initComponents();
        
        PASS = pass;
        USER = user;
        AddU = new AddUrzadzenie(PASS, USER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ButtonDodaj = new javax.swing.JButton();
        ButtonEdytuj = new javax.swing.JButton();
        ButtonUsun = new javax.swing.JButton();
        ButtonWyswietlAll = new javax.swing.JButton();
        ButtonFiltruj = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox3 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "ID", "Typ", "Miejscowość", "Ulica", "Nr budynku", "Opis lokalizacji", "Ostatnie uzpuełnienie", "Ostatnia konswerwacja"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(9);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(9);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(12);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(12);
        }

        ButtonDodaj.setText("DODAJ");
        ButtonDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDodajActionPerformed(evt);
            }
        });

        ButtonEdytuj.setText("EDYTUJ");
        ButtonEdytuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEdytujActionPerformed(evt);
            }
        });

        ButtonUsun.setText("USUŃ");
        ButtonUsun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUsunActionPerformed(evt);
            }
        });

        ButtonWyswietlAll.setText("WYŚWIETL WSZYSTKO");
        ButtonWyswietlAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonWyswietlAllActionPerformed(evt);
            }
        });

        ButtonFiltruj.setText("FILTRUJ");
        ButtonFiltruj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFiltrujActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Miejscowosc");

        jCheckBox3.setText("Ulica");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonEdytuj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonUsun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonDodaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ButtonWyswietlAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonFiltruj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox2)
                                    .addComponent(jCheckBox3))
                                .addGap(58, 58, 58)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonDodaj)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonEdytuj)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonUsun))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonWyswietlAll, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonFiltruj, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDodajActionPerformed
        // TODO add your handling code here:
        AddU.setVisible(true);
    }//GEN-LAST:event_ButtonDodajActionPerformed

    private void ButtonWyswietlAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonWyswietlAllActionPerformed
        
        Object[] columnNames = {"ID","Typ","Miejscowość", "Ulica", "Nr Budynku", "Opis lokalizacji", "Ostatnie Uzupełnienie", "Ostatnia Konserwacja"};
        DIM = new DefaultTableModel();
        DIM.setColumnIdentifiers(columnNames);
        
         try 
            {   
                Class.forName("oracle.jdbc.OracleDriver");
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:bank",USER,PASS);
                st = con.createStatement();
                String sql = "SELECT * FROM URZADZENIA_ZEWNETRZNE";
                Res = st.executeQuery(sql);
                
                
                while(Res.next())    
                {
                    String id_urzadzenia = Res.getString("ID_URZADZENIA");
                    String typ = Res.getString("TYP_URZADZENIA");
                    String miejscowosc = Res.getString("MIEJSCOWOSC");
                    String ulica = Res.getString("ULICA");
                    String nr_budynku = Res.getString("NR_BUDYNKU");
                    String opis_lokalizacji = Res.getString("OPIS_LOKALIZACJI");
                    String data_uzupelnienia = Res.getString("DATA_OSTATNIEGO_UZUPELNIENIA");
                    String data_konserwacji = Res.getString("DATA_KONSERWACJI");

                    Object[] object = {id_urzadzenia, typ, miejscowosc, ulica, nr_budynku, opis_lokalizacji, data_uzupelnienia, data_konserwacji};
                    DIM.addRow(object);
                    
                }
                    
                Res.close();
                st.close();
                con.close();
            }
            catch(Exception e){JOptionPane.showMessageDialog(null, e);}
           
            jTable1.setModel(DIM); 
        
        
    }//GEN-LAST:event_ButtonWyswietlAllActionPerformed

    private void ButtonUsunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUsunActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() != -1) 
        {
            String id_r = (jTable1.getValueAt(jTable1.getSelectedRow(), 0)).toString();
            int a = 0;
            try 
                {
                    Class.forName("oracle.jdbc.OracleDriver");
                    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:bank",USER,PASS);
                    st = con.createStatement();
                    //String sql = "SELECT * FROM ODDZIALY_BANKOWE";
                    String sql = "DELETE FROM \"URZADZENIA_ZEWNETRZNE\" WHERE \"ID_URZADZENIA\" = " + id_r;
                    Res = st.executeQuery(sql);
                }
            catch(Exception e)
             {
                a = 1;
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Nie można usunąć urządzenia.");
             }
            if (a == 0)  {JOptionPane.showMessageDialog(null, "Usunięto urządzenia");}
        }
    }//GEN-LAST:event_ButtonUsunActionPerformed

    private void ButtonEdytujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEdytujActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() != -1) 
        {
        String id_urzadzenia = (jTable1.getValueAt(jTable1.getSelectedRow(), 0)).toString();
        UpDate = new UpdateUrzadzenia(PASS,USER,id_urzadzenia);
        UpDate.setVisible(true);
         
        }
    }//GEN-LAST:event_ButtonEdytujActionPerformed

    private void ButtonFiltrujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFiltrujActionPerformed
        // TODO add your handling code here:
        Object[] columnNames = {"ID","Typ","Miejscowość", "Ulica", "Nr Budynku", "Opis lokalizacji", "Ostatnie Uzupełnienie", "Ostatnia Konserwacja"};
        DIM = new DefaultTableModel();
        DIM.setColumnIdentifiers(columnNames);
        
         try 
            {   
                Class.forName("oracle.jdbc.OracleDriver");
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:bank",USER,PASS);
                st = con.createStatement();
                String sql = "SELECT * FROM URZADZENIA_ZEWNETRZNE";
                
          
                if(jCheckBox2.isSelected())
                {
                    sql = "SELECT * FROM URZADZENIA_ZEWNETRZNE WHERE MIEJSCOWOSC =" + "'"+jTextField1.getText()+"'";
                }
                if(jCheckBox3.isSelected())
                {
                    sql = "SELECT * FROM URZADZENIA_ZEWNETRZNE WHERE ULICA =" + "'"+jTextField2.getText()+"'";
                }
                if(jCheckBox3.isSelected() && jCheckBox2.isSelected())
                {
                    sql = "SELECT * FROM URZADZENIA_ZEWNETRZNE WHERE ULICA =" + "'"+jTextField2.getText()+"'" +" AND MIEJSCOWOSC =" + "'"+jTextField1.getText()+"'";
                }

                Res = st.executeQuery(sql);
                
                
                while(Res.next())    
                {
                    String id_urzadzenia2 = Res.getString("ID_URZADZENIA");
                    String typ = Res.getString("TYP_URZADZENIA");
                    String miejscowosc = Res.getString("MIEJSCOWOSC");
                    String ulica = Res.getString("ULICA");
                    String nr_budynku = Res.getString("NR_BUDYNKU");
                    String opis_lokalizacji = Res.getString("OPIS_LOKALIZACJI");
                    String data_uzupelnienia = Res.getString("DATA_OSTATNIEGO_UZUPELNIENIA");
                    String data_konserwacji = Res.getString("DATA_KONSERWACJI");

                    Object[] object = {id_urzadzenia2, typ, miejscowosc, ulica, nr_budynku, opis_lokalizacji, data_uzupelnienia, data_konserwacji};
                    DIM.addRow(object);
                    
                }
                    
                Res.close();
                st.close();
                con.close();
                
            }
        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
           
        jTable1.setModel(DIM); 
        
        
        
    }//GEN-LAST:event_ButtonFiltrujActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDodaj;
    private javax.swing.JButton ButtonEdytuj;
    private javax.swing.JButton ButtonFiltruj;
    private javax.swing.JButton ButtonUsun;
    private javax.swing.JButton ButtonWyswietlAll;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
