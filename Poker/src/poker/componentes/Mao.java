/*
    Construtor da mao
    Metodos
        *darCarta pega um carta aleatoria dentro do baralho e adiciona à mao
        *toString imprime as cartas do baralho
 */
package poker.componentes;

public class Mao {

    private StringBuilder saida;
    private Carta precisa;
    private int i;

    public Mao(Baralho baralho, Dado dado) {
        this.saida = new StringBuilder();
        for (this.i = 0; i < 8; i++) {
            darCarta(i, baralho, dado);
        }
    }

    private void darCarta(int i, Baralho baralho, Dado dado) {
        int a = baralho.embaralhar(48);
        if (dado.getBaralho(a) != null) {   //se tiver null no array baralho é porque a carta ja foi selecionada
            dado.setMao(dado.getBaralho(a), i);
            dado.setBaralho(null, i);
            precisa = dado.getMao(i);
            this.saida.append(precisa.toString(dado)).append("\n");
        }
    }

    @Override
    public String toString() {
        return this.saida.toString();
    }
}
