/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MarcaController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Marca;

/**
 *
 * @author Claudinei
 */
public class ViewMarca extends javax.swing.JFrame {

    /**
     * Creates new form ViewCategoria
     */
    public ViewMarca() {
        initComponents();

        atualizarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        btnMarcaAdicionar = new javax.swing.JButton();
        btnMarcaExcluir = new javax.swing.JButton();
        btnMarcaAlterar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtMarca = new javax.swing.JTable();
        txtMarcaCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMarcaPesquisar = new javax.swing.JTextField();
        btnMarcaPesquisar = new javax.swing.JButton();
        txtMarcaDescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jmnSair = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro e Manutenção de Marcas");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnMarcaAdicionar.setText("Salvar");
        btnMarcaAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcaAdicionarActionPerformed(evt);
            }
        });

        btnMarcaExcluir.setText("Excluir");
        btnMarcaExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcaExcluirActionPerformed(evt);
            }
        });

        btnMarcaAlterar.setText("Alterar");
        btnMarcaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcaAlterarActionPerformed(evt);
            }
        });

        jtMarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descricao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMarcaMouseClicked(evt);
            }
        });
        jtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtMarcaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtMarcaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMarcaKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jtMarca);

        txtMarcaCodigo.setEditable(false);
        txtMarcaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaCodigoActionPerformed(evt);
            }
        });

        jLabel4.setText("Codigo");

        txtMarcaPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaPesquisarActionPerformed(evt);
            }
        });

        btnMarcaPesquisar.setText("Pesquisar");
        btnMarcaPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcaPesquisarActionPerformed(evt);
            }
        });

        txtMarcaDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaDescricaoActionPerformed(evt);
            }
        });

        jLabel1.setText("Descricao");

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jMenu2.setText("Arquivo");

        jmnSair.setText("Sair");
        jmnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnSairActionPerformed(evt);
            }
        });
        jMenu2.add(jmnSair);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(89, 89, 89)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtMarcaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(txtMarcaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnMarcaAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMarcaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMarcaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtMarcaPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnMarcaPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMarcaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarcaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMarcaAdicionar)
                    .addComponent(btnMarcaExcluir)
                    .addComponent(btnMarcaAlterar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtMarcaPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMarcaPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnSair))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMarcaAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcaAdicionarActionPerformed

        Marca marca = new Marca();
        MarcaController marcaController = new MarcaController();

        marca.setMarcaDescricao(txtMarcaDescricao.getText());
        //inserir categoria no BD
        marcaController.inserirMarcaController(marca);

        txtMarcaCodigo.setText("");
        txtMarcaDescricao.setText("");

        //Atualiza tabela (grid)
        atualizarTabela();
    }//GEN-LAST:event_btnMarcaAdicionarActionPerformed

    public void atualizarTabela() {

        //limpa dados da DefaultTableModel
        DefaultTableModel modelo = (DefaultTableModel) jtMarca.getModel();
        modelo.setNumRows(0);

        MarcaController marcaController = new MarcaController();

        for (Marca marca : marcaController.buscarMarcaController()) {
            //DefaultTable
            modelo.addRow(new Object[]{
                marca.getMarcaCodigo(),
                marca.getMarcaDescricao()

            });

        }

    }
    private void btnMarcaExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcaExcluirActionPerformed
        //A6
        if (jtMarca.getSelectedRow() != -1) { //verifica se está selecionada
            Marca marca = new Marca();
            MarcaController marcaController = new MarcaController();
            //excluir categoria no BD
            marca.setMarcaCodigo((int) 
                    jtMarca.getValueAt(jtMarca.getSelectedRow(), 0));
            marcaController.excluirMarcaController(marca);
            txtMarcaCodigo.setText("");
            txtMarcaDescricao.setText("");
            //Atualiza tabela (grid)
            atualizarTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma marca para excluir");
        }
    }//GEN-LAST:event_btnMarcaExcluirActionPerformed

    private void btnMarcaAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcaAlterarActionPerformed

        if (jtMarca.getSelectedRow() != -1) {
            Marca marca = new Marca();
            MarcaController marcaController = new MarcaController();
            marca.setMarcaDescricao(txtMarcaDescricao.getText());
            marca.setMarcaCodigo((int) jtMarca.getValueAt(
                    jtMarca.getSelectedRow(), 0));
            marcaController.atualizarMarcaController(marca);
            txtMarcaCodigo.setText("");
            txtMarcaDescricao.setText("");
            atualizarTabela();
        }

    }//GEN-LAST:event_btnMarcaAlterarActionPerformed

    public void pesquisarCategoria(String marcaDescricao) {

        //limpa dados da DefaultTableModel
        DefaultTableModel modelo = (DefaultTableModel) jtMarca.getModel();
        modelo.setNumRows(0);

        MarcaController marcaController = new MarcaController();

        for (Marca marca : marcaController.buscarMarcaController(marcaDescricao)) {

            //DefaultTable
            modelo.addRow(new Object[]{
                marca.getMarcaCodigo(),
                marca.getMarcaDescricao(),});

        }

    }


    private void txtMarcaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaCodigoActionPerformed

    private void txtMarcaPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaPesquisarActionPerformed

    private void btnMarcaPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcaPesquisarActionPerformed

        pesquisarCategoria(txtMarcaPesquisar.getText());

    }//GEN-LAST:event_btnMarcaPesquisarActionPerformed

    private void txtMarcaDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaDescricaoActionPerformed

    private void jtMarcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMarcaKeyReleased
        if (jtMarca.getSelectedRow() != -1) {
            txtMarcaCodigo.setText(jtMarca.getValueAt(jtMarca.getSelectedRow(), 0).toString());
            txtMarcaDescricao.setText(jtMarca.getValueAt(jtMarca.getSelectedRow(), 1).toString());

        }
    }//GEN-LAST:event_jtMarcaKeyReleased

    private void jtMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMarcaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMarcaKeyPressed

    private void jtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMarcaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMarcaKeyTyped

    private void jtMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMarcaMouseClicked
        if (jtMarca.getSelectedRow() != -1) {
           
            txtMarcaCodigo.setText(jtMarca.getValueAt(
                    jtMarca.getSelectedRow(), 0).toString());
            
            txtMarcaDescricao.setText(jtMarca.getValueAt(
                    jtMarca.getSelectedRow(), 1).toString());

        }
    }//GEN-LAST:event_jtMarcaMouseClicked

    private void jmnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnSairActionPerformed

        this.dispose(); // fecha esta tela

    }//GEN-LAST:event_jmnSairActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose(); // fecha esta tela
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(ViewMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMarca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMarcaAdicionar;
    private javax.swing.JButton btnMarcaAlterar;
    private javax.swing.JButton btnMarcaExcluir;
    private javax.swing.JButton btnMarcaPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem jmnSair;
    private javax.swing.JTable jtMarca;
    private javax.swing.JTextField txtMarcaCodigo;
    private javax.swing.JTextField txtMarcaDescricao;
    private javax.swing.JTextField txtMarcaPesquisar;
    // End of variables declaration//GEN-END:variables
}