import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



public class Login extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
   
    // constructor for authentication
    public Login() {
        super("Login");
        initComponents();
        conn = dbconnect.connectDb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPage = new javax.swing.JPanel();
        AccnumLP = new javax.swing.JTextField();
        PinLP = new javax.swing.JTextField();
        PintxtLP = new javax.swing.JLabel();
        AccnumtxtLP = new javax.swing.JLabel();
        Logon = new javax.swing.JButton();
        LogoLP = new javax.swing.JLabel();
        NewAccount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        LoginPage.setBackground(new java.awt.Color(255, 255, 255));
        LoginPage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 56, 95), 3, true));
        LoginPage.setAutoscrolls(true);

        AccnumLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccnumLPActionPerformed(evt);
            }
        });

        PintxtLP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PintxtLP.setText("PIN:");

        AccnumtxtLP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AccnumtxtLP.setText("Account Number:");

        Logon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Logon.setText("Log on");
        Logon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogonActionPerformed(evt);
            }
        });

        LogoLP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankingImages/banking logo (2).png"))); // NOI18N

        NewAccount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NewAccount.setText("New Account");
        NewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPageLayout = new javax.swing.GroupLayout(LoginPage);
        LoginPage.setLayout(LoginPageLayout);
        LoginPageLayout.setHorizontalGroup(
            LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPageLayout.createSequentialGroup()
                .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPageLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AccnumtxtLP)
                            .addComponent(PintxtLP))
                        .addGap(18, 18, 18)
                        .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(LoginPageLayout.createSequentialGroup()
                                .addComponent(Logon, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NewAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(PinLP)
                            .addComponent(AccnumLP)))
                    .addGroup(LoginPageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LogoLP, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        LoginPageLayout.setVerticalGroup(
            LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPageLayout.createSequentialGroup()
                .addComponent(LogoLP, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccnumtxtLP)
                    .addGroup(LoginPageLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(AccnumLP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PintxtLP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PinLP))
                .addGap(8, 8, 8)
                .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NewAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Logon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AccnumLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccnumLPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccnumLPActionPerformed
// create new account 
    private void NewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAccountActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        SignUp ob = new SignUp();
        ob.setVisible(true);
    }//GEN-LAST:event_NewAccountActionPerformed
// authenticate user details with database
    private void LogonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogonActionPerformed
        // TODO add your handling code here:
        String sql = "select * from Account where Acc=? and Pin=?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, AccnumLP.getText());
            pst.setString(2, PinLP.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                setVisible(false);
                Loading ob = new Loading();
                ob.setUpLoading();
                ob.setVisible(true);
                rs.close();
                pst.close();
            }else{
                JOptionPane.showMessageDialog(null,"Incorrect login");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }finally{
            try{
                rs.close();
                pst.close();
               
            }catch(Exception e){
                
            }
        }
        
    }//GEN-LAST:event_LogonActionPerformed

   
    public static void main(String args[]) {
         
        
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccnumLP;
    private javax.swing.JLabel AccnumtxtLP;
    private javax.swing.JPanel LoginPage;
    private javax.swing.JLabel LogoLP;
    private javax.swing.JButton Logon;
    private javax.swing.JButton NewAccount;
    private javax.swing.JTextField PinLP;
    private javax.swing.JLabel PintxtLP;
    // End of variables declaration//GEN-END:variables
}
