/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProdutoController;
import java.io.File;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import utils.Utils;
import model.Produtos;

/**
 *
 * @author aluno.saolucas
 */
public class FrCadastrarProdutos extends javax.swing.JDialog {

    /**
     * Creates new form FrProdutos
     */
    public FrCadastrarProdutos(java.awt.Frame parent, boolean modal) {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblQuantia = new javax.swing.JLabel();
        txtQuantia = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblIcon = new javax.swing.JLabel();
        lblImageProd = new javax.swing.JLabel();
        lblFotoProduto = new javax.swing.JLabel();
        btnSelecionarImg = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 255, 212));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitle.setText("Cadastrar Produtos");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        lblNome.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        lblNome.setText("Nome:");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 10));

        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(txtNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 380, -1));

        lblValor.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        lblValor.setText("Valor:");
        jPanel1.add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        jPanel1.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 70, -1));

        lblQuantia.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        lblQuantia.setText("Quantidade:");
        jPanel1.add(lblQuantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));
        jPanel1.add(txtQuantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 70, -1));

        btnGravar.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        btnGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save24px.png"))); // NOI18N
        btnGravar.setText("Gravar");
        btnGravar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGravarMouseClicked(evt);
            }
        });
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGravar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, 30));

        btnCancelar.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close16.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 100, 30));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/poke64px.png"))); // NOI18N
        jPanel1.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        lblImageProd.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        lblImageProd.setText("Imagem:");
        jPanel1.add(lblImageProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        lblFotoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblFotoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 140, 140));

        btnSelecionarImg.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        btnSelecionarImg.setText("Selecionar imagem");
        btnSelecionarImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelecionarImgMouseClicked(evt);
            }
        });
        btnSelecionarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarImgActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelecionarImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void btnGravarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGravarMouseClicked
        if (verificarCampos() == true) {
            gravar();
        }
    }//GEN-LAST:event_btnGravarMouseClicked

    private void btnSelecionarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarImgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSelecionarImgActionPerformed

    private void btnSelecionarImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelecionarImgMouseClicked
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
            lblFotoProduto.setIcon(iconeRedimensionado);
        }
    }//GEN-LAST:event_btnSelecionarImgMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGravarActionPerformed

    public boolean verificarCampos() {
        if (txtNomeProduto.equals("")) {
            JOptionPane.showMessageDialog(null, "O campo 'Nome' está vazio!");
            return false;
        }

        if (!txtNomeProduto.getText().matches("^[\\p{L} 0-9]+$")) {
            JOptionPane.showMessageDialog(null, "O campo 'Nome' possui caracteres inválidos!");
            return false;
        }

        if (txtValor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo 'valor' está vazio!");
            return false;
        }

        if (!txtValor.getText().matches(
                "^[0-9]+.[0-9]{2}+$")) {
            JOptionPane.showMessageDialog(null, "O campo 'Valor' possui caracteres inválidos!");
        }

        if (txtQuantia.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo 'Quantidade' está vazio!");
            return false;
        }

        if (!txtQuantia.getText().matches(
                "^[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "O campo 'Quantidade' possui caracteres inválidos!");
        }

        return true;
    }

    public void gravar() {
        //INSTANCIAR UM OBJETO PRODUTO
        Produtos prod = new Produtos();

        prod.setNomeProduto(txtNomeProduto.getText());

        double valor = Double.parseDouble(txtValor.getText());
        prod.setValorProduto(valor);

        double quantia = Double.parseDouble(txtQuantia.getText());
        prod.setQuantia(quantia);

        prod.setImgProduto(lblFotoProduto.getIcon());

        ProdutoController controller = new ProdutoController();

        if (controller.inserirProduto(prod)) {
            JOptionPane.showMessageDialog(null, "Produto: " + prod.getNomeProduto() + " inserido com sucesso!");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Produto não pode ser inserido!");
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
            java.util.logging.Logger.getLogger(FrCadastrarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCadastrarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCadastrarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCadastrarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrCadastrarProdutos dialog = new FrCadastrarProdutos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnSelecionarImg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblFotoProduto;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblImageProd;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuantia;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtQuantia;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
