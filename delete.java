
import java.io.Serializable;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vineetarora
 */
import java.sql.*;
public class delete extends javax.swing.JFrame  implements Serializable{
private static String id;
    /**
     * Creates new form delete
     */
    public delete(String id) {
        initComponents();
        this.id=id;
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        jLabel1.setText("Deletion");

        jLabel2.setText("What do you want to delete");

        jRadioButton1.setText("Category");

        jRadioButton2.setText("Subcategory");

        jRadioButton3.setText("Product");

        jLabel3.setText("Name");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(jLabel3)
                            .addGap(97, 97, 97)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3)
                        .addContainerGap(138, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(34, 34, 34))))
        );

        pack();
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        new manage(id).setVisible(true);
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(jRadioButton3.isSelected()){
            String name=jTextField1.getText();
            Connection conn=null;
            PreparedStatement p=null;
            
            try{
                conn=configwarehouseadmin.getConnection1();
                p=conn.prepareStatement("delete from PRODUCT where NAME=? and OPTIONS=? and ID=?");
                p.setString(1, name);
                p.setString(2, "Warehouse");
                p.setString(3, id);
                if(p.executeUpdate()==1){
                    JOptionPane.showMessageDialog(rootPane, "Deleted!");
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Product with this name doesn't exist!");
                }
                conn.close();
                jTextField1.setText("");
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        else if(jRadioButton2.isSelected()){
            String name=jTextField1.getText();
            Connection conn=null;
            PreparedStatement p=null;
            
            try{
                conn=configwarehouseadmin.getConnection1();
                p=conn.prepareStatement("delete from PRODUCT where SUBCATEGORY=? and OPTIONS=? and ID=?");
                p.setString(1, name);
                p.setString(2, "Warehouse");
                p.setString(3, id);
                if(p.executeUpdate()==1){
                    JOptionPane.showMessageDialog(rootPane, "Deleted all products in this subcategory!");
                }
                else{
                    
                }
                conn.close();
                p=null;
                conn=configwarehouseadmin.getConnection1();
                p=conn.prepareStatement("delete from SUBCATEGORY where NAME=? and OPTIONS=? and ID=?");
                p.setString(1, name);
                p.setString(2, "Warehouse");
                p.setString(3, id);
                if(p.executeUpdate()==1){
                    JOptionPane.showMessageDialog(rootPane, "Deleted Subcategory!");
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Subcategory with this name doesn't exist!");
                }
                conn.close();
                jTextField1.setText("");
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        else if(jRadioButton1.isSelected()){
            String name=jTextField1.getText();
            Connection conn=null;
            PreparedStatement p=null;
            
            try{
                conn=configwarehouseadmin.getConnection1();
                p=conn.prepareStatement("delete from PRODUCT where CATEGORY=? and OPTIONS=? and ID=?");
                p.setString(1, name);
                p.setString(2, "Warehouse");
                p.setString(3, id);
                if(p.executeUpdate()==1){
                    JOptionPane.showMessageDialog(rootPane, "Deleted all products in this category!");
                }
                else{
                    
                }
                conn.close();
                p=null;
                conn=configwarehouseadmin.getConnection1();
                p=conn.prepareStatement("delete from SUBCATEGORY where CATEGORY=? and OPTIONS=? and ID=?");
                p.setString(1, name);
                p.setString(2, "Warehouse");
                p.setString(3, id);
                if(p.executeUpdate()==1){
                    JOptionPane.showMessageDialog(rootPane, "Deleted all subcategories in this category!");
                }
                else{
                    //JOptionPane.showMessageDialog(rootPane, "Subcategory with this name doesn't exist!");
                }
                conn.close();
                p=null;
                conn=configwarehouseadmin.getConnection1();
                p=conn.prepareStatement("delete from CATEGORY where NAME=? and OPTIONS=? and ID=?");
                p.setString(1, name);
                p.setString(2, "Warehouse");
                p.setString(3, id);
                if(p.executeUpdate()==1){
                    JOptionPane.showMessageDialog(rootPane, "Deleted Category!");
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Category with this name doesn't exist!");
                }
                conn.close();
                jTextField1.setText("");
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Select what you want to delete!");
        }
    }                                        

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
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}