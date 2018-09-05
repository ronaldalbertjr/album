package controle;

import dominio.Album;
import dominio.Editora;

public class Principal
{
    public static void main(String[] args)
    {
        int tamanhoDoAlbum = 200;
        int figurinhasPorPacotinho = 3;
        int pacotinhosUsados = 0;
        Album album1 = new Album(tamanhoDoAlbum);
        Editora editora = new Editora(figurinhasPorPacotinho, tamanhoDoAlbum);

        while (!album1.isCheio())
        {
            int[] figurinhasAdicionadas = editora.adquirirPacotinhoAleatorio();
            album1.receberFigurinha(figurinhasAdicionadas);
            pacotinhosUsados++;
        }
        System.out.println("O Album 1 foi preenchido");
        System.out.println("Foram comprados " + pacotinhosUsados + " pacotinhos para preencher o album 1");
        System.out.println("Foram compradas " + pacotinhosUsados * 3 + " pacotinhos para preencher o album 1");


        int nPacotinhos = 0;
        int nRepeticoes = 1000;
        for(int i = 0; i < nRepeticoes; i++) {
            Album album2 = new Album(tamanhoDoAlbum);
            while (!album2.isCheio())
            {
                int[] figurinhasAdicionadas = editora.adquirirPacotinhoAleatorio();
                album2.receberFigurinha(figurinhasAdicionadas);
                nPacotinhos++;
            }
        }
        double mediaPacotes = (double) nPacotinhos/nRepeticoes;
        double mediaFigurinhas = (double) (nPacotinhos * figurinhasPorPacotinho)/nRepeticoes;
        System.out.println(String.format("O número médio de pacotes comprados foi %.1f", mediaPacotes));
        System.out.println(String.format("O número médio de figurinhas compradas foi %.1f", mediaFigurinhas));
    }
}
