package modelo;

public class Caminhao implements Vendavel, Transportador
{

    private String nome;
    private int preco;

    public Caminhao(String nome, int preco)
    {
        this.nome = nome;
        this.preco = preco;
    }

    public void transportar(Vendavel vendavel,
                         String endereco) {
        System.out.printf("Entregando o livro %s " +
                        "no endereço %s...\n",
                vendavel.getDescricao(), endereco);
    }

    public String getDescricao() {
        return String.format("%s", this.nome);
    }

    public float getPreco() {
        return this.preco;
    }
}
