/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.DaoEntity;
import java.util.List;
import javax.persistence.Query;
import javax.swing.table.DefaultTableModel;
import model.Produit;

/**
 *
 * @author socrates
 */
public class ProduitView extends javax.swing.JFrame {

    /**
     * Creates new form ProduitView
     */
    public ProduitView() {
        initComponents();
        remplirTableau();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        designation = new javax.swing.JTextField();
        pu = new javax.swing.JTextField();
        enregistrer = new javax.swing.JButton();
        modifier = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        produitTable = new javax.swing.JTable();

        textField1.setText("textField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Désignation");

        jLabel2.setText("Prix  unitaire(FCFA)");

        designation.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        designation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designationActionPerformed(evt);
            }
        });

        enregistrer.setText("Enregistrer");
        enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerActionPerformed(evt);
            }
        });

        modifier.setText("Modifier");
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });

        supprimer.setText("Supprimer");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });

        produitTable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        produitTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero", "Designation", "Prix unitaire(FCFA)"
            }
        ));
        produitTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produitTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(produitTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(enregistrer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifier)
                .addGap(18, 18, 18)
                .addComponent(supprimer)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(designation, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(pu))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(pu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supprimer)
                    .addComponent(modifier)
                    .addComponent(enregistrer))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void designationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_designationActionPerformed

    private void enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerActionPerformed
          DaoEntity dao = new DaoEntity();
          Produit prod = new Produit();
          prod.setDesignation(designation.getText());
          prod.setPu(Integer.valueOf(pu.getText()));
          prod.setSupp(false);
          
          dao.Enregistrer(prod);
          viderChamps();
          remplirTableau();
          this.setVisible(false);
    }//GEN-LAST:event_enregistrerActionPerformed

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
         DaoEntity dao = new DaoEntity();
         Produit prod = new Produit();
         prod.setCodeprod(Integer.valueOf(numprod));
         prod.setDesignation(designation.getText());
         prod.setPu(Integer.valueOf(pu.getText()));
         prod.setSupp(false);
         dao.modifier(prod);
         viderChamps();
         remplirTableau();
    }//GEN-LAST:event_modifierActionPerformed
    
    
    public String numprod;
    private void produitTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produitTableMouseClicked
         int ligne = produitTable.getSelectedRow();
         
         numprod =String.valueOf(produitTable.getModel().getValueAt(ligne, 0)) ;
         designation.setText((String) produitTable.getModel().getValueAt(ligne, 1));
         pu.setText(String.valueOf(produitTable.getModel().getValueAt(ligne, 2)) );
         
    }//GEN-LAST:event_produitTableMouseClicked

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
         DaoEntity dao = new DaoEntity();
         Produit prod = new Produit();
         prod.setCodeprod(Integer.valueOf(numprod));
         prod.setDesignation(designation.getText());
         prod.setPu(Integer.valueOf(pu.getText()));
         prod.setSupp(true);
         dao.modifier(prod);
         viderChamps();
         remplirTableau();
    }//GEN-LAST:event_supprimerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProduitView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProduitView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProduitView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProduitView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProduitView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField designation;
    private javax.swing.JButton enregistrer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifier;
    private javax.swing.JTable produitTable;
    private javax.swing.JTextField pu;
    private javax.swing.JButton supprimer;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables

    public void viderChamps() {
        designation.setText("");
        pu.setText(" ");
        
    }

    public void remplirTableau() {
        DaoEntity dao = new DaoEntity();
        dao.getEmf();
        dao.getEm();  
        DefaultTableModel model = (DefaultTableModel) produitTable.getModel();
        model.setNumRows(0);
        
        String str = "SELECT p FROM Produit p WHERE p.supp=false ORDER BY p.codeprod ASC";
        Query query = dao.getEm().createQuery(str);        
        List <Produit> produits =  query.getResultList();
        for( Produit prod:produits){
           Object codeprod = prod.getCodeprod();
           Object designationProd = prod.getDesignation();
           Object puProd = prod.getPu();
           
           model.addRow(new  Object []{codeprod,designationProd,puProd});
        }
        
       dao.fermer();
    }
}
