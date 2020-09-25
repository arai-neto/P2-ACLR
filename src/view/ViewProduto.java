/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CategoriaController;
import controller.MarcaController;
import controller.ProdutoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Categoria;
import model.Marca;
import model.Produto;


/**
 *
 * @author Claudinei
 */
public class ViewProduto extends javax.swing.JFrame {
    
    ArrayList<Categoria> ListaCategoria;
    ArrayList<Marca> ListaMarca;

    /**
     * Creates new form ViewCategoria
     */

    
    public ViewProduto() {
        initComponents();
//Carrega as Categorias no Objeto cbxProdutoCategoria
        CategoriaController categoriaController = new CategoriaController();
        MarcaController marcaController = new MarcaController();
        
        for(Categoria categoria : categoriaController.buscarCategoriasController()){
           cbxProdutoCategoria.addItem(categoria.getCategoriaDescricao());
        }
        
         for(Marca marca : marcaController.buscarMarcaController()){
           cbxProdutoMarca.addItem(marca.getMarcaDescricao());
        }

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
        btnProdutoAdicionar = new javax.swing.JButton();
        btnProdutoExcluir = new javax.swing.JButton();
        btnProdutoAlterar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProduto = new javax.swing.JTable();
        txtProdutoCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtProdutoPesquisar = new javax.swing.JTextField();
        btnProdutoPesquisar = new javax.swing.JButton();
        txtProdutoDescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        cbxProdutoCategoria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtProdutoQuantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtProdutoValor = new javax.swing.JTextField();
        cbxProdutoMarca = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jmnSair = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro e Manutenção de Produtos");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnProdutoAdicionar.setText("Salvar");
        btnProdutoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoAdicionarActionPerformed(evt);
            }
        });

        btnProdutoExcluir.setText("Excluir");
        btnProdutoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoExcluirActionPerformed(evt);
            }
        });

        btnProdutoAlterar.setText("Alterar");
        btnProdutoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoAlterarActionPerformed(evt);
            }
        });

        jtProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descricao", "QNTD", "Valor", "Categoria", "Marca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProdutoMouseClicked(evt);
            }
        });
        jtProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtProdutoKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtProdutoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtProdutoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jtProduto);

        txtProdutoCodigo.setEditable(false);
        txtProdutoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoCodigoActionPerformed(evt);
            }
        });

        jLabel4.setText("Codigo");

        txtProdutoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoPesquisarActionPerformed(evt);
            }
        });

        btnProdutoPesquisar.setText("Pesquisar");
        btnProdutoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoPesquisarActionPerformed(evt);
            }
        });

        txtProdutoDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoDescricaoActionPerformed(evt);
            }
        });

        jLabel1.setText("Descricao");

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantidade");

        txtProdutoQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoQuantidadeActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor");

        txtProdutoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoValorActionPerformed(evt);
            }
        });

        jLabel5.setText("Categoria");

        jLabel6.setText("Marca");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtProdutoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16)
                                    .addComponent(btnProdutoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnProdutoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnProdutoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnProdutoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtProdutoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtProdutoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbxProdutoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(cbxProdutoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtProdutoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(txtProdutoDescricao)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProdutoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProdutoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProdutoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProdutoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxProdutoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxProdutoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProdutoAdicionar)
                    .addComponent(btnProdutoExcluir)
                    .addComponent(btnProdutoAlterar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtProdutoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnProdutoPesquisar))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addGap(76, 76, 76))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdutoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoAdicionarActionPerformed

        Produto produto = new Produto();
        ProdutoController produtoController = new ProdutoController();

        produto.setProdutoDescricao(txtProdutoDescricao.getText());
        produto.setProdutoQuantidade(Integer.parseInt(txtProdutoQuantidade.getText()));
        produto.setProdutoValor(Double.parseDouble(txtProdutoValor.getText()));
     
       
       // Categoria categoria = (Categoria) cbxProdutoCategoria.getSelectedItem();
       // produto.setProdutoCategoria(categoria);
        Categoria categoria = new Categoria(); 
       // categoria.setCategoriaDescricao(cbxProdutoCategoria.getSelectedItem().toString());
        categoria.setCategoriaCodigo(cbxProdutoCategoria.getSelectedIndex()-1);
       // cmbAparelho.getSelectedIndex();
        produto.setProdutoCategoria(categoria);
        

        produtoController.inserirProdutoController(produto);

        txtProdutoCodigo.setText("");
        txtProdutoDescricao.setText("");
        txtProdutoQuantidade.setText("");
        txtProdutoValor.setText("");

        //Atualiza tabela (grid)
        atualizarTabela();
    }//GEN-LAST:event_btnProdutoAdicionarActionPerformed

    public void atualizarTabela() {

        //limpa dados da DefaultTableModel
        DefaultTableModel modelo = (DefaultTableModel) jtProduto.getModel();
        modelo.setNumRows(0);

        ProdutoController produtoController = new ProdutoController();

        for (Produto produto : produtoController.buscarProdutoController()) {
            //DefaultTable
            modelo.addRow(new Object[]{
                produto.getProdutoCodigo(),
                produto.getProdutoDescricao(),
                produto.getProdutoQuantidade(),
                produto.getProdutoValor(),
                produto.getProdutoCategoria().getCategoriaCodigo(),
                produto.getProdutoCategoria().getCategoriaDescricao(),
              //  produto.getProdutoMarca().getMarcaDescricao()

            });

        }

    }
    
	public void carregarCbxCategoria()
	{
		for(int i = 0; i < ListaCategoria.size(); i ++)
		{
		//  cbxProdutoCategoria.addItem(ListaCategoria.get(i));
		}
	}    
    
    
    private void btnProdutoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoExcluirActionPerformed
        //A6
        if (jtProduto.getSelectedRow() != -1) { //verifica se está selecionada
            
            Produto produto = new Produto();
            ProdutoController produtoController = new ProdutoController();
            
            //excluir categoria no BD
            produto.setProdutoCodigo((int)jtProduto.getValueAt(jtProduto.getSelectedRow(), 0));
            
            produtoController.excluirProdutoController(produto);
            
            txtProdutoCodigo.setText("");
            txtProdutoDescricao.setText("");
            txtProdutoQuantidade.setText("");
            txtProdutoValor.setText("");
            
            //Atualiza tabela (grid)
            atualizarTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir");
        }
    }//GEN-LAST:event_btnProdutoExcluirActionPerformed

    private void btnProdutoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoAlterarActionPerformed

        if (jtProduto.getSelectedRow() != -1) {
            Produto produto = new Produto();
            ProdutoController produtoController = new ProdutoController();
            
            produto.setProdutoDescricao(txtProdutoDescricao.getText());
            produto.setProdutoQuantidade(Integer.parseInt(txtProdutoQuantidade.getText()));
            produto.setProdutoValor(Double.parseDouble(txtProdutoValor.getText()));
            
            Categoria categoria = new Categoria(); 
            categoria.setCategoriaCodigo(cbxProdutoCategoria.getSelectedIndex());
            produto.setProdutoCategoria(categoria);
        

            produtoController.inserirProdutoController(produto);
            
      //      Categoria categoria = (Categoria) cbxProdutoCategoria.getSelectedItem();
        //    produto.setProdutoCategoria(categoria);
            
            produto.setProdutoCodigo((int) jtProduto.getValueAt(jtProduto.getSelectedRow(), 0));
            
            produtoController.atualizarProdutoController(produto);
            
            txtProdutoCodigo.setText("");
            txtProdutoDescricao.setText("");
            txtProdutoQuantidade.setText("");
            txtProdutoValor.setText("");
            
            atualizarTabela();
        }

    }//GEN-LAST:event_btnProdutoAlterarActionPerformed

    public void pesquisarProduto(String produtoDescricao) {

        //limpa dados da DefaultTableModel
        DefaultTableModel modelo = (DefaultTableModel) jtProduto.getModel();
        modelo.setNumRows(0);

        ProdutoController produtoController = new ProdutoController();

        for (Produto produto : produtoController.buscarProdutoController(produtoDescricao)) {

            //DefaultTable
            modelo.addRow(new Object[]{
                produto.getProdutoCodigo(),
                produto.getProdutoDescricao(),
                produto.getProdutoQuantidade(),
                produto.getProdutoValor(),
               // produto.getProdutoCategoria().getCategoriaCodigo(),
                produto.getProdutoCategoria().getCategoriaDescricao(),
                produto.getProdutoMarca().getMarcaDescricao()
            });

        }

    }


    private void txtProdutoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoCodigoActionPerformed

    private void txtProdutoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoPesquisarActionPerformed

    private void btnProdutoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoPesquisarActionPerformed

        pesquisarProduto(txtProdutoPesquisar.getText());

    }//GEN-LAST:event_btnProdutoPesquisarActionPerformed

    private void txtProdutoDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoDescricaoActionPerformed

    private void jtProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtProdutoKeyReleased
        if (jtProduto.getSelectedRow() != -1) {
            txtProdutoCodigo.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 0).toString());
            txtProdutoDescricao.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 1).toString());
            txtProdutoQuantidade.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 2).toString());
            txtProdutoValor.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 3).toString());
          //  cbxProdutoCategoria.addItem(jtProduto.getValueAt(jtProduto.getSelectedRow(), 5).toString());
          //  cbxProdutoCategoria.getSelectedIndex()-1);

        }
    }//GEN-LAST:event_jtProdutoKeyReleased

    private void jtProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtProdutoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtProdutoKeyPressed

    private void jtProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtProdutoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtProdutoKeyTyped

    private void jtProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProdutoMouseClicked
        if (jtProduto.getSelectedRow() != -1) {
           
            txtProdutoCodigo.setText(jtProduto.getValueAt(
                    jtProduto.getSelectedRow(), 0).toString());
            
            txtProdutoDescricao.setText(jtProduto.getValueAt(
                    jtProduto.getSelectedRow(), 1).toString());
            
            txtProdutoQuantidade.setText(jtProduto.getValueAt(
                    jtProduto.getSelectedRow(), 2).toString());
            
            txtProdutoValor.setText(jtProduto.getValueAt(
                    jtProduto.getSelectedRow(), 3).toString());
  
         //   cbxProdutoCategoria.addItem(jtProduto.getValueAt(
           //         jtProduto.getSelectedRow(), 5).toString());

        }
    }//GEN-LAST:event_jtProdutoMouseClicked

    private void jmnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnSairActionPerformed

        this.dispose(); // fecha esta tela

    }//GEN-LAST:event_jmnSairActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose(); // fecha esta tela
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtProdutoQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoQuantidadeActionPerformed

    private void txtProdutoValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoValorActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProdutoAdicionar;
    private javax.swing.JButton btnProdutoAlterar;
    private javax.swing.JButton btnProdutoExcluir;
    private javax.swing.JButton btnProdutoPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxProdutoCategoria;
    private javax.swing.JComboBox<String> cbxProdutoMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem jmnSair;
    private javax.swing.JTable jtProduto;
    private javax.swing.JTextField txtProdutoCodigo;
    private javax.swing.JTextField txtProdutoDescricao;
    private javax.swing.JTextField txtProdutoPesquisar;
    private javax.swing.JTextField txtProdutoQuantidade;
    private javax.swing.JTextField txtProdutoValor;
    // End of variables declaration//GEN-END:variables
}
