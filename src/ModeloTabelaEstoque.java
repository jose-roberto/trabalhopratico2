//Dupla: Heloísa e José

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaEstoque extends AbstractTableModel {

    public String senha;
    private Estoque painel;
    private Vector<Produto> estoque;
    Produto auxProdutos;

    public ModeloTabelaEstoque(Estoque painel) {
        this.painel = painel;
        this.estoque = new Vector<>();
    }

    public void atualizarEstoque(Produto produto) {
        this.estoque.add(produto);
    }

    //Nomeia as colunas.
    public String getColumnName(int coluna) {
        switch (coluna) {
            case 0:
                return "Código:";
            case 1:
                return "Nome:";
            case 2:
                return "Quantidade:";
            case 3:
                return "Preço unitário:";
            default:
                return null;
        }
    }

    //Permite que as celúlas da segunda e da terceira coluna sejam editáveis.
    public boolean isCellEditable(int linha, int coluna) {
        if (coluna == 2 || coluna == 3) {
            return true;
        }
        return false;
    }

    //Valida a alteração de algum valor quando esse processo ocorre por meio da tabela.
    public void setValueAt(Object novoValor, int linha, int coluna) {
        senha = JOptionPane.showInputDialog(null, "Por favor, insira a senha do gerente:", "Autorização", JOptionPane.INFORMATION_MESSAGE);

        if (senha != null && senha.equals("ifmg")) {
            if (coluna == 2) {
                 estoque.get(linha).setQuantidade((int) novoValor);
            } else if (coluna == 3) {
                 estoque.get(linha).setPreco((double) novoValor);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Senha incorreta!", "Autorização", JOptionPane.WARNING_MESSAGE);
        }
    }

    public Class<?> getColumnClass(int coluna) {
        switch (coluna) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return Integer.class;
            case 3:
                return Double.class;
            default:
                return null;
        }
    }
    
  //Métodos necessários devido à extensão AbstractTableModel:
    public int getRowCount() {
        return estoque.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public Object getValueAt(int linha, int coluna) {
        auxProdutos = estoque.get(linha);

        switch (coluna) {
            case 0:
                return auxProdutos.getCodigo();
            case 1:
                return auxProdutos.getNome();
            case 2:
                return auxProdutos.getQuantidade();
            case 3:
                return auxProdutos.getPreco();
            default:
                return null;
        }
    }
}
