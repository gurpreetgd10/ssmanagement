
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class updatestoreproduct extends javax.swing.JFrame  implements Serializable{
private static String id;
    /**
     * Creates new form updatestoreproduct
     */
    public updatestoreproduct(String id) {
        initComponents();
        this.id=id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        jLabel1.setText("Updating Product");

        jLabel2.setText("Product Name");

        jLabel3.setText("New Stock");

        jLabel4.setText("New Fixed Cost per Quarter");

        jLabel5.setText("New Carrying Cost per unit per Quarter");

        jLabel6.setText("New Demand of items in units per Quarter");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(jTextField4)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jButton1)
                        .addGap(76, 76, 76)
                        .addComponent(jButton2)))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        new managestore(id).setVisible(true);
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Enter Name!");
        }
        else{
            if(!jTextField2.getText().equals("")){
                Connection conn=null;
                PreparedStatement p=null;
                String name;
                int stock;
                try{
                    conn=configwarehouseadmin.getConnection1();
                    if(conn.isValid(1)){
                        name=jTextField1.getText();
                        stock=Integer.parseInt(jTextField2.getText());
                        p=conn.prepareStatement("update PRODUCT set STOCK=? where NAME=? and OPTIONS=? and ID=?");
                        p.setInt(1, stock);
                        p.setString(2, name);
                        p.setString(3, "Store");
                        p.setString(4, id);
                        if(p.executeUpdate()==1){
                            //jTextField1.setText("");
                            jTextField2.setText("");
                        }
                        else{
                            JOptionPane.showMessageDialog(rootPane, "Couldn't Update!");
                        }
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane, e);
                }
            }
            if(!jTextField3.getText().equals("")){
                Connection conn=null;
                PreparedStatement p=null;
                String name;
                int fcq;
                try{
                    conn=configwarehouseadmin.getConnection1();
                    if(conn.isValid(1)){
                        name=jTextField1.getText();
                        fcq=Integer.parseInt(jTextField3.getText());
                        p=conn.prepareStatement("update PRODUCT set FCQ=? where NAME=? and OPTIONS=? and ID=?");
                        p.setInt(1, fcq);
                        p.setString(2, name);
                        p.setString(3, "Store");
                        p.setString(4, id);
                        if(p.executeUpdate()==1){
                            //jTextField1.setText("");
                            jTextField3.setText("");
                        }
                        else{
                            JOptionPane.showMessageDialog(rootPane, "Couldn't Update!");
                        }
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane, e);
                }
            }
            if(!jTextField4.getText().equals("")){
                Connection conn=null;
                PreparedStatement p=null;
                String name;
                int ccq;
                try{
                    conn=configwarehouseadmin.getConnection1();
                    if(conn.isValid(1)){
                        name=jTextField1.getText();
                        ccq=Integer.parseInt(jTextField4.getText());
                        p=conn.prepareStatement("update PRODUCT set CCQ=? where NAME=? and OPTIONS=? and ID=?");
                        p.setInt(1, ccq);
                        p.setString(2, name);
                        p.setString(3, "Store");
                        p.setString(4, id);
                        if(p.executeUpdate()==1){
                            //jTextField1.setText("");
                            jTextField4.setText("");
                        }
                        else{
                            JOptionPane.showMessageDialog(rootPane, "Couldn't Update!");
                        }
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane, e);
                }
            }
            if(!jTextField5.getText().equals("")){
                Connection conn=null;
                PreparedStatement p=null;
                String name;
                int dq;
                try{
                    conn=configwarehouseadmin.getConnection1();
                    if(conn.isValid(1)){
                        name=jTextField1.getText();
                        dq=Integer.parseInt(jTextField5.getText());
                        p=conn.prepareStatement("update PRODUCT set DQ=? where NAME=? and OPTIONS=? and ID=?");
                        p.setInt(1, dq);
                        p.setString(2, name);
                        p.setString(3, "Store");
                        p.setString(4, id);
                        if(p.executeUpdate()==1){
                            //jTextField1.setText("");
                            jTextField5.setText("");
                        }
                        else{
                            JOptionPane.showMessageDialog(rootPane, "Couldn't Update!");
                        }
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane, e);
                }
            }
            jTextField1.setText("");
            
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
            java.util.logging.Logger.getLogger(updatestoreproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatestoreproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatestoreproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatestoreproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatestoreproduct(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration                   
}
