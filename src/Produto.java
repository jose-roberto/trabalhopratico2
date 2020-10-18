//Dupla: Heloísa e José

public class Produto implements Comparable<Produto> {

    private Integer codigo;
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(int codigo, String nome, int quantidade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString() {
        return this.codigo + ";" + this.nome + ";" + this.preco + ";" + this.quantidade;
    }

    //Comparação entre o nome do produto selecionado com nome do produto que é enviado como parâmetro.
    public int compareTo(Produto o) {
        return this.nome.toLowerCase().compareTo(o.getNome().toLowerCase());
    }
}
