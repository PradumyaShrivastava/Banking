
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Loading extends javax.swing.JFrame implements Runnable {
Connection conn;
ResultSet rs;
PreparedStatement pst;
int s =0;
Thread th;
   
    public Loading() {
        super("Loading");
        initComponents();
        th=new Thread((Runnable)this);
    }
    
    public void setUpLoading(){
        setVisible(false);
        th.start();
    }
    
    public void run(){
        try{
            for(int i=0;i<=200;i++){
                s++;
                int m = Progressbar.getMaximum();
                int v = Progressbar.getValue();
                if(v<m){
                    Progressbar.setValue(Progressbar.getValue()+1);
                    
                }else{
                    i = 201;
                    setVisible(false);
                    Home ob = new Home();
                    ob.setVisible(true);
                }
            Thread.sleep(50);
            }
        }catch(Exception e){
            
        }
                 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoadingPage = new javax.swing.JPanel();
        Loadingtxt = new javax.swing.JLabel();
        Progressbar = new javax.swing.JProgressBar();
        Loading = new javax.swing.JLabel();
        LogoLdP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoadingPage.setBackground(new java.awt.Color(255, 255, 255));
        LoadingPage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(21, 21, 48), 3, true));

        Loadingtxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Loadingtxt.setText("Loading....");

        Progressbar.setForeground(new java.awt.Color(36, 51, 97));
        Progressbar.setStringPainted(true);

        Loading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankingImages/icon-swirl-big.png"))); // NOI18N

        LogoLdP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankingImages/banking logo (2).png"))); // NOI18N

        javax.swing.GroupLayout LoadingPageLayout = new javax.swing.GroupLayout(LoadingPage);
        LoadingPage.setLayout(LoadingPageLayout);
        LoadingPageLayout.setHorizontalGroup(
            LoadingPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoadingPageLayout.createSequentialGroup()
                .addComponent(LogoLdP, javax.swing.GroupLayout.PREFERRED_SIZE, 929, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoadingPageLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(LoadingPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoadingPageLayout.createSequentialGroup()
                        .addComponent(Progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(267, 267, 267))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoadingPageLayout.createSequentialGroup()
                        .addComponent(Loadingtxt)
                        .addGap(399, 399, 399))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoadingPageLayout.createSequentialGroup()
                        .addComponent(Loading, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(385, 385, 385))))
        );
        LoadingPageLayout.setVerticalGroup(
            LoadingPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoadingPageLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(LogoLdP, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(Loading, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(Loadingtxt)
                .addGap(18, 18, 18)
                .addComponent(Progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoadingPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoadingPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(989, 609));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Loading;
    private javax.swing.JPanel LoadingPage;
    private javax.swing.JLabel Loadingtxt;
    private javax.swing.JLabel LogoLdP;
    private javax.swing.JProgressBar Progressbar;
    // End of variables declaration//GEN-END:variables

 
}
