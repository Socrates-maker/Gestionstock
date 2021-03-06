/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.DaoEntity;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Client;
import model.Client_;
import model.Facture;
import model.Facturer;
import model.Produit;

/**
 *
 * @author socrates
 */
public class FacturerView extends javax.swing.JFrame {

    /**
     * Creates new form FacturerView
     */
    public Integer codecli = 0;
    public Integer codeprod = 0;
    public Boolean fenetreChange = true;
    public Integer indexSelectedProdTab=0 ; //Pour la gestion de la suppression d'un produit selectionne dans le tableau
    public FacturerView() {
        initComponents();
       // clientComboDataList();
        //produitComboDataList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        popupMenu1 = new java.awt.PopupMenu();
        jSlider1 = new javax.swing.JSlider();
        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        clientCombotBox = new javax.swing.JComboBox<>();
        nomClient = new javax.swing.JTextField();
        prenomClient = new javax.swing.JTextField();
        telClient = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addClient = new javax.swing.JToggleButton();
        facturer = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        produitCombobox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        designationProd = new javax.swing.JTextField();
        quantiteProd = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        addProduit = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listProduitTab = new javax.swing.JTable();
        ajoutProduitTab = new javax.swing.JToggleButton();
        enleverProduit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        coutTotalProd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        popupMenu1.setLabel("popupMenu1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.lightGray);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel2.setText("Nom");

        jLabel3.setText("Prenom");

        jLabel4.setText("Tel");

        clientCombotBox.setMaximumRowCount(100);
        clientCombotBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        clientCombotBox.setToolTipText("");
        clientCombotBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientCombotBoxMouseClicked(evt);
            }
        });
        clientCombotBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientCombotBoxActionPerformed(evt);
            }
        });

        nomClient.setEditable(false);
        nomClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomClientActionPerformed(evt);
            }
        });

        prenomClient.setEditable(false);

        telClient.setEditable(false);

        jLabel6.setText("Client");

        addClient.setText("+");
        addClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClientActionPerformed(evt);
            }
        });

        facturer.setText("Facturer");
        facturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturerActionPerformed(evt);
            }
        });

        jLabel7.setText("Produit");

        produitCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));
        produitCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produitComboboxActionPerformed(evt);
            }
        });

        jLabel8.setText("Designation");

        designationProd.setEditable(false);
        designationProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designationProdActionPerformed(evt);
            }
        });

        jLabel9.setText("Quantit??");

        addProduit.setText("+");
        addProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProduitActionPerformed(evt);
            }
        });

        listProduitTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codeprod", "Designation", "Quantit??", "Prix unitaire", "Co??t"
            }
        ));
        listProduitTab.setShowGrid(true);
        listProduitTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listProduitTabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listProduitTab);

        ajoutProduitTab.setText("+");
        ajoutProduitTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutProduitTabActionPerformed(evt);
            }
        });

        enleverProduit.setText("-");
        enleverProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enleverProduitActionPerformed(evt);
            }
        });

        jLabel10.setText("Co??t total:");

        coutTotalProd.setEditable(false);

        jLabel11.setText("Fcfa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(facturer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coutTotalProd, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telClient, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prenomClient, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomClient, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(produitCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addProduit))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(clientCombotBox, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addClient)))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(designationProd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(141, 141, 141)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(quantiteProd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ajoutProduitTab)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(enleverProduit))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(produitCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(designationProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(quantiteProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajoutProduitTab)
                    .addComponent(enleverProduit)
                    .addComponent(jLabel7)
                    .addComponent(addProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clientCombotBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addClient)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(prenomClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(facturer))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coutTotalProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomClientActionPerformed

    private void clientCombotBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientCombotBoxActionPerformed
        int index = clientCombotBox.getSelectedIndex();
        String comboItem =clientCombotBox.getModel().getElementAt(index);
        if(!comboItem.equals("---"))
        {
            String[] cliInfos = clientCombotBox.getItemAt(index).split(" ");
            System.out.println(cliInfos[0]);
            int numCli = Integer.valueOf(cliInfos[0]);
            System.out.println(numCli);
            getClientById(numCli);
        }else{
            nomClient.setText(" ");
            prenomClient.setText(" ");
            telClient.setText(" ");
            codecli = 0;
        }
        
    }//GEN-LAST:event_clientCombotBoxActionPerformed

    private void addClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClientActionPerformed
        fenetreChange = true;
        JFrame clientView = new ClientView();
        clientView.setVisible(true);
        clientView.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        clientView.setLocationRelativeTo(null);
        clientView.setTitle("Client");
       
    }//GEN-LAST:event_addClientActionPerformed

    private void designationProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designationProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_designationProdActionPerformed

    private void addProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProduitActionPerformed
        fenetreChange=true;
        JFrame produitView = new ProduitView();
        produitView.setVisible(true);
        produitView.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        produitView.setLocationRelativeTo(null);
        produitView.setTitle("Produit");
    }//GEN-LAST:event_addProduitActionPerformed

    private void clientCombotBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientCombotBoxMouseClicked

        
    }//GEN-LAST:event_clientCombotBoxMouseClicked

    private void produitComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produitComboboxActionPerformed
        int index = produitCombobox.getSelectedIndex();
        String comboItem =produitCombobox.getItemAt(index);
        if(!comboItem.equals("---")){
            String[] produit = comboItem.split(" ");
            designationProd.setText(produit[1]);
            codeprod = Integer.valueOf(produit[0]);
            
        }else{
            designationProd.setText(" "); 
            codeprod = 0;
        }
            
        
    }//GEN-LAST:event_produitComboboxActionPerformed

    private void facturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturerActionPerformed
       if(codecli != 0 && codeprod != 0){
            DaoEntity dao = new DaoEntity();
            dao.getEmf();
            dao.getEm();
            String str = "SELECT c FROM Client c WHERE c.numclient=?1";
            Query query = dao.getEm().createQuery(str);
            query.setParameter(1,codecli);
            Client client = (Client) query.getSingleResult();
            dao.fermer();
            Facture facture =new Facture();
            facture.setClient(client);
            Date date = new Date();
            facture.setDatefact(date);
            dao.Enregistrer(facture);
            
            //List <Facturer> facturer_v=null;
            int nbreRowTab = listProduitTab.getModel().getRowCount();
            //System.out.println(nbreRowTab);
            for(int i =0; i<nbreRowTab; i++ ){
                int idprod = (Integer)listProduitTab.getModel().getValueAt(i, 0);
                Produit produit = getProduitById(idprod); 
                Facturer facturer_e = new Facturer();
                facturer_e.setFacture(facture);
                facturer_e.setProduit(produit);
                facturer_e.setQtecde((Integer) quantiteProd.getValue());
                DaoEntity daofact = new DaoEntity();
                daofact.Enregistrer(facturer_e);
            }
            fenetreChange = true;
            JOptionPane.showMessageDialog(null, "Facture enr??gistr??e");
       }else{
           JOptionPane.showMessageDialog(null, "Produit ou client non selectionn??");
       }
        
        
        
    }//GEN-LAST:event_facturerActionPerformed

    private void ajoutProduitTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutProduitTabActionPerformed
        
        if(codeprod!=0){
            Object qte = quantiteProd.getValue();
            if ((Integer)qte<=0){
                JOptionPane.showMessageDialog(null, "Quantit?? non valide");
            }else{
                DefaultTableModel model=   (DefaultTableModel) listProduitTab.getModel();
                Object codeProd = codeprod;
                Object designation = designationProd.getText();
                Integer prixUnitaire = getProduitById().getPu();
                Object prixU = prixUnitaire;
                Object cout =(Integer)qte  * prixUnitaire;
                int listProduitTabSize = model.getRowCount();
                Boolean prod_exist = false;
                int index_exist = 0;
                int elemValue = 0;
                int new_quantity = 0;
                if(listProduitTabSize>0){
                    for(int i = 1;i<=listProduitTabSize;i++){
                        elemValue =(Integer) model.getValueAt(i-1, 0);
                        if(elemValue== codeprod){
                            prod_exist = true;
                            index_exist = i-1;
                            System.out.println("Element existant:"+model.getValueAt(i-1, 0));
                        }
                        else{
                            System.out.println("Element non existant:"+model.getValueAt(i-1, 0));
                        }
                    }
                }
                if(prod_exist){
                    new_quantity =(Integer)model.getValueAt(index_exist, 2) +(Integer) qte;
                    model.setValueAt(new_quantity, index_exist, 2);
                    model.setValueAt(new_quantity* prixUnitaire, index_exist, 4);
                }else{
                     model.addRow(new Object[]{codeProd,designation,qte,prixU,cout});
                }
               
            }
            calculerCoutProduit();
           
        }
        else
        {
            System.out.println("Aucun client ajout??");
            JOptionPane.showMessageDialog(null, "Aucun produit s??lectionn??");
        }
        
    }//GEN-LAST:event_ajoutProduitTabActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        if(fenetreChange){
            DefaultTableModel model = (DefaultTableModel) listProduitTab.getModel();
            model.setNumRows(0);
            coutTotalProd.setText(" ");
            clientComboDataList();
            produitComboDataList(); 
            fenetreChange = false;
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void enleverProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enleverProduitActionPerformed
        if(indexSelectedProdTab>0){
            DefaultTableModel model = (DefaultTableModel) listProduitTab.getModel();
            model.removeRow(indexSelectedProdTab);
        }
        else{
            JOptionPane.showMessageDialog(null,"veuillez selectionner un element ?? supprimer");
        }
    }//GEN-LAST:event_enleverProduitActionPerformed

    private void listProduitTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listProduitTabMouseClicked
        indexSelectedProdTab = listProduitTab.getSelectedRow();
    }//GEN-LAST:event_listProduitTabMouseClicked

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
            java.util.logging.Logger.getLogger(FacturerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacturerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacturerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacturerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacturerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton addClient;
    private javax.swing.JToggleButton addProduit;
    private javax.swing.JToggleButton ajoutProduitTab;
    private javax.swing.JComboBox<String> clientCombotBox;
    private javax.swing.JTextField coutTotalProd;
    private javax.swing.JTextField designationProd;
    private javax.swing.JButton enleverProduit;
    private javax.swing.JButton facturer;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable listProduitTab;
    private javax.swing.JTextField nomClient;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField prenomClient;
    private javax.swing.JComboBox<String> produitCombobox;
    private javax.swing.JSpinner quantiteProd;
    private javax.swing.JTextField telClient;
    // End of variables declaration//GEN-END:variables


    @SuppressWarnings("empty-statement")
   
    
    private void clientComboDataList(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) clientCombotBox.getModel();
        int size = model.getSize();
        System.out.println(size);
        while(size>1){
            int i=1;
           model.removeElementAt(i);
            i++;
            size = model.getSize();
        }
        DaoEntity dao = new DaoEntity();
        dao.getEmf();
        dao.getEm(); 
        String str = "SELECT c FROM Client c WHERE c.supp=false ORDER BY c.numclient DESC";
        Query query = dao.getEm().createQuery(str);        
        List <Client> clients =  query.getResultList();
        for (Client cli:clients){
            Object client =cli.getNumclient()+" "+ cli.getNomClient()+" "+cli.getPrenomClient();
            clientCombotBox.addItem((String) client);
        } 
        dao.fermer();
    }
    
    private void produitComboDataList(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) produitCombobox.getModel();
        int size = model.getSize();
        System.out.println(size);
        while(size>1){
            int i=1;
           model.removeElementAt(i);
            i++;
            size = model.getSize();
        }
        DaoEntity dao = new DaoEntity();
        dao.getEmf();
        dao.getEm(); 
        String str = "SELECT p FROM Produit p WHERE p.supp=false ORDER BY p.codeprod DESC";
        Query query = dao.getEm().createQuery(str);        
        List <Produit> produits =  query.getResultList();
        for (Produit prod:produits){
            Object produit =prod.getCodeprod()+" "+ prod.getDesignation() ;
            produitCombobox.addItem((String) produit);
        } 
        dao.fermer();
    }
    private void getClientById(int numcli){
        DaoEntity dao = new DaoEntity();
        dao.getEmf();
        dao.getEm();
        
        String str = "SELECT c FROM Client c WHERE c.numclient=?1";
        Query query = dao.getEm().createQuery(str);
        query.setParameter(1,numcli);
        Client client = (Client) query.getSingleResult();
        codecli = client.getNumclient();
        nomClient.setText(client.getNomClient());
        prenomClient.setText(client.getPrenomClient());
        telClient.setText(String.valueOf(client.getTelephone()));
        dao.fermer();
    }
    
    private Produit getProduitById(){
         DaoEntity daoprod = new DaoEntity();
        daoprod.getEmf();
        daoprod.getEm();
        String strprod = "SELECT p FROM Produit p WHERE p.codeprod=?1";
        Query queryprod = daoprod.getEm().createQuery(strprod);
        queryprod.setParameter(1,codeprod);
        Produit produit = (Produit) queryprod.getSingleResult();
        daoprod.fermer();
        return produit;
    }
    
    private Produit getProduitById(int idprod){
        DaoEntity daoprod = new DaoEntity();
        daoprod.getEmf();
        daoprod.getEm();
        String strprod = "SELECT p FROM Produit p WHERE p.codeprod=?1";
        Query queryprod = daoprod.getEm().createQuery(strprod);
        queryprod.setParameter(1,idprod);
        Produit produit = (Produit) queryprod.getSingleResult();
        daoprod.fermer();
        return produit;
    }
    
    private void calculerCoutProduit(){
        DefaultTableModel model = (DefaultTableModel) listProduitTab.getModel();
        int prodTableRowNumber = model.getRowCount();
        double somme = 0;
        if(prodTableRowNumber>0){
             for (int i = 0;i<prodTableRowNumber;i++){
            Integer cout = (Integer) model.getValueAt(i, 4);
            somme =somme+cout ;
            }
            coutTotalProd.setText(String.valueOf(somme));
        }
       
    }
}

