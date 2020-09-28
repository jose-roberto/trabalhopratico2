//Dupla: Heloísa e José

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Principal extends javax.swing.JFrame {

    //Auxilia no processo de troca entre os painéis presentes.
    private static JPanel painelBase;

    //Gerencimaneto dos painéis.
    private static CardLayout painelTransicao;
    
    //Responsável pela barra de rolagem.
    private static JScrollPane barraRolagem;

    //Variável que armazenará o endereço do arquivo onde estão regitrados os produtos.
    private static String endereco;

    public Principal() {
        initComponents();
        componentes();
    }

    private void componentes() {
        //Defini a barra de rolagem no frame.
        barraRolagem = new JScrollPane();

        //Delimita o tamanho da barra de rolagem, respeitando o tamanho do frame.
        this.setLayout(new BorderLayout());
        //Adiciona a barra de rolagem.
        this.add(barraRolagem);

        //Determina o painel que é base para as informações que serão exibidas.
        painelTransicao = new CardLayout();
        painelBase = new JPanel(painelTransicao);

        //Estabelece que na área reservada a informações serão apresentadas pelo painel "painelBase".
        barraRolagem.setViewportView(painelBase);

        //Adiciona os outros dois painéis no painel base.
        //By: Nics.
        painelBase.add(new Compra(), "compra");
        painelBase.add(new Estoque(), "estoque");

        //Define o primeiro painel que será exibido.
        painelTransicao.show(painelBase, "compra");

        enderecoArquivo();
    }

    //Método utilizado no processo de troca entre os painéis existentes.
    public static void exibirPainel(String nome) {
        //Exibe o painel.
        painelTransicao.show(painelBase, nome);

        //Garante a permanência do tamanho dos painéis durante as transições.
        painelBase.setPreferredSize(painelBase.getPreferredSize());
    }

    //Obtém a localização do arquivo 'csv'.
    private static void enderecoArquivo() {
        endereco = JOptionPane.showInputDialog(null, "Por favor, insira a localização do arquivo '.csv': ", "Localização", JOptionPane.INFORMATION_MESSAGE);

        ManipularDados.criarArquivo(endereco);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento que faz a chamada ao método que finaliza as edições feitas por meio do programa.
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ManipularDados.atualizarArquivo();
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
