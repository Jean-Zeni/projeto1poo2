/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UsuarioController;
import java.awt.Color;
import java.net.URL;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Usuario;
import utils.Utils;

/**
 *
 * @author s.lucas
 */
public class FrAltUsu extends javax.swing.JDialog {

    private Usuario usuario;

    /**
     * Creates new form FrAltUsu
     */
    public FrAltUsu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnAltUsu = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        lblSenha = new javax.swing.JLabel();
        lblConfSenha = new javax.swing.JLabel();
        txtConfSenha = new javax.swing.JPasswordField();
        lblDataNasc = new javax.swing.JLabel();
        txtDataNasc = new javax.swing.JFormattedTextField();
        cbAtivo = new javax.swing.JCheckBox();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnAlterarSenha = new javax.swing.JButton();
        lbCodeTitle = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PnAltUsu.setBackground(new java.awt.Color(0, 185, 110));
        PnAltUsu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setText("Nome:");
        PnAltUsu.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        PnAltUsu.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 336, -1));

        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setText("Email:");
        PnAltUsu.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        PnAltUsu.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 336, -1));

        txtSenha.setEditable(false);
        txtSenha.setBackground(new java.awt.Color(204, 204, 204));
        PnAltUsu.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 336, -1));

        lblSenha.setForeground(new java.awt.Color(0, 0, 0));
        lblSenha.setText("Senha:");
        PnAltUsu.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 20));

        lblConfSenha.setForeground(new java.awt.Color(0, 0, 0));
        lblConfSenha.setText("Confirmar senha:");
        PnAltUsu.add(lblConfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        txtConfSenha.setEditable(false);
        txtConfSenha.setBackground(new java.awt.Color(204, 204, 204));
        PnAltUsu.add(txtConfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 336, -1));

        lblDataNasc.setForeground(new java.awt.Color(0, 0, 0));
        lblDataNasc.setText("Data de nascimento:");
        PnAltUsu.add(lblDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        PnAltUsu.add(txtDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 140, -1));

        cbAtivo.setBackground(new java.awt.Color(0, 185, 110));
        cbAtivo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbAtivo.setForeground(new java.awt.Color(0, 0, 0));
        cbAtivo.setText("Ativo");
        cbAtivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnAltUsu.add(cbAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close16.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PnAltUsu.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, 30));

        btnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save24px.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });
        PnAltUsu.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, 30));

        lblTitulo.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        lblTitulo.setText("Alterar Usuários");
        PnAltUsu.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        btnAlterarSenha.setBackground(new java.awt.Color(0, 185, 110));
        btnAlterarSenha.setForeground(new java.awt.Color(0, 0, 0));
        btnAlterarSenha.setText("Alterar senha");
        btnAlterarSenha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlterarSenha.setBorderPainted(false);
        btnAlterarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarSenhaMouseClicked(evt);
            }
        });
        btnAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarSenhaActionPerformed(evt);
            }
        });
        PnAltUsu.add(btnAlterarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        lbCodeTitle.setForeground(new java.awt.Color(0, 0, 0));
        lbCodeTitle.setText("Código:");
        PnAltUsu.add(lbCodeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        txtCode.setEditable(false);
        txtCode.setBackground(new java.awt.Color(204, 204, 204));
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });
        PnAltUsu.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 30, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/caneta64px.png"))); // NOI18N
        PnAltUsu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnAltUsu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PnAltUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed


    private void btnAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarSenhaActionPerformed

    }//GEN-LAST:event_btnAlterarSenhaActionPerformed

    private void btnAlterarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarSenhaMouseClicked

        if (txtSenha.isEditable() == false) {
            txtSenha.setEditable(true);
            txtConfSenha.setEditable(true);
            txtSenha.setBackground(Color.white);
            txtConfSenha.setBackground(Color.white);
            btnAlterarSenha.setText("Cancelar alteração");

            txtSenha.setText("");
            txtConfSenha.setText("");
        } else {
            txtSenha.setEditable(false);
            txtConfSenha.setEditable(false);
            txtSenha.setBackground(Color.lightGray);
            txtConfSenha.setBackground(Color.lightGray);
            btnAlterarSenha.setText("Alterar senha");

            txtSenha.setText("");
            txtConfSenha.setText("");
        }

    }//GEN-LAST:event_btnAlterarSenhaMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        carregarUsuario();

        URL caminhoImagem = getClass().getResource("/images/401278_gnu_icon.png");

        ImageIcon icon = new ImageIcon(caminhoImagem);

        //DEFINE A IMAGEM
        this.setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowOpened

    public void carregarUsuario() {
        //Vamos buscar no banco de dados o restante dos campos do usuario,
        //atualmente só tem o pk

        UsuarioController controller = new UsuarioController();
        usuario = controller.buscarPorPk(usuario.getPkUsuario());

        String codigo = String.valueOf(usuario.getPkUsuario());
        txtCode.setText(codigo);
        txtNome.setText(usuario.getNome());
        txtEmail.setText(usuario.getEmail());
        txtDataNasc.setText(Utils.converterDateToString(usuario.getDataNasc()));
        cbAtivo.setSelected(usuario.isAtivo());

    }

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

        if (txtSenha.isEditable()) {
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
        }

        return true;
    }

    public void gravar() {
        //vai atualizar os dados do atributo usuario
        //Usuario usu = new Usuario();

        usuario.setNome(txtNome.getText());
        usuario.setEmail(txtEmail.getText());
        
        if(txtSenha.isEditable()){

        String senha = new String(txtSenha.getPassword());
        String senhaHash = Utils.calcularHash(senha);
        usuario.setSenha(senhaHash);
        }
        
        Date data = Utils.converterStringToDate(txtDataNasc.getText());
        usuario.setDataNasc(data);

        usuario.setAtivo(cbAtivo.isSelected());

        UsuarioController controller = new UsuarioController();

        if (controller.alterarUsuario(usuario)) {
            JOptionPane.showMessageDialog(null, "Usuário: " + usuario.getNome() + " alterado com sucesso!");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuário não pode ser alterado!");
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
            java.util.logging.Logger.getLogger(FrAltUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrAltUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrAltUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrAltUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrAltUsu dialog = new FrAltUsu(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel PnAltUsu;
    private javax.swing.JButton btnAlterarSenha;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox cbAtivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbCodeTitle;
    private javax.swing.JLabel lblConfSenha;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCode;
    private javax.swing.JPasswordField txtConfSenha;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
