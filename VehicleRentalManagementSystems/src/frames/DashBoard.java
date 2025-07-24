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
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rent = new javax.swing.JButton();
        motor = new javax.swing.JButton();
        truck = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        history = new javax.swing.JButton();
        viewall = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        rent.setText("Rent Car");
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

        jLabel1.setFont(new java.awt.Font("Wide Latin", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("VEHICLE RENTAL");

        jLabel2.setFont(new java.awt.Font("Wide Latin", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("System");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Click a Specific Button to Rent");

        history.setText("History");
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });

        viewall.setText("View Available Vehicles");
        viewall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(608, 608, 608)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(motor)
                            .addComponent(viewall)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rent)
                                .addComponent(truck))
                            .addComponent(history)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(130, 130, 130)
                .addComponent(rent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(truck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(motor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewall)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(history)
                .addGap(283, 283, 283)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
       
        History hs = new History();
        hs.setVisible(true);
        dispose();
    }//GEN-LAST:event_historyActionPerformed

    private void viewallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewallActionPerformed
       AvailableVehicles av = new AvailableVehicles();
       av.setVisible(true);
       dispose();
    }//GEN-LAST:event_viewallActionPerformed

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
    private javax.swing.JButton history;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton motor;
    private javax.swing.JButton rent;
    private javax.swing.JButton truck;
    private javax.swing.JButton viewall;
    // End of variables declaration//GEN-END:variables

    
}
