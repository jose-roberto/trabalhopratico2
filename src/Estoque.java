//Dupla: Heloísa e José

import java.awt.Dialog;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

//Dupla: Heloísa e José
public class Estoque extends javax.swing.JPanel {

    private ModeloTabelaEstoque estoque;
    private Produto auxProduto;

    public Estoque() {
        initComponents();
        componentes();
    }

    private void componentes() {
        this.estoque = new ModeloTabelaEstoque();

        //Estabelece a conexão de dados entre a classe asbstract e a lista de .
        tabelaEstoque.setModel(estoque);

        tabelaEstoque.updateUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEstoque = new javax.swing.JTable();
        jB_adicionarProd = new javax.swing.JButton();
        jB_excluirProd = new javax.swing.JButton();
        jL_titulo = new javax.swing.JLabel();
        txtNomeBusca = new javax.swing.JTextField();
        jL_busca = new javax.swing.JLabel();
        jB_busca = new javax.swing.JButton();
        jB_voltar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        tabelaEstoque.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tabelaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código:", "Nome:", "Quantidade:", "Preço unitário:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaEstoque);
        if (tabelaEstoque.getColumnModel().getColumnCount() > 0) {
            tabelaEstoque.getColumnModel().getColumn(0).setResizable(false);
            tabelaEstoque.getColumnModel().getColumn(1).setResizable(false);
            tabelaEstoque.getColumnModel().getColumn(2).setResizable(false);
            tabelaEstoque.getColumnModel().getColumn(3).setResizable(false);
        }

        jB_adicionarProd.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jB_adicionarProd.setText("Adicionar produto");
        jB_adicionarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_adicionarProdMouseClicked(evt);
            }
        });

        jB_excluirProd.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jB_excluirProd.setText("Excluir produto");
        jB_excluirProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_excluirProdMouseClicked(evt);
            }
        });

        jL_titulo.setBackground(new java.awt.Color(0, 0, 0));
        jL_titulo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jL_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_titulo.setText("Estoque");

        txtNomeBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeBuscaKeyReleased(evt);
            }
        });

        jL_busca.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jL_busca.setText("Busque pelo nome do produto:");

        jB_busca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jB_busca.setText("Buscar");

        jB_voltar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jB_voltar.setText("Voltar");
        jB_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_voltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jB_excluirProd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jB_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jB_adicionarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                            .addComponent(jL_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jL_busca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_busca, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_busca)
                    .addComponent(jB_busca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_adicionarProd)
                    .addComponent(jB_excluirProd)
                    .addComponent(jB_voltar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    //Retorna a tela de compra.
    private void jB_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_voltarMouseClicked
        Principal.exibirPainel(null, "compra");
    }//GEN-LAST:event_jB_voltarMouseClicked

    //Realiza uma busca dinâmica dentro da tabela.
    private void txtNomeBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeBuscaKeyReleased
        String resultadoBusca = txtNomeBusca.getText();

        estoque.atualizarTabelaEstoque(resultadoBusca);

        //Atualiza a tabela.
        tabelaEstoque.updateUI();
    }//GEN-LAST:event_txtNomeBuscaKeyReleased

    private void jB_excluirProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_excluirProdMouseClicked
        int linha = tabelaEstoque.getSelectedRow();

        if (linha > -1) {
            int opcao = JOptionPane.showConfirmDialog(null, "Você realmente deseja remover o produto selecionado?", "Remoção de produto", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (opcao == JOptionPane.YES_OPTION) {
                //Solicita a senha.
                String senha = JOptionPane.showInputDialog(null, "Então, por gentileza, insira a senha do gerente: ", "Autorização", JOptionPane.INFORMATION_MESSAGE);

                //Verifica se a senha está correta.
                if (senha.equals("ifmg")) {
                    estoque.removerProduto(linha);
                    tabelaEstoque.updateUI();
                } else {
                    JOptionPane.showMessageDialog(null, "Senha incorreta!", "Autorização", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum produto foi selecionado.", "ERRO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jB_excluirProdMouseClicked

    private void jB_adicionarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_adicionarProdMouseClicked
        JDialog cadastro = new JDialog();

        //Bloqueia outras ações durante o período em que a janela de cadastro estiver abertas
        cadastro.setModalityType(Dialog.ModalityType.TOOLKIT_MODAL);
        //Define o tamanho da janela.
        cadastro.setSize(415, 160);
        cadastro.setLocationRelativeTo(null);

        //Adiciona e exibe a janela.
        cadastro.add(new Cadastro(cadastro, estoque));
        cadastro.setVisible(true);
    }//GEN-LAST:event_jB_adicionarProdMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_adicionarProd;
    private javax.swing.JButton jB_busca;
    private javax.swing.JButton jB_excluirProd;
    private javax.swing.JButton jB_voltar;
    private javax.swing.JLabel jL_busca;
    private javax.swing.JLabel jL_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaEstoque;
    private javax.swing.JTextField txtNomeBusca;
    // End of variables declaration//GEN-END:variables
}
