/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerProdutos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelProdutos;
import util.Formatador;

/**
 *
 * @author Mr-Robot
 */
public class ViewProduto extends javax.swing.JFrame {
    //import javax.swing.RowFilter
    /**
     * Instanciando uma lista de produto ou criando
     * instanciando conntroller produto
     * Instanciando modelo produto
     * instanciando o metodo converte a virgula de uma string para ponto
     */
    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    Formatador formatador = new Formatador();
    
    //variaveis
    String salvarAlterar;
    
    /**
     * Creates new form ViewProduto
     */
    public ViewProduto() {
        initComponents();
        
        //chamando o metodo preencher tabela
        carregarProdutos();
        
        //centralizando tela no centro
        setLocationRelativeTo(null);
        
        //chamando o metodo do campos como false
        this.carregarProdutos();
        this.habilitarDesabilitarCampo(false);
        this.limparCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelProduto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_proCod = new javax.swing.JTextField();
        txt_proNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_produtos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txt_proPesquisa = new javax.swing.JTextField();
        btn_pesquisa = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        btn_salva = new javax.swing.JButton();
        btn_edita = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        txt_proEstoque = new javax.swing.JFormattedTextField();
        txt_proValor = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto e Consultas");
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        jPanelProduto.setBackground(new java.awt.Color(0, 204, 255));
        jPanelProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        txt_proCod.setEditable(false);
        txt_proCod.setForeground(new java.awt.Color(0, 0, 0));
        txt_proCod.setEnabled(false);

        txt_proNome.setEnabled(false);

        jLabel3.setText("Estoque:");

        jLabel4.setText("Valor:");

        tb_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade", "Valor(R$)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_produtos);
        if (tb_produtos.getColumnModel().getColumnCount() > 0) {
            tb_produtos.getColumnModel().getColumn(1).setMinWidth(300);
            tb_produtos.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        jLabel5.setText("Pesquisa:");

        btn_pesquisa.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btn_pesquisa.setText("Pesquisar");
        btn_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisaActionPerformed(evt);
            }
        });

        btn_novo.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.setActionCommand("");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_salva.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btn_salva.setText("Salva");
        btn_salva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvaActionPerformed(evt);
            }
        });

        btn_edita.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btn_edita.setText("Altera");
        btn_edita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editaActionPerformed(evt);
            }
        });

        btn_excluir.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btn_excluir.setText("Apagar");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btn_cancelar.setText("Para");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        txt_proEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txt_proEstoque.setEnabled(false);

        txt_proValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txt_proValor.setEnabled(false);

        javax.swing.GroupLayout jPanelProdutoLayout = new javax.swing.GroupLayout(jPanelProduto);
        jPanelProduto.setLayout(jPanelProdutoLayout);
        jPanelProdutoLayout.setHorizontalGroup(
            jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProdutoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanelProdutoLayout.createSequentialGroup()
                        .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProdutoLayout.createSequentialGroup()
                                .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(txt_proCod, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_proEstoque))
                                .addGap(71, 71, 71)
                                .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_proNome, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_proValor, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5)
                            .addGroup(jPanelProdutoLayout.createSequentialGroup()
                                .addComponent(txt_proPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_pesquisa)))
                        .addContainerGap(128, Short.MAX_VALUE))
                    .addGroup(jPanelProdutoLayout.createSequentialGroup()
                        .addComponent(btn_novo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_salva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_edita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar)
                        .addGap(28, 28, 28))))
        );
        jPanelProdutoLayout.setVerticalGroup(
            jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_proCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_proNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProdutoLayout.createSequentialGroup()
                        .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_proEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_proValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(1, 1, 1)
                        .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_proPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_pesquisa))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_excluir)
                        .addComponent(btn_edita)
                        .addComponent(btn_salva)
                        .addComponent(btn_novo)))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Produtos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        this.habilitarDesabilitarCampo(true);
        this.limparCampos();
        salvarAlterar = "salvar";
        
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_salvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvaActionPerformed
        if(salvarAlterar.equals(("salvar"))){
            this.salvarProduto();
        }else if(salvarAlterar.equals("alterar")){
            this.alterarProduto();
        }
    }//GEN-LAST:event_btn_salvaActionPerformed

    private void btn_editaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editaActionPerformed
        salvarAlterar = "alterar";
        int linha = this.tb_produtos.getSelectedRow();
        try {
            int codigoProduto = (int) this.tb_produtos.getValueAt(linha, 0);
            //Recuperar dados do banco
            modelProdutos = controllerProdutos.retornarProdutoController(codigoProduto);
            //Setar na interface
            this.txt_proCod.setText(String.valueOf(modelProdutos.getIdProduto()));
            this.txt_proNome.setText(modelProdutos.getProNome());
            this.txt_proEstoque.setText(String.valueOf(modelProdutos.getProEstoque()));
            this.txt_proValor.setText(String.valueOf(modelProdutos.getProValor()));
            
            this.habilitarDesabilitarCampo(true);
            this.limparCampos();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Código inválido ou nenhum registro selecionado.", "AVISO!", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_editaActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        //EXCLUIR PRODUTO NO BANCO
        //selecionar a linha
        int linha = tb_produtos.getSelectedRow();
        //pegando o codigo da coluna da linha selecionada
        int codigoProduto = (int) tb_produtos.getValueAt(linha, 0);
        
        if(controllerProdutos.excluirProdutoController(codigoProduto)){
           JOptionPane.showMessageDialog(rootPane, "Produto excluído com sucesso!", "ATENÇÃO!", JOptionPane.WARNING_MESSAGE);
            this.carregarProdutos();
            this.habilitarDesabilitarCampo(false);
            this.limparCampos();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Erro ao excluir produto!", "ERRO:", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.habilitarDesabilitarCampo(false);
        this.limparCampos();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisaActionPerformed
        // PESQUISANDO NO BANCO
        DefaultTableModel modelo = (DefaultTableModel) this.tb_produtos.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.tb_produtos.setRowSorter(classificador);
        String texto = txt_proPesquisa.getText();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
        //this.limparCampos();
        
    }//GEN-LAST:event_btn_pesquisaActionPerformed
   
     // SALVAR PRODUTO NO BANCO
    private void salvarProduto(){
        modelProdutos.setProNome(this.txt_proNome.getText());
        modelProdutos.setProEstoque(Integer.parseInt(this.txt_proEstoque.getText()));
        //pegando os dados e convetendo virgula para ponto
        modelProdutos.setProValor(formatador.converterVirgulaParaPonto(this.txt_proValor.getText()));
        
        //comparação
        if(controllerProdutos.salvarProdutoController(modelProdutos) > 0){
            JOptionPane.showMessageDialog(rootPane, "Produto cadastrado com sucesso!", "ATENÇÃO!", JOptionPane.WARNING_MESSAGE);
            //JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar produto!", "ERRO:\n", JOptionPane.ERROR_MESSAGE);
            this.carregarProdutos();
            this.habilitarDesabilitarCampo(false);
            this.limparCampos();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar produto!", "ERRO:", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //ALTERAR PRODUTO NO BANCO
    private void alterarProduto(){
        modelProdutos.setProNome(this.txt_proNome.getText());
        modelProdutos.setProEstoque(Integer.parseInt(this.txt_proEstoque.getText()));
        modelProdutos.setProValor(formatador.converterVirgulaParaPonto(this.txt_proValor.getText()));
        
        //comparação
        if(controllerProdutos.alterarProdutoController(modelProdutos)){
            JOptionPane.showMessageDialog(rootPane, "Produto alterado com sucesso!", "ATENÇÃO!", JOptionPane.WARNING_MESSAGE);
            //JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar produto!", "ERRO:\n", JOptionPane.ERROR_MESSAGE);
            this.carregarProdutos();
            this.habilitarDesabilitarCampo(false);
            this.limparCampos();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Erro ao alterar produto!", "ERRO:", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    /**
     * Limpar os campos do formulário
     */
    private void limparCampos(){
        txt_proCod.setText("");
        txt_proNome.setText("");
        txt_proEstoque.setText("");
        txt_proValor.setText("");
    }
    /**
     * Habilitando e Desabilitando campos depedendo da condição(true) ou (false)
     * @param condicao 
     */
    private void habilitarDesabilitarCampo(boolean condicao){
        txt_proNome.setEnabled(condicao);
        txt_proEstoque.setEnabled(condicao);
        txt_proValor.setEnabled(condicao);
        btn_salva.setEnabled(condicao);
        //btn_edita.setEnabled(condicao);
        btn_excluir.setEnabled(condicao);
        btn_cancelar.setEnabled(condicao);
    }
    /**
     * Preenche a tabela de produtos com os produtos cadastro no banco
     */
    private void carregarProdutos(){
        listaModelProdutos = controllerProdutos.retornarListaProdutosDAO();
        //Usando o modelo padrão de tabela
        DefaultTableModel modelo = (DefaultTableModel)tb_produtos.getModel();
        //zerando linha 0 e setando os dados
        modelo.setNumRows(0);
        //inserir produtos na tabela
        int cont = listaModelProdutos.size();
        //contador de tamanho da lista
        for (int i = 0; i < cont; i++) {
            //preenchendo col. e linha.
            modelo.addRow(new Object[]{
                listaModelProdutos.get(i).getIdProduto(),
                listaModelProdutos.get(i).getProNome(),
                listaModelProdutos.get(i).getProEstoque(),
                listaModelProdutos.get(i).getProValor()
            });
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
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_edita;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_pesquisa;
    private javax.swing.JButton btn_salva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_produtos;
    private javax.swing.JTextField txt_proCod;
    private javax.swing.JFormattedTextField txt_proEstoque;
    private javax.swing.JTextField txt_proNome;
    private javax.swing.JTextField txt_proPesquisa;
    private javax.swing.JFormattedTextField txt_proValor;
    // End of variables declaration//GEN-END:variables
}
