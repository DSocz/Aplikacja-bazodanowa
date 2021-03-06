/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import PanelsEntity.Bank;
import PanelsEntity.Klienci;
import PanelsEntity.Oddzialy;
import PanelsEntity.Oferta;
import PanelsEntity.Poczta;
import PanelsEntity.Pracownicy;
import PanelsEntity.Realizacje;
import PanelsEntity.Urzadzenia;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author Daria
 */
public class Admin_menu extends javax.swing.JInternalFrame {

    GridBagLayout layout = new GridBagLayout();
    public Oddzialy oddzial;
    public Urzadzenia urzadzenia;
    public Pracownicy pracownicy;
    public Bank bank;
    public Poczta poczta;
    public Klienci klienci;
    public Realizacje realizacje;
    public Oferta oferta;
    /**
     * Creates new form Admin_menu
     */
    public Admin_menu(String PASS, String USER) {
        initComponents();
        this.setVisible(true);
        
        
        PanelDynamic.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 1;
        
        oddzial = new Oddzialy(PASS, USER);
        PanelDynamic.add(oddzial,c);
        pack();
        oddzial.setVisible(false);
        
        urzadzenia = new Urzadzenia(PASS,USER);
        PanelDynamic.add(urzadzenia,c);
        pack();
        urzadzenia.setVisible(false);
        
        pracownicy = new Pracownicy(PASS,USER);
        PanelDynamic.add(pracownicy,c);
        pack();
        pracownicy.setVisible(false); 
        
        bank = new Bank(PASS,USER);
        PanelDynamic.add(bank,c);
        pack();
        bank.setVisible(false);
        
        poczta = new Poczta(PASS,USER);
        PanelDynamic.add(poczta,c);
        pack();
        poczta.setVisible(false);
        
        klienci = new Klienci(PASS, USER);
        PanelDynamic.add(klienci,c);
        pack();
        klienci.setVisible(false);
        
        realizacje = new Realizacje(PASS, USER);
        PanelDynamic.add(realizacje,c);
        pack();
        realizacje.setVisible(false);
        
        oferta = new Oferta(PASS, USER);
        PanelDynamic.add(oferta,c);
        pack();
        oferta.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PaneButton = new javax.swing.JPanel();
        ButtonOddzial = new javax.swing.JButton();
        ButtonUrzadzenia = new javax.swing.JButton();
        ButtonPoczta = new javax.swing.JButton();
        PanelDynamic = new javax.swing.JPanel();

        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1300, 419));

        PaneButton.setBackground(new java.awt.Color(153, 204, 255));
        PaneButton.setForeground(new java.awt.Color(153, 204, 255));

        ButtonOddzial.setText("ODDZIAŁY");
        ButtonOddzial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOddzialActionPerformed(evt);
            }
        });

        ButtonUrzadzenia.setText("URZADZENIA ");
        ButtonUrzadzenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUrzadzeniaActionPerformed(evt);
            }
        });

        ButtonPoczta.setText("POCZTA");
        ButtonPoczta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPocztaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PaneButtonLayout = new javax.swing.GroupLayout(PaneButton);
        PaneButton.setLayout(PaneButtonLayout);
        PaneButtonLayout.setHorizontalGroup(
            PaneButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaneButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonOddzial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonUrzadzenia, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(ButtonPoczta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PaneButtonLayout.setVerticalGroup(
            PaneButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonOddzial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonUrzadzenia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonPoczta)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        getContentPane().add(PaneButton, java.awt.BorderLayout.LINE_START);

        PanelDynamic.setPreferredSize(new java.awt.Dimension(17000, 385));
        PanelDynamic.setRequestFocusEnabled(false);
        PanelDynamic.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout PanelDynamicLayout = new javax.swing.GroupLayout(PanelDynamic);
        PanelDynamic.setLayout(PanelDynamicLayout);
        PanelDynamicLayout.setHorizontalGroup(
            PanelDynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1461, Short.MAX_VALUE)
        );
        PanelDynamicLayout.setVerticalGroup(
            PanelDynamicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        getContentPane().add(PanelDynamic, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonOddzialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOddzialActionPerformed
        // TODO add your handling code here:
        oddzial.setVisible(true);
        urzadzenia.setVisible(false);
        pracownicy.setVisible(false);
        bank.setVisible(false);
        poczta.setVisible(false);
        realizacje.setVisible(false);
        klienci.setVisible(false);
        oferta.setVisible(false);
    }//GEN-LAST:event_ButtonOddzialActionPerformed

    private void ButtonUrzadzeniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUrzadzeniaActionPerformed
        urzadzenia.setVisible(true);
        oddzial.setVisible(false);
        pracownicy.setVisible(false);
        bank.setVisible(false);
        poczta.setVisible(false);
        realizacje.setVisible(false);
        klienci.setVisible(false);
        oferta.setVisible(false);
    }//GEN-LAST:event_ButtonUrzadzeniaActionPerformed

    private void ButtonPocztaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPocztaActionPerformed
        bank.setVisible(false);
        urzadzenia.setVisible(false);
        oddzial.setVisible(false);
        pracownicy.setVisible(false);
        poczta.setVisible(true);
        realizacje.setVisible(false);
        klienci.setVisible(false);
        oferta.setVisible(false);
    }//GEN-LAST:event_ButtonPocztaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonOddzial;
    private javax.swing.JButton ButtonPoczta;
    private javax.swing.JButton ButtonUrzadzenia;
    private javax.swing.JPanel PaneButton;
    private javax.swing.JPanel PanelDynamic;
    // End of variables declaration//GEN-END:variables
}
