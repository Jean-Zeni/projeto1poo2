/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UsuarioController;
import java.io.File;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Usuario;
import utils.Utils;

/**
 *
 * @author s.lucas
 */
public class FrCadUsuario extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     */
    public FrCadUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
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
        lblIcon = new javax.swing.JLabel();
        lblTituloCad = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        lblConfSenha = new javax.swing.JLabel();
        txtConfSenha = new javax.swing.JPasswordField();
        lblDataNasc = new javax.swing.JLabel();
        txtDataNasc = new javax.swing.JFormattedTextField();
        cbAtivo = new javax.swing.JCheckBox();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        btnEscolherFoto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 255, 212));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon.setBackground(new java.awt.Color(255, 255, 255));
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/poke48px.png"))); // NOI18N
        jPanel1.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 12, -1, -1));

        lblTituloCad.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblTituloCad.setText("Cadastro de Usuário");
        jPanel1.add(lblTituloCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 29, -1, -1));

        lblNome.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lblNome.setText("Nome:");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 370, -1));

        lblEmail.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lblEmail.setText("Email:");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 370, -1));

        lblSenha.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lblSenha.setText("Senha:");
        jPanel1.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 370, -1));

        lblConfSenha.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lblConfSenha.setText("Confirmar senha:");
        jPanel1.add(lblConfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));
        jPanel1.add(txtConfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 370, -1));

        lblDataNasc.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lblDataNasc.setText("Data de nascimento:");
        jPanel1.add(lblDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        jPanel1.add(txtDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 140, -1));

        cbAtivo.setBackground(new java.awt.Color(244, 255, 212));
        cbAtivo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cbAtivo.setText("Ativo");
        cbAtivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close16.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, -1, -1));

        btnSalvar.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/access16.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, -1, -1));

        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 140));

        btnEscolherFoto.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btnEscolherFoto.setText("Selecionar imagem");
        btnEscolherFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEscolherFotoMouseClicked(evt);
            }
        });
        btnEscolherFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscolherFotoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEscolherFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        if (verificarCampos() == true) {
            gravar();
        }
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEscolherFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscolherFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEscolherFotoActionPerformed

    private void btnEscolherFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEscolherFotoMouseClicked
        //CRIA UM ESCOLHEDOR DE ARQUVOS
        JFileChooser exploradorArquivos = new JFileChooser();

        //DEFINE O TITULO QUE APARECERA NA JANELA DO EXPLORADOR DE ARQUIVOS
        exploradorArquivos.setDialogTitle("Escolha um arquivo");

        //FILTRAR OS TIPOS DE ARQUIVOS QUE IRÁ BUSCAR
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagens", "jpg", "jpeg", "png");
        exploradorArquivos.setFileFilter(filtro);

        //CONFIGURAÇÕES PARA PERMITIR A SELEÇÃO DE APENAS UM ARQUIVO
        exploradorArquivos.setMultiSelectionEnabled(false);

        /*Chama o explorador de arquivos e guarda o resultado:
        APPROVE_OPTION (selecionou)
        CANCEL_OPTION (usuário cancelou)*/
        int resultado = exploradorArquivos.showOpenDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            //PEGA O ARQUIVO SELECIONADO
            File arquivo = exploradorArquivos.getSelectedFile();

            //Converte para um ícone
            Icon icone = Utils.converterFileParaIcon(arquivo);

            //Redimensiona para o tamanho que irá aparecer na tela
            ImageIcon iconeRedimensionado = Utils.redimensionarIcon(icone, 140, 140);

            //Coloca o icone na label da tela
            lblFoto.setIcon(iconeRedimensionado);
        }
    }//GEN-LAST:event_btnEscolherFotoMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed


    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    public boolean verificarCampos() {
        if (txtNome.equals("")) {
            JOptionPane.showMessageDialog(null, "O campo 'Nome' está vazio!");
            return false;
        }

        if (!txtNome.getText().matches("^[\\p{L} ]+$")) {
            JOptionPane.showMessageDialog(null, "O campo 'Nome' possui caracteres inválidos!");
            return false;
        }

        if (txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo'Email' está vazio!");
            return false;
        }

        if (!txtEmail.getText().matches(
                "^[a-z0-9._-]+@[a-z._]+.[a-z._]+$")) {
            JOptionPane.showMessageDialog(null, "O campo 'Email' possui caracteres inválidos!");
        }

        if (!txtDataNasc.getText().matches(
                "^[0-9]{2}/[0-9]{2}/[0-9]{4}$")) {
            JOptionPane.showMessageDialog(null, "O campo 'Data de nascimento' possui formatação incorreta"
                    + " Ex.: 01/01/1990");
            return false;
        }

        String senha = new String(txtSenha.getPassword());
        String confSenha = new String(txtConfSenha.getPassword());

        if (senha.length() < 8) {
            JOptionPane.showMessageDialog(null, "O campo 'Senha' está vazio ou contém menos de 8 caracteres!");
            return false;
        }

        if (!senha.equals(confSenha)) {
            JOptionPane.showMessageDialog(null, "A confirmação e a senha necessitam ser iguais!");
            return false;
        }

        return true;
    }

    public void gravar() {
        //INSTANCIAR UM OBJETO USUARIO
        Usuario usu = new Usuario();

        usu.setNome(txtNome.getText());
        usu.setEmail(txtEmail.getText());

        String senha = new String(txtSenha.getPassword());
        String senhaHash = Utils.calcularHash(senha);
        usu.setSenha(senhaHash);

        Date data = Utils.converterStringToDate(txtDataNasc.getText());
        usu.setDataNasc(data);

        usu.setAtivo(cbAtivo.isSelected());

        usu.setImagem(lblFoto.getIcon());

        UsuarioController controller = new UsuarioController();

        if (controller.inserirUsuario(usu)) {
            JOptionPane.showMessageDialog(null, "Usuário: " + usu.getNome() + " inserido com sucesso!");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuário não pode ser inserido!");
        }
    }

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
            java.util.logging.Logger.getLogger(FrCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrCadUsuario dialog = new FrCadUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEscolherFoto;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox cbAtivo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConfSenha;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTituloCad;
    private javax.swing.JPasswordField txtConfSenha;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

}
