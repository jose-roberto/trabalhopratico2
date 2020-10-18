//Dupla: Heloísa e José

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.JOptionPane;

public class ManipularDados {

    private static Vector<Produto> produtos;
    private static File arquivo = new File("");
    private static String auxEndereco = "";

    public static void criarArquivo(String endereco) {
        auxEndereco = endereco;
    }

    //Faz a leitura dos dados e armazena-os no vetor "produtos".
    public static void carregarArquivo() {
        //Instacia o arquivo com a localização informada pelo usuário.
        arquivo = new File(auxEndereco);

        //Ajustes na criação do vetor.
        if (produtos == null) {
            produtos = new Vector<>();
        } else {
            produtos.clear();
        }

        try {
            //Define que o arquivo é um arquivo de leitura.
            FileReader leitura = new FileReader(arquivo);

            //Otimiza o processo de transposição dos dados.
            BufferedReader buffLeitura = new BufferedReader(leitura);

            //Processo de leitura:
            //Descarta o cabeçalho da tabela.
            buffLeitura.readLine();
            //Lê a primeira linha de dados.
            String linha = buffLeitura.readLine();

            //Linhas seguintes
            while (linha != null) {
                //Modelo das linhas: 78564213;Carne Churrasco;1.26;178
                //Transforma esse modelo em um Array.
                String dados[] = linha.split(";");

                //Conversão de dados:
                int codigo = Integer.parseInt(dados[0]);
                String nome = dados[1];
                double preco = Double.parseDouble(dados[2]);
                int quant = Integer.parseInt(dados[3]);

                //Adiciona os atributos ao vetor "produtos".
                produtos.add(new Produto(codigo, nome, quant, preco));

                //Lê a próxima linha.
                linha = buffLeitura.readLine();

            }

            //Fecha o arquivo liberando-o para outros processos.
            buffLeitura.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado.", "ERRO", JOptionPane.WARNING_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Arquivo corrompido.", "ERRO", JOptionPane.WARNING_MESSAGE);
        }
    }

    //Insere um novo produto cadastrado.
    public static void inserirProduto(Produto novoProduto) {
        produtos.add(novoProduto);
    }

    //Gera um código para o novo produto cadastrado.
    public static int gerarCodigo() {
        int codigo = 1;

        if (!produtos.isEmpty()) {
            codigo += produtos.lastElement().getCodigo();
        }

        return codigo;
    }

    public static Produto consultarProdutoCompra(int codigo) {
        //Retorna o produto correspondente ao código que foi informado.
        for (Produto aux : produtos) {
            if (aux.getCodigo() == codigo) {
                return aux;
            }
        }
        return null;
    }

    public static Vector<Produto> consultarProdutoEstoque(String nome) {
        Vector<Produto> auxProdutos = new Vector<>();

        //Se a String não estiver fazia, uma consulta específica será realizada.
        if (nome.isEmpty()) {
            return produtos;
        } else {
            for (int aux = 0; aux < produtos.size(); aux++) {
                //Transforma todas as letras inseridas em letras minúsculas para facilitar a comparação.
                if (produtos.get(aux).getNome().toLowerCase().startsWith(nome.toLowerCase())) {
                    //Existindo correspondência adiciona o produto no vetor.
                    auxProdutos.add(produtos.get(aux));
                }
            }
        }
        return auxProdutos;
    }

    //Determina que a exibição dos códigos será em ordem crescente.
    public static void ordemCrescente() {
        int cod[] = new int[produtos.size()];

        for (int aux = 0; aux < produtos.size(); aux++) {
            cod[aux] = produtos.get(aux).getCodigo();
        }

        Arrays.sort(cod);

        for (int aux = 0; aux < produtos.size(); aux++) {
            produtos.get(aux).setCodigo(cod[aux]);
        }

    }

    //Exclui um produto do arquivo.
    public static void deletarProduto(Produto p) {
        for (int aux = 0; aux < produtos.size(); aux++) {
            if (p.getCodigo() == produtos.get(aux).getCodigo()) {
                produtos.remove(aux);
            }
        }
    }

    //Edição de dados.
    public static void atualizarArquivo() {
        arquivo = new File(auxEndereco);

        try {
            //Define que o arquivo é um arquivo de alteração.
            FileWriter escrita = new FileWriter(arquivo);

            BufferedWriter buffEscrita = new BufferedWriter(escrita);

            //Mantém o cabeçalho.
            //By: Nics.
            escrita.write("codigo;produto;preco;quantidade;" + "\n");
            for (int aux = 0; aux < produtos.size(); aux++) {
                //Atualiza as informações de cada produto.
                buffEscrita.write(produtos.get(aux) + "\n");
            }

            //Garante que os dados vão ser realmente gravados no disco.
            buffEscrita.flush();
            //Fecha o arquivo liberando-o para outros processos.
            buffEscrita.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo corrompido!", "ERRO", JOptionPane.WARNING_MESSAGE);
        }
    }
}
