//Dupla: Heloísa e José

import java.util.Vector;
import javax.swing.JOptionPane;

public class Compra extends javax.swing.JPanel {

    private Produto produtoSelecionado, produtoEstoque;
    private Vector<Produto> auxProduto;
    private ModeloTabelaCompra carrinhoCompra;
    private int quantidade;
    private double precoTotal = 0.0, precoParcial = 0.0;

    public Compra() {
        initComponents();
        componentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_cod = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jL_nome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jL_quant = new javax.swing.JLabel();
        jL_preco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCompra = new javax.swing.JTable();
        jB_finalizar = new javax.swing.JButton();
        jB_remover = new javax.swing.JButton();
        jB_estoque = new javax.swing.JButton();
        jB_addProd = new javax.swing.JButton();
        jL_valorTotal = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JLabel();
        txtQuant = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        jL_cod.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jL_cod.setText("Código:");

        txtCod.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodKeyTyped(evt);
            }
        });

        jL_nome.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jL_nome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNome.setEnabled(false);

        jL_quant.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jL_quant.setText("Quantidade:");

        jL_preco.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jL_preco.setText("Preço parcial:");

        txtPreco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPreco.setEnabled(false);

        tabelaCompra.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tabelaCompra.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome:", "Quantidade:", "Preço unitário:", "Preço parcial:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaCompra);
        if (tabelaCompra.getColumnModel().getColumnCount() > 0) {
            tabelaCompra.getColumnModel().getColumn(0).setResizable(false);
            tabelaCompra.getColumnModel().getColumn(1).setResizable(false);
            tabelaCompra.getColumnModel().getColumn(2).setResizable(false);
            tabelaCompra.getColumnModel().getColumn(3).setResizable(false);
        }

        jB_finalizar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jB_finalizar.setText("Finalizar");
        jB_finalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_finalizarMouseClicked(evt);
            }
        });

        jB_remover.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jB_remover.setText("Remover");
        jB_remover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_removerMouseClicked(evt);
            }
        });

        jB_estoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jB_estoque.setText("Visualizar estoque");
        jB_estoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_estoqueMouseClicked(evt);
            }
        });

        jB_addProd.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jB_addProd.setText("Adicionar");
        jB_addProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_addProdMouseClicked(evt);
            }
        });

        jL_valorTotal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jL_valorTotal.setText("Valor total:");

        txtValorTotal.setBackground(new java.awt.Color(102, 102, 255));
        txtValorTotal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtValorTotal.setText("R$0,00");

        txtQuant.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtQuant.setText("1");
        txtQuant.setEnabled(false);
        txtQuant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jL_cod)
                        .addComponent(jL_nome)
                        .addComponent(jL_quant)
                        .addComponent(jL_preco)
                        .addComponent(txtCod, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(txtNome)
                        .addComponent(txtPreco))
                    .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_addProd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jB_estoque, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jL_valorTotal)
                    .addComponent(jB_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jB_estoque)
                        .addGap(315, 315, 315)
                        .addComponent(jL_valorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jB_finalizar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jL_cod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jL_nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jL_quant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jL_preco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jB_addProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_remover)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void componentes() {
        this.carrinhoCompra = new ModeloTabelaCompra(this);
        //Estabelece a conexão de dados entre a clase Asbstract e a "tabelaCompra"".
        tabelaCompra.setModel(carrinhoCompra);
    }

    private void txtCodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyTyped
        //Verifica se a tecla pressionada foi a "Enter".
        if (evt.getKeyChar() == '\n') {
            //Verifica se algum dado foi inserido no campo texto.
            if (!txtCod.getText().isEmpty()) {
                try {
                    int codigo = Integer.parseInt(txtCod.getText());

                    //Realiza a consulta por meio do código.
                    produtoSelecionado = ManipularDados.consultarProduto(codigo);

                    //Verifica se há um produto correspondente ao código informado.
                    if (produtoSelecionado != null) {
                        //Exibe os dados do produto.
                        txtNome.setText(produtoSelecionado.getNome());
                        txtPreco.setText(String.valueOf(produtoSelecionado.getPreco()));

                        //Permite alterar a quantidade e define o valor padrão.
                        txtQuant.setEnabled(true);
                        quantidade = 1;
                    } else {
                        JOptionPane.showMessageDialog(null, "Produto não cadastrado.", "ERRO", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "O cógido deve ser um valor numérico!", "ERRO", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_txtCodKeyTyped

    //Altera a quantidade e calcula o preço parcial.
    //KeyReleased é um evento que é acionado antes mesmo da informação ser inserida.
    private void txtQuantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantKeyReleased
        //Verifica se a caixa "Quantidade" está vazia.
        if (!txtQuant.getText().isEmpty()) {
            try {
                quantidade = Integer.parseInt(txtQuant.getText());

                double txtPrecoParcial = produtoSelecionado.getPreco() * quantidade;

                //Exibição com restrição do número de casas decimais.
                txtPreco.setText(String.format("%.2f", txtPrecoParcial));
            } catch (NumberFormatException ex) {
                txtPreco.setText("N/A");
            }
        } else {
            txtPreco.setText("N/A");
        }
    }//GEN-LAST:event_txtQuantKeyReleased

    //Método para adicionar produtos na "tabelaCompra".
    private void jB_addProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_addProdMouseClicked
        //Verifica se o produto existe e se o preço foi definido.
        if (produtoSelecionado != null && (!txtPreco.getText().equals("N/A")) && quantidade > 0) {
            //Verifica se há em estoque a quantidade desejada.
            if (quantidade <= produtoSelecionado.getQuantidade()) {
                Produto produtoVendido = new Produto(produtoSelecionado.getCodigo(), produtoSelecionado.getNome(), quantidade, produtoSelecionado.getPreco());

                //Limpeza de dados possibilitando a adição de um novo produto.
                txtCod.setText("");
                txtNome.setText("");
                txtQuant.setText("1");
                txtQuant.setEnabled(false);
                txtPreco.setText("");
                produtoSelecionado = null;

                //Adiciona o produto vendido na tabela.
                this.carrinhoCompra.addNovoProduto(produtoVendido);
                tabelaCompra.updateUI();

                //Atualiza o valor total.
                precoParcial = produtoVendido.getPreco() * quantidade;
                txtValorTotal.setText(String.format("%.2f", precoTotal += precoParcial));
                precoParcial = 0.0;
            } else {
                JOptionPane.showMessageDialog(null, "Não há quantidade suficiente em estoque.", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "A quantidade deve ser um valor numérico maior que zero!", "ERRO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jB_addProdMouseClicked

    //Método para remover produtos da "tabelaCompra".
    private void jB_removerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_removerMouseClicked
        int linha = tabelaCompra.getSelectedRow();
        //Verifica se uma linha válida foi selecionada.
        if (linha > -1) {
            int opcao = JOptionPane.showConfirmDialog(null, "Você realmente deseja remover o produto selecionado?", "Remoção de produto", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (opcao == JOptionPane.YES_OPTION) {
                //Solicita a senha.
                String senha = JOptionPane.showInputDialog(null, "Então, por gentileza, insira a senha do gerente: ", "Autorização", JOptionPane.INFORMATION_MESSAGE);

                //Verifica se a senha está correta.
                if (senha.equals("ifmg")) {
                    carrinhoCompra.removeProduto(linha);
                    atualizaPrecoParcial_Total();
                } else {
                    JOptionPane.showMessageDialog(null, "Senha incorreta!", "Autorização", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum produto foi selecionado.", "ERRO", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jB_removerMouseClicked

    //Método que, considerando o produto escolhido, verifica se há estoque suficiente para realizar a compra.
    private boolean verificaQuantidade() {
        auxProduto = carrinhoCompra.getCarrinhoCompra();

        for (int aux = 0; aux < auxProduto.size(); aux++) {
            produtoEstoque = ManipularDados.consultarProduto(auxProduto.get(aux).getCodigo());

            if (auxProduto.get(aux).getQuantidade() > produtoEstoque.getQuantidade()) {
                JOptionPane.showMessageDialog(null, "A quantidade do produto " + ("'") + produtoEstoque.getNome() + ("'") + " não é suficiente para realizar a venda.", "ERRO", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }

        return true;
    }

    //Método que finaliza a compra.
    private void jB_finalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_finalizarMouseClicked

        if (verificaQuantidade()) {
            auxProduto = carrinhoCompra.getCarrinhoCompra();

            //Atualiza quantidade em estoque.
            for (int aux = 0; aux < auxProduto.size(); aux++) {
                produtoEstoque = ManipularDados.consultarProduto(auxProduto.get(aux).getCodigo());

                produtoEstoque.setQuantidade(produtoEstoque.getQuantidade() - auxProduto.get(aux).getQuantidade());
            }

            //Zera o valor total.
            precoTotal = 0.0;
            txtValorTotal.setText("R$0.0");

            //Remove os produto do carrinho de compra.
            carrinhoCompra.limparCarrinho();
            tabelaCompra.updateUI();
        }
    }//GEN-LAST:event_jB_finalizarMouseClicked

    //Exibe a tela do estoque.
    private void jB_estoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_estoqueMouseClicked
        Principal.exibirPainel("estoque");
    }//GEN-LAST:event_jB_estoqueMouseClicked

    //A partir da nova quantidade, atualiza o preço parcial e o total.
    public void atualizaPrecoParcial_Total() {
        tabelaCompra.updateUI();

        precoTotal = carrinhoCompra.atualizaPrecoTotal();

        txtValorTotal.setText(String.format("%.2f", precoTotal));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_addProd;
    private javax.swing.JButton jB_estoque;
    private javax.swing.JButton jB_finalizar;
    private javax.swing.JButton jB_remover;
    private javax.swing.JLabel jL_cod;
    private javax.swing.JLabel jL_nome;
    private javax.swing.JLabel jL_preco;
    private javax.swing.JLabel jL_quant;
    private javax.swing.JLabel jL_valorTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaCompra;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuant;
    private javax.swing.JLabel txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
