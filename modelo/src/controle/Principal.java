package controle;

import modelo.Caminhao;
import modelo.Livro;
import modelo.Loja;
import modelo.Pessoa;

public class Principal {

    public static void main(String[] args) {

        Caminhao meuCaminhao = new Caminhao("BMX20", 5215332);
        Pessoa escravo = new Pessoa("Bashar Al Zap", 1990);
        Loja minhaLoja = new Loja(meuCaminhao);
        Loja zara = new Loja(escravo);

        Pessoa autor = new Pessoa("Machado de Assis", 1880);

        for (int i = 1; i <= 10; i++) {
            Livro livro = new Livro(
                    String.format("Livro%d", i), autor);
            livro.setAnoPublicacao(1920 + i);
            minhaLoja.adicionarItemAVitrine(livro);
        }
        for (int i = 1; i <= 10; i++) {
            Caminhao caminhao = new Caminhao(
                    String.format("Caminhão%d", i), 643 * i);
            zara.adicionarItemAVitrine(caminhao);
        }

        System.out.println(minhaLoja.getVitrine());
    }
}