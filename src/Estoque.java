//Dupla: Heloísa e José

import java.awt.BorderLayout;
import java.util.Vector;

public class Estoque extends javax.swing.JPanel {

    private ModeloTabelaEstoque estoque;
    private Vector<Produto> auxEstoque;

    public Estoque() {
        initComponents();
        componentes();
    }

    private void componentes() {
        this.estoque = new ModeloTabelaEstoque(this);
        //Estabelece a conexão de dados entre a classe asbstract e a carrinho.
        tabelaEstoque.setModel(estoque);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jB_voltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEstoque = new javax.swing.JTable();
        jB_exibir = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jB_voltar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jB_voltar.setText("Voltar");
        jB_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_voltarMouseClicked(evt);
            }
        });

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
                false, false, true, true
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

        jB_exibir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jB_exibir.setText("Exibir");
        jB_exibir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_exibirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 518, Short.MAX_VALUE)
                .addComponent(jB_exibir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(406, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_exibir)
                    .addComponent(jB_voltar))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(43, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Retorna a tela de compra.
    private void jB_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_voltarMouseClicked
        Principal.exibirPainel("compra");//GEN-LAST:event_jB_voltarMouseClicked
    }

    //Exibe todos os produtos na tabela.
    private void jB_exibirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_exibirMouseClicked
        auxEstoque = ManipularDados.preencherEstoque();
        for (int aux = 0; aux < auxEstoque.size(); aux++) {
            estoque.atualizarEstoque(auxEstoque.get(aux));
        }
        tabelaEstoque.updateUI();
    }//GEN-LAST:event_jB_exibirMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_exibir;
    private javax.swing.JButton jB_voltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaEstoque;
    // End of variables declaration//GEN-END:variables
}
