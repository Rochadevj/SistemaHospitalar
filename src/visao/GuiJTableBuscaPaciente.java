package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Paciente;
import servicos.PacienteServicos;
import servicos.ServicosFactory;

public class GuiJTableBuscaPaciente extends javax.swing.JInternalFrame {

    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Código", "Nome", "CPF", "Telefone"});

    public GuiJTableBuscaPaciente() {
        initComponents();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablePaciente = new javax.swing.JTable();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbLimpar = new javax.swing.JButton();
        jbPreencherTabela = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jlFiltro = new javax.swing.JLabel();
        jtFiltro = new javax.swing.JTextField();
        jcomboFiltro = new javax.swing.JComboBox();
        jlPesquisarpor = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("BUSCAR PACIENTES");

        jLayeredPane1.setBackground(new java.awt.Color(204, 255, 255));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLayeredPane1.setOpaque(true);

        jtablePaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Telefone"
            }
        ));
        jtablePaciente.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtablePaciente);

        jLayeredPane1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 20, 452, 180);

        jLayeredPane2.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLayeredPane2.setOpaque(true);

        jbLimpar.setText("Limpar Busca");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jbLimpar);
        jbLimpar.setBounds(70, 40, 140, 40);

        jbPreencherTabela.setText("Todos Pacientes");
        jbPreencherTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPreencherTabelaActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jbPreencherTabela);
        jbPreencherTabela.setBounds(270, 40, 140, 40);

        jLayeredPane3.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLayeredPane3.setOpaque(true);

        jlFiltro.setText("Valor para pesquisar:");
        jLayeredPane3.add(jlFiltro);
        jlFiltro.setBounds(250, 20, 120, 16);

        jtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtFiltroKeyReleased(evt);
            }
        });
        jLayeredPane3.add(jtFiltro);
        jtFiltro.setBounds(250, 40, 170, 40);

        jcomboFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código Paciente", "CPF", "Nome Paciente", " " }));
        jcomboFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboFiltroActionPerformed(evt);
            }
        });
        jLayeredPane3.add(jcomboFiltro);
        jcomboFiltro.setBounds(50, 40, 170, 40);

        jlPesquisarpor.setText("Pesquisar por: ");
        jLayeredPane3.add(jlPesquisarpor);
        jlPesquisarpor.setBounds(50, 20, 150, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método que seta o modelo de tabela para que fique sem linhas.
    private void limparTabela() {
        /* Para limpar a tabela temos que setar o número de
         linhas para zero no default table model */
        dtm.setNumRows(0);
    }

    private void preencherTabela() {
        try {  
            PacienteServicos ps = ServicosFactory.getPacienteServicos();
            ArrayList<Paciente> pac = new ArrayList<>();
            pac = ps.buscarPaciente();
            limparTabela();

            for (int i = 0; i < pac.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(pac.get(i).getIdPaciente()),
                    String.valueOf(pac.get(i).getNome()),
                    String.valueOf(pac.get(i).getCpf()),
                    String.valueOf(pac.get(i).getTelefone()),});
            }

            jtablePaciente.setModel(dtm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro! " + e.getMessage());
        }
    }

    private void buscarFiltro() {
        try {
            if (!jtFiltro.getText().isEmpty()) {
                PacienteServicos ps = ServicosFactory.getPacienteServicos();
                String pesquisa = (String) jcomboFiltro.getSelectedItem();
                String query;

                if (pesquisa.equals("Código Paciente")) {
                    query = "where ID_PACIENTE = " + jtFiltro.getText() + "";
                } else if (pesquisa.equals("CPF")) {               
                   query = "where CPF like '%" + jtFiltro.getText() + "%'";
                } else {
                    query = "where NOME like '%" + jtFiltro.getText() + "%'";
                }
               System.out.println("Query gerada: " + query);
               ArrayList<Paciente> p = new ArrayList<>();

                p = ps.buscarPacienteFiltro(query);
                System.out.println("Número de resultados: " + p.size()); // Adicionando mensagem de depuração
                limparTabela();

                for (int i = 0; i < p.size(); i++) {
                    dtm.addRow(new String[]{
                        String.valueOf(p.get(i).getIdPaciente()),
                        p.get(i).getNome(),
                        p.get(i).getCpf(),
                        p.get(i).getTelefone(),});
                }

                jtablePaciente.setModel(dtm);
                } else {
                preencherTabela();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao buscar! " + e.getMessage());
        }
    }

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limparTabela();
        jtFiltro.setText("");
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFiltroKeyReleased
        buscarFiltro();
    }//GEN-LAST:event_jtFiltroKeyReleased

    private void jbPreencherTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPreencherTabelaActionPerformed
        preencherTabela();
    }//GEN-LAST:event_jbPreencherTabelaActionPerformed

    private void jcomboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboFiltroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbPreencherTabela;
    private javax.swing.JComboBox jcomboFiltro;
    private javax.swing.JLabel jlFiltro;
    private javax.swing.JLabel jlPesquisarpor;
    private javax.swing.JTextField jtFiltro;
    private javax.swing.JTable jtablePaciente;
    // End of variables declaration//GEN-END:variables
}
