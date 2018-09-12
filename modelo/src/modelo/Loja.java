package modelo;

public class Loja {

    private static final int MAX_ITEMS_ESTOQUE = 1000;

    private Transportador transportador;

    private Vendavel[] vitrine;

    private int contItemsNaVitrine;

    public Loja(Transportador transportador) {
        this.transportador = transportador;
        this.vitrine = new Livro[MAX_ITEMS_ESTOQUE];
        this.contItemsNaVitrine = 0;
    }

    public void adicionarItemAVitrine(Vendavel livro) {
        this.vitrine[this.contItemsNaVitrine++] = livro;
    }

    public void efetuarVenda(Vendavel livro,
                             String enderecoDeEntrega,
                             long numeroDoCartaoDeCredito) {
        descontarValorDoCartao(numeroDoCartaoDeCredito, livro.getPreco());
        emitirRecibo(livro.getDescricao(), livro.getPreco());
        transportador.transportar(livro, enderecoDeEntrega);
    }

    public String getVitrine() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < this.contItemsNaVitrine; i++) {
            Vendavel livro = this.vitrine[i];
            sb.append(livro.getDescricao())
                    .append(" -- preço: R$")
                    .append(livro.getPreco())
                    .append("\n");
        }
        return sb.toString();
    }

    private void emitirRecibo(String descricao, float preco) {
        System.out.printf("Emitindo recibo sobre %s no valor " +
                "de %.2f reais...\n", descricao, preco);
    }

    private void descontarValorDoCartao(
            long numeroDoCartao, float preco) {
        System.out.printf("Descontando %.2f reais do cartão %l...\n",
                preco, numeroDoCartao);
    }

    public Vendavel getItemVitrine(int posicao) {
        return this.vitrine[posicao];
    }
}