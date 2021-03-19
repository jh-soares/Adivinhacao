import java.util.Scanner;

public class Jogo extends javax.swing.JFrame {
    
    int numeroAlvo;
    int palpite;

    
    public Jogo() {
        initComponents();
    }
    
  
    public void jogar(){
        
        txtPainel.setText("Estou pensando em um número, entre 0 e 10. Me diga seu palpite!");
              
        numeroAlvo = (int) (Math.random()* 10);
        
            }
    
    public void jogada(){
        
        Scanner p1 = new Scanner(System.in);
        palpite = p1.nextInt();
        System.out.println(palpite);
    }
    
    public void reiniciar(){
        
        txtPalpite.setText(" ");
        btnVerificar.setEnabled(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPalpite = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        txtPainel = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPalpite.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPalpite.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPalpiteActionPerformed(evt);
            }
        });

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        txtPainel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPainel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPainelActionPerformed(evt);
            }
        });

        btnOk.setText("Iniciar");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPalpite, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnVerificar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtPalpite, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnVerificar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalpiteActionPerformed
        jogada();
    }//GEN-LAST:event_txtPalpiteActionPerformed

    private void txtPainelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPainelActionPerformed
       
               
    }//GEN-LAST:event_txtPainelActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
       
       jogar();
       
       reiniciar();
 
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
       
        if(numeroAlvo == palpite){
            
            txtPainel.setText("Parabéns! Você acertou!");
        }else{
            txtPainel.setText("Você errou! Tente Novamente!");
        }
        btnVerificar.setEnabled(false);
        
    }//GEN-LAST:event_btnVerificarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JTextField txtPainel;
    private javax.swing.JTextField txtPalpite;
    // End of variables declaration//GEN-END:variables
}
