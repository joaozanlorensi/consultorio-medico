/**
* IF62C: Fundamentos de Programação 2
* Programação Orientada a Objetos
*/

package Agendamento_De_Consultas;

import java.awt.Toolkit;

/**
 *
 * @author joaoz
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setUndecorated(true);
        initComponents();
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        int tamanhoX = (int) tk.getScreenSize().getWidth();
        int tamanhoY = (int) tk.getScreenSize().getHeight();
        
        this.setSize(tamanhoX, tamanhoY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btAgendar = new javax.swing.JButton();
        btPaciente = new javax.swing.JButton();
        btCadastroProf = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        nomeLocal = new javax.swing.JLabel();
        logoLocal = new javax.swing.JLabel();
        imagemLocal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);

        btAgendar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btAgendar.setMnemonic('a');
        btAgendar.setText("Agendamento");
        btAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgendarActionPerformed(evt);
            }
        });

        btPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPaciente.setMnemonic('p');
        btPaciente.setText("Portal do paciente");
        btPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPacienteActionPerformed(evt);
            }
        });

        btCadastroProf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btCadastroProf.setMnemonic('r');
        btCadastroProf.setText("Portal do profissional");
        btCadastroProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroProfActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSair.setMnemonic('S');
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        nomeLocal.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        nomeLocal.setText("Instituto Gesundheit! ");

        logoLocal.setIcon(new javax.swing.ImageIcon("D:\\Usuários\\joaoz\\Desktop\\UTFPR\\ENGENHARIA ELETRÔNICA\\DISCIPLINAS\\SEGUNDO PERÍODO\\IF62C- FUNDAMENTOS DE PROGRAMAÇÃO 2\\PACOTES\\Medicina\\imagens\\Local.jpg")); // NOI18N

        imagemLocal.setIcon(new javax.swing.ImageIcon("D:\\Usuários\\joaoz\\Desktop\\UTFPR\\ENGENHARIA ELETRÔNICA\\DISCIPLINAS\\SEGUNDO PERÍODO\\IF62C- FUNDAMENTOS DE PROGRAMAÇÃO 2\\PACOTES\\Medicina\\imagens\\Principal2.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoLocal)
                        .addGap(138, 138, 138)
                        .addComponent(nomeLocal)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagemLocal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 461, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btCadastroProf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(logoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(nomeLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70)
                        .addComponent(imagemLocal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(btAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btCadastroProf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgendarActionPerformed
        Agendamento agendamento = new Agendamento();
        agendamento.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btAgendarActionPerformed

    private void btPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPacienteActionPerformed
        Portal_do_Paciente portalDoPaciente = new Portal_do_Paciente();
        portalDoPaciente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btPacienteActionPerformed

    private void btCadastroProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroProfActionPerformed
        Portal_do_Profissional portalProf = new Portal_do_Profissional();
        portalProf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCadastroProfActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgendar;
    private javax.swing.JButton btCadastroProf;
    private javax.swing.JButton btPaciente;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel imagemLocal;
    private javax.swing.JLabel logoLocal;
    private javax.swing.JLabel nomeLocal;
    // End of variables declaration//GEN-END:variables
}
