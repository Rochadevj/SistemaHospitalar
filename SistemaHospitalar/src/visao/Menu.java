
package visao;

import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagem/fundo.png"));
        final Image image = icon.getImage();
        jAreaTrabalho = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(), getHeight(),this);

            };

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmiCadProduto = new javax.swing.JMenuItem();
        jmConsulta = new javax.swing.JMenu();
        jmiComJtable = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setBackground(new java.awt.Color(51, 153, 255));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setAlignmentY(1.0F);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jmCadastro.setText("Cadastro");
        jmCadastro.setActionCommand("Cadastro");

        jmiCadProduto.setText("Paciente");
        jmiCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadProdutoActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiCadProduto);

        jMenuBar1.add(jmCadastro);

        jmConsulta.setText("Busca");

        jmiComJtable.setText("Paciente");
        jmiComJtable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiComJtableActionPerformed(evt);
            }
        });
        jmConsulta.add(jmiComJtable);

        jMenuBar1.add(jmConsulta);

        jmSair.setText("Sair");
        jmSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jAreaTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jAreaTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirCadPaciente() {
        GuiCadPaciente gcp = new GuiCadPaciente();
        jAreaTrabalho.add(gcp);
        gcp.setVisible(true);
    }//fecha método

    private void abrirJanelaTable() {
        GuiJTableBuscaPaciente gmp = new GuiJTableBuscaPaciente();
        jAreaTrabalho.add(gmp);
        gmp.setVisible(true);
    }//fecha método

    private void jmiCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadProdutoActionPerformed
        abrirCadPaciente();
    }//GEN-LAST:event_jmiCadProdutoActionPerformed

    private void jmiComJtableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiComJtableActionPerformed
        abrirJanelaTable();
    }//GEN-LAST:event_jmiComJtableActionPerformed

    private void jmSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSairMouseClicked
        System.exit(EXIT_ON_CLOSE);
    }//GEN-LAST:event_jmSairMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jAreaTrabalho;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmConsulta;
    private javax.swing.JMenu jmSair;
    private javax.swing.JMenuItem jmiCadProduto;
    private javax.swing.JMenuItem jmiComJtable;
    // End of variables declaration//GEN-END:variables
}
