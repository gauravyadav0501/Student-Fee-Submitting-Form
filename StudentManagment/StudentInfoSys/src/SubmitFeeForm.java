
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; 
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OJD-Student
 */
public class SubmitFeeForm extends javax.swing.JFrame {
String studentid,name, fname, course, courseid, cduration,fstatus;
int coursefee,cdiscount,pamount1;
int remain_amount,get_discount,   remain_amount2;
int rm1,rm2,rm3;
 String dt;
 int rcptno1;
    /**
     * Creates new form SubmitFeeForm
     */
    public SubmitFeeForm() {
        initComponents();
    }
 public SubmitFeeForm(String studentid2,String name2,String fname2,String course2,String courseid2,int coursefee2,String cduration2,int cdiscount2,int r_amount2,String status2) {
        initComponents();
             System.out.println(" fee form data "+studentid2+" "+name2+" "+fname2+" "+course2+" "+courseid2+" "+coursefee2+" "+cduration2+" "+cdiscount2);
      studentid1.setText(studentid2);
        name1.setText(name2);
        fname1.setText(fname2);
        course1.setText(course2);
        cid1.setText(courseid2);
        cf1.setText(String.valueOf(coursefee2));
         cdiscount1.setText(String.valueOf(cdiscount2));
         cduration1.setText(cduration2);
         fstatus1.setText(status2);
         remain_fee.setText(String.valueOf(r_amount2));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        studentid1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fname1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        course1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cid1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cf1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cduration1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pamount = new javax.swing.JTextField();
        submit_payment = new javax.swing.JButton();
        cdiscount1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fstatus1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        remain_fee = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("SUBMIT FEE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("STUDENT ID:");

        studentid1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentid1.setText("ENTER ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("NAME:");

        name1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name1.setText("ENTER NAME");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("FATHER NAME:");

        fname1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fname1.setText("ENTER FATHER NAME");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("COURSE:");

        course1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        course1.setText("SELECT COURSE");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("COURSE ID:");

        cid1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cid1.setText("ENTER CID");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("COURSE FEE:");

        cf1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cf1.setText("FEE");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("DISCOUNT:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("DURATION:");

        cduration1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cduration1.setText("DUR");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("PAYMENT:");

        submit_payment.setBackground(new java.awt.Color(204, 204, 255));
        submit_payment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit_payment.setText("SUBMIT");
        submit_payment.setBorder(null);
        submit_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_paymentActionPerformed(evt);
            }
        });

        cdiscount1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cdiscount1.setText("Discount");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("STATUS:");

        fstatus1.setText("Fee status");

        jLabel7.setText("Remain_fee");

        remain_fee.setText("fee");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(36, 36, 36)
                                .addComponent(studentid1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(47, 47, 47)
                                        .addComponent(name1))
                                    .addComponent(course1))
                                .addGap(128, 128, 128)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(62, 62, 62)
                                        .addComponent(cid1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(fname1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cdiscount1)
                                                    .addComponent(fstatus1)
                                                    .addComponent(remain_fee, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel12))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(cf1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(cduration1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(pamount, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(submit_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(studentid1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(name1)
                            .addComponent(jLabel6)
                            .addComponent(fname1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(course1)
                            .addComponent(jLabel10)
                            .addComponent(cid1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cf1)
                            .addComponent(jLabel14)
                            .addComponent(cdiscount1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cduration1)
                            .addComponent(jLabel3)
                            .addComponent(fstatus1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(pamount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(remain_fee))
                .addGap(56, 56, 56)
                .addComponent(submit_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submit_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_paymentActionPerformed
          if(pamount.getText().equals("")){
           pamount.setBackground(Color.red);
           JFrame ob=new JFrame();
            JOptionPane.showMessageDialog(ob, "Amount, can not blank");
    
}
    else
          {      
        studentid=studentid1.getText().toString().trim();
        name=name1.getText().toString().trim();
        fname=fname1.getText().toString().trim();
        course=course1.getText().toString().trim();
        courseid=cid1.getText().toString().trim();
        cduration=cduration1.getText().toString().trim();
        cdiscount=Integer.parseInt(cdiscount1.getText().toString().trim());
        coursefee=Integer.parseInt(cf1.getText().toString().trim());
         pamount1=Integer.parseInt(pamount.getText().toString().trim());
        remain_amount2=Integer.parseInt( remain_fee.getText().toString().trim());
         
         fstatus=fstatus1.getText().toString().trim();
        System.out.println("submit fee form="+studentid+name+fname+course+courseid+cduration+coursefee+cdiscount+"payble amount="+pamount1+"fstatus="+fstatus);
          pamount1=Integer.parseInt(pamount.getText().toString().trim());
          //datetime
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
           LocalDateTime now = LocalDateTime.now();
           dt=dtf.format(now);
          
         //recptno
          rcptno1 = (int)(Math.random()*(100000-10000+1)+10000);
          rm1=remain_amount2;
          rm2=remain_amount2;
          rm3=remain_amount2;
          
          //First condition
           if(rm1==0 && fstatus.equals("pending"))
           {
               // remain_amount2=coursefee;    
          if(pamount1<= coursefee)
          {
          get_discount=( coursefee*cdiscount/100);
          
        int feeafdiscount= coursefee-get_discount;
        
        if(pamount1<=feeafdiscount)
        {
        remain_amount2=feeafdiscount-pamount1;
            System.out.println("first fee remain_payemnt="+ remain_amount2);
        
        }
          }
          else
          {
              fstatus="completed";
          JFrame ob=new JFrame();
            JOptionPane.showMessageDialog(ob, "Plz check payable amount It is greater than course fee");
          
          }
           }

        
          
           //second condition
                 if(rm2!=0 && fstatus.equals("pending"))
           {
                    
          if(pamount1<=remain_amount2)
          {
         remain_amount2=remain_amount2-pamount1;
              System.out.println("Second and more remian_payment="+remain_amount2);
                  
        }
       
          }
          
          
          try {
              
            if(fstatus.equals("pending"))
            {
                if(pamount1==coursefee)
              {
              fstatus="completed";
              }
                //third
                if(pamount1==rm3)
           {
                   fstatus="completed";
               System.out.println("fee submitted completely");
            JFrame ob=new JFrame();
            JOptionPane.showMessageDialog(ob, "fee has beeen completeed successfully!Thanks");
          
          }
            
            //add_fee record update and Fee book upadted
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","");
            Statement stmt=con.createStatement(); 
           
            
            // final fee record update in add_fee
             String query="update add_fee set payment='"+pamount1+"',payment_remain='"+remain_amount2+"',rcptno='"+rcptno1+"',issued_date='"+dt+"',status='"+fstatus+"' where studentid='"+studentid+"'";
           
            stmt.executeUpdate(query);
            System.out.println("Add Fee Updated");
            
            //feebook record insert
              System.out.println("data feebook="+studentid +rcptno1 +course +courseid +cduration +cdiscount +coursefee +pamount1 +remain_amount2 +dt);
            String feebookquery="insert into feebook(rcptno,studentid,course,courseid,duration,discount,coursefee,payment,payment_remain,issued_date)values('"+rcptno1 +"','"+studentid +"','"+course +"','"+courseid +"','"+cduration +"','"+cdiscount +"','"+coursefee +"','"+pamount1 +"','"+remain_amount2 +"','"+dt+"')";
            stmt.execute(feebookquery);
             System.out.println("Fee book Updated");
            stmt.close();
            String remain=String.valueOf(remain_amount);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CourseForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CourseForm.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          if(rm1==0 && fstatus.equals("completed"))
           {
                              
          JFrame ob=new JFrame();
            JOptionPane.showMessageDialog(ob, "fee already compted ");
          
           } 
          
         
        
          }
       
    }//GEN-LAST:event_submit_paymentActionPerformed

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
            java.util.logging.Logger.getLogger(SubmitFeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubmitFeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubmitFeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubmitFeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubmitFeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cdiscount1;
    private javax.swing.JLabel cduration1;
    private javax.swing.JLabel cf1;
    private javax.swing.JLabel cid1;
    private javax.swing.JLabel course1;
    private javax.swing.JLabel fname1;
    private javax.swing.JLabel fstatus1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel name1;
    private javax.swing.JTextField pamount;
    private javax.swing.JLabel remain_fee;
    private javax.swing.JLabel studentid1;
    private javax.swing.JButton submit_payment;
    // End of variables declaration//GEN-END:variables
}