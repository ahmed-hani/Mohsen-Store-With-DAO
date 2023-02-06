/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.OrderDao;
import DAO.ProductDao;
import DB_Connection.DBConnection;
import DTO.Order;
import DTO.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/*
 * 
 *
 * @author ahmed
 */
public class OrderTake_screen extends javax.swing.JFrame {

    /**
     * Creates new form order_screen
     */
    public OrderTake_screen() {
        initComponents();
        selectedDev();
       clear();
       get_auto();
       showDate();
       
    }

     Connection conn=null;
Statement st=null;
ResultSet rs=null;
PreparedStatement prst=null;
public void clear(){
//txtid.setText("");
//comboname.setSelectedItem(st);
txtquantity.setText("");
txtprice.setText("");
txtproduct.setText("");
txtTrueQuan.setText("");

}
private void showDate(){
Date d=new Date();
SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
txtdate.setText(s.format(d));


}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnsell = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtquantity = new javax.swing.JTextField();
        btncancel = new javax.swing.JButton();
        txtprice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaSellOrder = new javax.swing.JTextArea();
        btnprint = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tborder = new javax.swing.JTable();
        txtproduct = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTrueQuan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsell.setBackground(new java.awt.Color(0, 255, 255));
        btnsell.setFont(new java.awt.Font("Traditional Arabic", 1, 22)); // NOI18N
        btnsell.setText("الفاتورة");
        btnsell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsellMouseClicked(evt);
            }
        });
        btnsell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsellActionPerformed(evt);
            }
        });
        jPanel1.add(btnsell, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 90, -1));

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel7.setText("الرقم");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 60, 40));

        txtquantity.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        txtquantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtquantityMouseExited(evt);
            }
        });
        txtquantity.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtquantityInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        txtquantity.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtquantityPropertyChange(evt);
            }
        });
        jPanel1.add(txtquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 150, -1));

        btncancel.setBackground(new java.awt.Color(51, 255, 51));
        btncancel.setFont(new java.awt.Font("Traditional Arabic", 1, 22)); // NOI18N
        btncancel.setText("رجوع");
        btncancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncancelMouseClicked(evt);
            }
        });
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, -1));

        txtprice.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        txtprice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpriceMouseClicked(evt);
            }
        });
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        jPanel1.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 150, -1));

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel3.setText("الكمية الموجودة");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 100, 30));

        txtAreaSellOrder.setColumns(20);
        txtAreaSellOrder.setRows(5);
        jScrollPane3.setViewportView(txtAreaSellOrder);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 330, 370));

        btnprint.setBackground(java.awt.Color.red);
        btnprint.setFont(new java.awt.Font("Traditional Arabic", 1, 22)); // NOI18N
        btnprint.setText("طباعة");
        btnprint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnprintMouseClicked(evt);
            }
        });
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });
        jPanel1.add(btnprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, 90, -1));

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel6.setText("الكمية");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 60, 20));

        tborder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tborder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tborderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tborder);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 350, 300));

        txtproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductActionPerformed(evt);
            }
        });
        jPanel1.add(txtproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 140, 40));

        jLabel8.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel8.setText("السعر");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 60, 30));

        txtid.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        txtid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtidMouseClicked(evt);
            }
        });
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 150, -1));

        txtdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtdate.setText("DATE");
        jPanel1.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 170, 40));

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel4.setText("الاسم");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 60, 20));

        txtTrueQuan.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        txtTrueQuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTrueQuanMouseClicked(evt);
            }
        });
        txtTrueQuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrueQuanActionPerformed(evt);
            }
        });
        jPanel1.add(txtTrueQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void selectedDev(){
        try{
     conn= new DBConnection().getconnection();
      st=conn.createStatement();
      rs=st.executeQuery("SELECT `ID`,`PRODUCT_NAME`,`QUANTITY`,`PRICE` FROM `product`");
     tborder.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e){
       e.printStackTrace();
       }
    }
//    public void fillcombo(){
//     try{
//     conn=new DBConnection().getconnection();
//      st=conn.createStatement();
//      rs=st.executeQuery("select* from product");
//     while(rs.next()){
//     comboname.addItem(rs.getString("PRODUCT_NAME"));
//     }
//        }
//        catch(SQLException e){
//       e.printStackTrace();
//       }
//    
//    
//    
//    }
   
//    public void fillQuantityTrue(){
//     try{
//     conn=new DBConnection().getconnection();
//      st=conn.createStatement();
//      String quan=comboname.getSelectedItem().toString();
//      rs=st.executeQuery("SELECT * FROM `product` WHERE `PRODUCT_NAME`='"+quan+"'");
//       
//    while(rs.next()){
//     txtquantitytrue.setText(rs.getString("QUANTITY"));
//    }
//        }
//        catch(SQLException e){
//       e.printStackTrace();
//       }
//    
//    
//    
//    }  
//    public void FillCost(){
//      try{
//     conn=new DBConnection().getconnection();
//      st=conn.createStatement();
//      String quan=comboname.getSelectedItem().toString();
//      
//      rs=st.executeQuery("SELECT * FROM `product` WHERE `PRODUCT_NAME`='"+quan+"'");
//       while(rs.next()){
//    
//    
//       int Price= Integer.parseInt(rs.getString("PRICE"));
//       int num= Integer.parseInt(txtquantity.getText());
//       int cost=Price * num;
//       
//   txtcost.setText(""+cost);
//       }
//    
//        }
//        catch(SQLException e){
//       e.printStackTrace();
//       }
//    
//    }
//Date d=new Date();
//     DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            
     Product pr=new Product();
     OrderDao OrDao=new OrderDao();
     ProductDao prDao=new ProductDao();
     int itotal= 0;
    private void btnsellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsellMouseClicked
        try{
           
          
               
       int  total=Integer.parseInt(txtprice.getText())* Integer.parseInt(txtquantity.getText());      
          
          itotal+=total;
            
            txtAreaSellOrder.setText(txtAreaSellOrder.getText()+"  *********************************فاتورة المخزن*****************************\n"+
            "\t   الاسم             السعر         الكمية        التكلفة  \t\n "+
                   
                    "\t"+ total  + "         " + txtquantity.getText() + "             "+ txtprice.getText() + "             " + txtproduct.getText()
            
            +"\n\n\n\t\t\t"+ itotal
            );
             
            
            JOptionPane.showMessageDialog(this, "product successfully selld" );
             
            
             or.setId(Integer.valueOf(txtid.getText()));
             or.setProduct_id(Integer.parseInt(id));
             or.setQuantity(Integer.valueOf(txtquantity.getText()));
             or.setCost(Integer.parseInt(txtprice.getText())* Integer.parseInt(txtquantity.getText()));
             or.setDate(txtdate.getText());
             OrDao.Add(or);
            // or.Add();
                 int trueQuan=Integer.parseInt(txtTrueQuan.getText());
                 int Quan=Integer.parseInt(txtquantity.getText()) ;
                int NewQuan=trueQuan-Quan;
             pr.setQuantity(NewQuan);
             pr.setProduct_name(txtproduct.getText());
             prDao.UpdateQuantity(pr);
           //  pr.updateQuantity();
                selectedDev();
                get_auto();
                clear();
           
        }

        
        
        
        //if(add()==true){
            //JOptionPane.showMessageDialog(this, "product successfully addsd" );
            // }}
    catch(Exception e){
        e.printStackTrace();
        }
    }//GEN-LAST:event_btnsellMouseClicked

    
    
    private void btncancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMouseClicked
        this.setVisible(false);
        new Main_screen().setVisible(true);

    }//GEN-LAST:event_btncancelMouseClicked

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnsellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsellActionPerformed

    private void txtquantityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtquantityMouseExited
        
    }//GEN-LAST:event_txtquantityMouseExited

    private void btnprintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprintMouseClicked
        // TODO add your handling code here:
         
    }//GEN-LAST:event_btnprintMouseClicked
