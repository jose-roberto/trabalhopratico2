//Dupla: Heloísa e José

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Cadastro extends javax.swing.JPanel {

    private JDialog janela;
    private ModeloTabelaEstoque infoTabelaEstoque;

    public Cadastro(JDialog janela, ModeloTabelaEstoque infoTabelaEstoque) {
        initComponents();

        this.janela = janela;
        this.infoTabelaEstoque = infoTabelaEstoque;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_titulo = new javax.swing.JLabel();
        jL_nome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jL_quantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jL_preco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jB_salvar = new javax.swing.JButton();
        jB_cancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jL_titulo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jL_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_titulo.setText("Cadastrar novo produto");

        jL_nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jL_nome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jL_quantidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jL_quantidade.setText("Quantidade:");

        txtQuantidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jL_preco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jL_preco.setText("Preço:");

        txtPreco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jB_salvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jB_salvar.setText("Salvar");
        jB_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_salvarMouseClicked(evt);
            }
        });

        jB_cancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jB_cancelar.setText("Cancelar");
        jB_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_cancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jB_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jB_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jL_nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jL_quantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jL_preco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jL_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jL_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_nome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_quantidade)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_preco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_cancelar)
                    .addComponent(jB_salvar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jB_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_cancelarMouseClicked
            janela.setVisible(false);
    }//GEN-LAST:event_jB_cancelarMouseClicked

    private void jB_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_salvarMouseClicked
        if (!txtNome.getText().isEmpty() && !txtQuantidade.getText().isEmpty() && !txtPreco.getText().isEmpty()) {
            try {
                int codigo = ManipularDados.gerarCodigo();
                Produto produto = new Produto(codigo + 1, txtNome.getText(), Integer.parseInt(txtQuantidade.getText()), Double.parseDouble(txtPreco.getText()));
                
                //Adiciona um novo produto no estoque.
                ManipularDados.inserirProduto(produto);
                //Atualiza os dados na tabela do estoque.
                
                infoTabelaEstoque.atualizarTabelaEstoque("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Os campos de quantidade e preço devem ser preenchidos com valores numéricos.", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            }
            janela.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "É preciso preencher todos os campos.", "ERRO", JOptionPane.WARNING_MESSAGE);
        }

        janela.setVisible(false);
    }//GEN-LAST:event_jB_salvarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_cancelar;
    private javax.swing.JButton jB_salvar;
    private javax.swing.JLabel jL_nome;
    private javax.swing.JLabel jL_preco;
    private javax.swing.JLabel jL_quantidade;
    private javax.swing.JLabel jL_titulo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
