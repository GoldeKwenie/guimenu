/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;


import com.mysql.cj.jdbc.PreparedStatementWrapper;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import static jdbc.JdbcConnection.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException; 
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class DashBoard extends javax.swing.JFrame {
    
   
    public DashBoard() throws SQLException {
        initComponents();
        
    }

//   private void loadCarList() throws SQLException {
//        DefaultTableModel model = (DefaultTableModel) tablecars.getModel();
//        model.setRowCount(0);
//        try (Connection con = getConnection();
//               java.sql.Statement st = con.createStatement();
//               ResultSet rs = st.executeQuery("SELECT * FROM cars")) {
//            
//         
//            while (rs.next()) {
//                model.addRow(new Object[]{
//                    rs.getString("Car_Plate"),
//                    rs.getString("Brand"),
//                    rs.getString("Model"),
//                    rs.getString("Year"),
//                    rs.getString("Price"),
//                    rs.getString("Status")
//                });
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rent = new javax.swing.JButton();
        motor = new javax.swing.JButton();
        truck = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        rent.setText("Rent a car");
        rent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentActionPerformed(evt);
            }
        });

        motor.setText("Rent Motorcycle");
        motor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorActionPerformed(evt);
            }
        });

        truck.setText("Rent Truck");
        truck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rent)
                    .addComponent(motor)
                    .addComponent(truck))
                .addContainerGap(964, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(rent)
                .addGap(64, 64, 64)
                .addComponent(motor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(truck)
                .addContainerGap(384, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void truckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truckActionPerformed
        RentTruck truck = new RentTruck();
        truck.setVisible(true);
        dispose();
    }//GEN-LAST:event_truckActionPerformed

    private void motorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorActionPerformed
        RentMotorCycle motor = new RentMotorCycle();
        motor.setVisible(true);
        dispose();
    }//GEN-LAST:event_motorActionPerformed

    private void rentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentActionPerformed
        RentCars rc = new RentCars();
        rc.setVisible(true);
        
        
        
        
        
        
        

        //       int selected = tablecars.getSelectedRow();
        //       if (selected == -1) {
            //           JOptionPane.showMessageDialog(this, "Please Select a Car to rent.");
            //           return;
            //       }
        //
        //       String plate = tablecars.getValueAt(selected,0).toString();
        //       String brand = tablecars.getValueAt(selected,1).toString();
        //       String model = tablecars.getValueAt(selected,2).toString();
        //       String year = tablecars.getValueAt(selected,3).toString();
        //       String price = tablecars.getValueAt(selected,4).toString();
        //       String status = tablecars.getValueAt(selected,5).toString();
        //
        //       if (status.equalsIgnoreCase("Not Available")) {
            //           JOptionPane.showMessageDialog(this, "The car is already rented");
            //           return;
            //       }
        //        try (Connection con = getConnection();
            //                PreparedStatement ps = con.prepareStatement("UPDATE cars SET Status = 'Not Available' WHERE Car_Plate =?")) {
            //                ps.setString(1, plate);
            //                ps.executeUpdate();
            //                JOptionPane.showMessageDialog(this, "Car rented successfull.");
            //
            //
            //
            //        } catch (Exception e) {
            //            e.printStackTrace();
            //            JOptionPane.showMessageDialog(this, "Failed to update car status.");
            //        }
        //
        //
    }//GEN-LAST:event_rentActionPerformed

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton motor;
    private javax.swing.JButton rent;
    private javax.swing.JButton truck;
    // End of variables declaration//GEN-END:variables

    
}
