
package visao;

import dao.ConvenioDAO;
import dao.PacienteDAO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Convenio;
import modelo.Paciente;
import servicos.ConvenioServicos;
import servicos.ServicosFactory;
import javax.swing.text.AbstractDocument;

public class GuiCadPaciente extends javax.swing.JInternalFrame {

    public GuiCadPaciente() {
        initComponents();
        preencherCombo();
       
        ((AbstractDocument) jtNome.getDocument()).setDocumentFilter(new LimiteCaracteres(55));
        ((AbstractDocument) jtEndereco.getDocument()).setDocumentFilter(new LimiteCaracteres(200));
        ((AbstractDocument) jtTelefone.getDocument()).setDocumentFilter(new LimiteCaracteres(14));
        ((AbstractDocument) jtEmail1.getDocument()).setDocumentFilter(new LimiteCaracteres(80));
        ((AbstractDocument) jtCpf.getDocument()).setDocumentFilter(new LimiteCaracteres(11));
        ((AbstractDocument) jtRG.getDocument()).setDocumentFilter(new LimiteCaracteres(18));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jlNome = new javax.swing.JLabel();
        jlCpf = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtEndereco = new javax.swing.JTextField();
        jlEspecialidade = new javax.swing.JLabel();
        jlDataNasc = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jlEmail1 = new javax.swing.JLabel();
        jtEmail1 = new javax.swing.JTextField();
        jlRG = new javax.swing.JLabel();
        jtRG = new javax.swing.JTextField();
        jcConvenio = new javax.swing.JComboBox<>();
        jtDataNasc = new javax.swing.JFormattedTextField();
        jtCpf = new javax.swing.JFormattedTextField();
        jtTelefone = new javax.swing.JFormattedTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbLimpar = new javax.swing.JButton();
        jbCadastrar1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("CADASTRO PACIENTE");

        jLayeredPane1.setBackground(new java.awt.Color(204, 255, 255));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLayeredPane1.setOpaque(true);

        jlNome.setText("Nome");
        jLayeredPane1.add(jlNome);
        jlNome.setBounds(40, 20, 60, 30);

        jlCpf.setText("CPF");
        jLayeredPane1.add(jlCpf);
        jlCpf.setBounds(40, 60, 90, 30);

        jlEndereco.setText("Endereço");
        jLayeredPane1.add(jlEndereco);
        jlEndereco.setBounds(40, 140, 60, 30);
        jLayeredPane1.add(jtNome);
        jtNome.setBounds(140, 20, 210, 30);
        jLayeredPane1.add(jtEndereco);
        jtEndereco.setBounds(140, 140, 210, 30);

        jlEspecialidade.setText("Convênio");
        jLayeredPane1.add(jlEspecialidade);
        jlEspecialidade.setBounds(40, 300, 100, 30);

        jlDataNasc.setText("Data Nascimento");
        jLayeredPane1.add(jlDataNasc);
        jlDataNasc.setBounds(40, 260, 100, 30);

        jlTelefone.setText("Telefone");
        jLayeredPane1.add(jlTelefone);
        jlTelefone.setBounds(40, 180, 50, 30);

        jlEmail1.setText("E-mal");
        jLayeredPane1.add(jlEmail1);
        jlEmail1.setBounds(40, 220, 90, 30);
        jLayeredPane1.add(jtEmail1);
        jtEmail1.setBounds(140, 220, 210, 30);

        jlRG.setText("RG");
        jLayeredPane1.add(jlRG);
        jlRG.setBounds(40, 100, 90, 30);
        jLayeredPane1.add(jtRG);
        jtRG.setBounds(140, 100, 210, 30);

        jLayeredPane1.add(jcConvenio);
        jcConvenio.setBounds(140, 300, 150, 30);

        try {
            jtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jLayeredPane1.add(jtDataNasc);
        jtDataNasc.setBounds(140, 260, 210, 30);

        try {
            jtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jLayeredPane1.add(jtCpf);
        jtCpf.setBounds(140, 60, 210, 30);

        try {
            jtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jLayeredPane1.add(jtTelefone);
        jtTelefone.setBounds(140, 180, 210, 30);

        jLayeredPane2.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLayeredPane2.setOpaque(true);

        jbLimpar.setText("limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jbLimpar);
        jbLimpar.setBounds(290, 20, 140, 40);

        jbCadastrar1.setText("cadastrar");
        jbCadastrar1.setMinimumSize(new java.awt.Dimension(78, 20));
        jbCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrar1ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jbCadastrar1);
        jbCadastrar1.setBounds(80, 20, 140, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addComponent(jLayeredPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Paciente pac = new Paciente();
            pac.setNome(jtNome.getText());
            pac.setEndereco(jtEndereco.getText());
            pac.setDataNascimento(sdf.parse(jtDataNasc.getText()));
            pac.setTelefone(jtTelefone.getText());
            pac.setEmail(jtEmail1.getText());
            pac.setCpf(jtCpf.getText());
            pac.setRg(jtRG.getText());

            if (!(jcConvenio.getSelectedIndex() == 0)) {
                String conv = jcConvenio.getSelectedItem().toString();
                ConvenioDAO convDAO = new ConvenioDAO();
                Convenio convenio = convDAO.buscarConvenioFiltro(conv);
                pac.setConvenio(convenio.getIdConvenio());

            } else {
                JOptionPane.showMessageDialog(this,
                        "Selecione um produto");
            }
            
            if (jtNome.getText().isEmpty()){
                     JOptionPane.showMessageDialog(this,
                    "Insira um nome. ");
                    
             }else if(jtEndereco.getText().isEmpty()){
                        JOptionPane.showMessageDialog(this,
                    "Insira um endereco. ");
                 
                    }else if(jtTelefone.getText().isEmpty()){
                        JOptionPane.showMessageDialog(this,
                    "Insira um telefone. ");
                 
                    }else if(jtCpf.getText().isEmpty()){
                        JOptionPane.showMessageDialog(this,
                    "Insira um CPF. ");
                 
                    }else if(jtRG.getText().isEmpty()){
                        JOptionPane.showMessageDialog(this,
                    "Insira um RG. ");
                 
                    }else{
                         JOptionPane.showMessageDialog(this, "Paciente cadastrado com sucesso!");
                    }
            
            PacienteDAO pacDAO = new PacienteDAO();
            pacDAO.cadastrarPaciente(pac);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "ERRO! " + e.getMessage());
        }
    }

    public void limpar() {
        jtNome.setText("");
        jtEndereco.setText("");
        jtCpf.setText("");
        jtDataNasc.setText("");
        jtEmail1.setText("");
        jtTelefone.setText("");
        jtRG.setText("");
    }
    
    private void preencherCombo() {
        try {
            ConvenioServicos ps = ServicosFactory.getConvenioServicos();
            ArrayList<Convenio> p = new ArrayList<>();
            p = ps.buscarConvenio();
            jcConvenio.addItem("-Selecione-");
            for (int i = 0; i < p.size(); i++) {
            jcConvenio.addItem(p.get(i).getNomeConvenio());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro! " + e.getMessage());
        }
    }

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {
        limpar();
    }

    private void jbCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {
        cadastrar();
        limpar();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JButton jbCadastrar1;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JComboBox<String> jcConvenio;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlDataNasc;
    private javax.swing.JLabel jlEmail1;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlEspecialidade;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlRG;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JFormattedTextField jtCpf;
    private javax.swing.JFormattedTextField jtDataNasc;
    private javax.swing.JTextField jtEmail1;
    private javax.swing.JTextField jtEndereco;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtRG;
    private javax.swing.JFormattedTextField jtTelefone;
    // End of variables declaration//GEN-END:variables
}
