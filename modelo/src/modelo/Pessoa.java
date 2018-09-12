package modelo;

public class Pessoa implements Transportador
{
    private String nome;

    private long cpf;

    private final int anoNascimento;

    public Pessoa(String nome, int anoNascimento)
    {

        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public void transportar(Vendavel vendavel, String endereco)
    {
        System.out.printf("Entregando o livro %s " +
                        "no endereço %s...\n",
                vendavel.getDescricao(), endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

}
