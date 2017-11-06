package ViewEvidence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VIJAY MORE
 */
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
public class ViewSuspect extends javax.swing.JFrame {

    /**
     * Creates new form frame1
     */
    String name;
    int id;
    int num;
    public ViewSuspect() {
    
            initComponents(); 
         
    }
    public ViewSuspect(String name, int id,int num){
        this.name = name;
        this.id = id;
        this.num = num;
        initComponents();
        try{
        
      Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/InvestigationBureau" ,"root" ,"");   
        String sql ="Select * from Case2";
        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery(sql);
        
        while(rs.next()){
            jComboBox1.addItem(rs.getString(2));
        }
      
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Occured");
        }
        //show_user();
        
    }
    
     /* public ArrayList<User> userList(){
        ArrayList<User> userList =new ArrayList<>();
     
        Connection connection;
        PreparedStatement ps1 = null;
        try{
        String query=" SELECT * FROM Evidence where Case ";
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/InvestigationBureau" ,"root" ,"");
        ps1=connection.prepareStatement(query);
        ResultSet rs = ps1.executeQuery(query );
        User user;
        while (rs.next())
             {
                  user=new User(rs.getInt(1) , rs.getString(3) , rs.getString(4) , rs.getString(5) , rs.getString(7) , rs.getString(8));         
                  userList.add(user);
             }
           
        }
        catch(SQLException e){
          System.out.println("Error"+e.getMessage());  
        }
        return userList;
    }
    
    public void show_user(){
        ArrayList<User> list=userList();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        Object[] row=new Object[6];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getCaseid();
            row[1]=list.get(i).getEvidence_type();
            row[2]=list.get(i).getEvidence();
            row[3]=list.get(i).getSuspect();
            row[4]=list.get(i).getNote();
            row[5]=list.get(i).getPoints();
            model.addRow(row);     
        }
    }
    */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ViewEvidence/Final.jpg"))); // NOI18N

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 204));
        jTextField1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 204, 255));
        jTextField1.setText("   INVESTIGATION BUREAU");
        jTextField1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
            .addComponent(jTextField1)
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 110);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Case Id", "Suspect Name", "Contact", "Relation", "Note", "Address"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 200, 454, 120);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(80, 130, 150, 27);

        jButton1.setText("Get Suspects");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(250, 130, 140, 29);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(190, 360, 110, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ViewEvidence/2055138-dark-blue-abstract-background-resembling-wooden-texture-or-cracks.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, -10, 480, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(this.num==2){
            new OfficerProfile(this.name,this.id).setVisible(true);
            this.setVisible(false);
        }
        else{
           new Profile(this.name,this.id).setVisible(true);
           this.setVisible(false);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String case1 = jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
                ArrayList<User2> userList =new ArrayList<>();

                
        try{
       Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/InvestigationBureau" ,"root" ,"");   
        String sql = "SELECT * FROM  Case2 left join Suspect on Case2.CaseID = Suspect.CaseID where Case2.Case_Name = '"+case1+"'";         
        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery(sql);
        User2 user;
        while (rs.next())
             {
                 System.out.println(rs.getInt(1)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getString(12));
                  user=new User2(rs.getInt(1) , rs.getString(10) , rs.getString(11) , rs.getString(12) , rs.getString(14) , rs.getString(15));         
                  userList.add(user);
             }
        
         DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
         
         
         
         //jTable1.clearSelection();
         
         
       /*  for(int i=0;i<jTable1.getRowCount();i++)
             for(int j=0;j<jTable1.getColumnCount();j++){
                 jTable1.setValueAt("", i,j);
             }*/
         
        Object[] row=new Object[6];
        for(int i=0;i<userList.size();i++){
            row[0]=userList.get(i).getCaseid();
            row[1]=userList.get(i).getName();
            row[2]=userList.get(i).getContact();
            row[3]=userList.get(i).getRelation();
            row[4]=userList.get(i).getNote();
            row[5]=userList.get(i).getAddress();
            model.addRow(row);     
        }
        
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Occured");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewSuspect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSuspect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSuspect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSuspect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // JFrame.setDefaultLookAndFeelDecorated(true);
                new ViewSuspect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
