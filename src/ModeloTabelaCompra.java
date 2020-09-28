//Dupla: Heloísa e José

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaCompra extends AbstractTableModel {

    public String senha;
    private Compra painel;
    private Vector<Produto> carrinhoCompra;
    Produto auxProdutos;

    public ModeloTabelaCompra(Compra painel) {
        this.painel = painel;
        this.carrinhoCompra = new Vector<>();
    }

    public void addNovoProduto(Produto vendido) {
        this.carrinhoCompra.add(vendido);
    }

    public void removeProduto(int indice) {
        this.carrinhoCompra.remove(indice);
    }

    //Atualiza o preço total a partir da nova quantidade inserida.
    public double atualizaPrecoTotal() {
        double valorT = 0.0;

        for (Produto p : carrinhoCompra) {
            valorT += p.getQuantidade() * p.getPreco();
        }

        return valorT;
    }

    public void limparCarrinho() {
        this.carrinhoCompra.clear();
    }

    public Vector<Produto> getCarrinhoCompra() {
        return carrinhoCompra;
    }

    //Nomeia as colunas.
    public String getColumnName(int coluna) {
        switch (coluna) {
            case 0:
                return "Nome:";
            case 1:
                return "Quantidade:";
            case 2:
                return "Preço unitário:";
            case 3:
                return "Preço parcial:";
            default:
                return null;
        }
    }

    //Permite que as celúlas da segunda coluna sejam editáveis.
    public boolean isCellEditable(int linha, int coluna) {
        if (coluna == 1) {
            return true;
        }
        return false;
    }

    //Define a classe de cada coluna.
    public Class<?> getColumnClass(int coluna) {
        switch (coluna) {
            case 0:
                return String.class;
            case 1:
                return Integer.class;
            case 2:
                return Double.class;
            case 3:
                return Double.class;
            default:
                return null;
        }
    }

    //Valida a alteração de algum valor quando esse processo ocorre por meio da tabela.
    public void setValueAt(Object novoValor, int linha, int coluna) {
        if (coluna == 1) {
            senha = JOptionPane.showInputDialog(null, "Por favor, insira a senha do gerente:", "Autorização", JOptionPane.INFORMATION_MESSAGE);

            if (senha != null && senha.equals("ifmg")) {
                carrinhoCompra.get(linha).setQuantidade((int) novoValor);

                //Atualiza a tabela e o valor total.
                this.painel.atualizaPrecoParcial_Total();
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta!", "Autorização", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    //Métodos necessários devido à extensão AbstractTableModel:
    public int getRowCount() {
        return carrinhoCompra.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public Object getValueAt(int linha, int coluna) {
        auxProdutos = carrinhoCompra.get(linha);

        switch (coluna) {
            case 0:
                return auxProdutos.getNome();
            case 1:
                return auxProdutos.getQuantidade();
            case 2:
                return auxProdutos.getPreco();
            case 3:
                return auxProdutos.getQuantidade() * auxProdutos.getPreco();
            default:
                return null;
        }
    }
}
