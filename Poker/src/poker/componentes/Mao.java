/*
    Construtor da mao
    Metodos
        *darCarta pega um carta aleatoria dentro do baralho e adiciona à mao
        *toString imprime as cartas do baralho
 */
package poker.componentes;

import java.util.ArrayList;

public class Mao {

    private StringBuilder saida;
    private Carta precisa;
    private int i;
    public ArrayList<Carta> mao;

    public Mao(Baralho baralho, Dado dado) {
        mao = new ArrayList<Carta>();
        this.saida = new StringBuilder();
        for (this.i = 0; i < 8;) {
            i = darCarta(i, baralho, dado);
        }
        
    }

    private int darCarta(int i, Baralho baralho, Dado dado) {
        int aleatorio = baralho.embaralhar(48);
        if (dado.getBaralho(aleatorio) != null) {   //se tiver null no array baralho é porque a carta ja foi selecionada
            mao.add(this.precisa = dado.getBaralho(aleatorio));
            dado.setBaralho(null, i);
            this.saida.append(precisa.toString(dado)).append("\n");
            i++;
        }
        return i;
    }

    @Override
    public String toString() {
        return this.saida.toString();
    }
}