Order or=new Order();



    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        try{
        txtAreaSellOrder.print();
        
        txtAreaSellOrder.setText("");
        }
        catch(java.awt.print.PrinterException e){
        System.err.format("no printer found", e.getMessage());
        
        
        }
       
        
    }//GEN-LAST:event_btnprintActionPerformed

    public void get_auto(){
    try{
        
    conn= new DBConnection().getconnection();
      st=conn.createStatement();

      rs=st.executeQuery("SELECT MAX(`ID`) FROM `orders`");
       
    rs.next();
    int o_id=rs.getInt(1)+1;
    txtid.setText(""+o_id);
    
   
   
    }
    catch(Exception e){
    e.printStackTrace();
    }
    
    }
    private void txtquantityPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtquantityPropertyChange
        
    }//GEN-LAST:event_txtquantityPropertyChange

    private void txtquantityInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtquantityInputMethodTextChanged
        
    }//GEN-LAST:event_txtquantityInputMethodTextChanged

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        
    }//GEN-LAST:event_txtpriceActionPerformed

    private void txtpriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpriceMouseClicked
        //FillCost();
    }//GEN-LAST:event_txtpriceMouseClicked

    private void txtproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductActionPerformed
String id;
    private void tborderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tborderMouseClicked
        // TODO add your handling code here:
         DefaultTableModel model=(DefaultTableModel)tborder.getModel();
        int myindex=tborder.getSelectedRow();
        id=model.getValueAt(myindex, 0).toString();
        txtproduct.setText(model.getValueAt(myindex, 1).toString());
        txtTrueQuan.setText(model.getValueAt(myindex, 2).toString());
        txtprice.setText(model.getValueAt(myindex,3 ).toString());
    }//GEN-LAST:event_tborderMouseClicked

    private void txtidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtidMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidMouseClicked

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtTrueQuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTrueQuanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrueQuanMouseClicked

    private void txtTrueQuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrueQuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrueQuanActionPerformed

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
            java.util.logging.Logger.getLogger(OrderTake_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderTake_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderTake_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderTake_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderTake_screen().setVisible(true);
    
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnsell;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tborder;
    private javax.swing.JTextArea txtAreaSellOrder;
    private javax.swing.JTextField txtTrueQuan;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtproduct;
    private javax.swing.JTextField txtquantity;
    // End of variables declaration//GEN-END:variables
}