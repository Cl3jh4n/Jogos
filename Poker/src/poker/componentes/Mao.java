/*
    Construtor da mao
    Metodos
        *darCarta pega um carta aleatoria dentro do baralho e adiciona à mao
        *toString imprime as cartas do baralho
 */
package poker.componentes;

public class Mao {

    private String saida;
    private Dado dado;
    private Carta precisa;
    private Baralho baralho;
    private int i;

    public Mao() {
        dado = new Dado(2);
        baralho = new Baralho();

        for (this.i = 0; i < 8; i++) {
            darCarta(i);
        }
    }

    private void darCarta(int i) {
        dado = baralho.getDado();
        dado.setMao(dado.getBaralho(baralho.embaralhar(48)), i);
        precisa = dado.getMao(i);
        this.saida +=(precisa.toString() + "\n");
    }

    @Override        
    public String toString(){
        return saida;
    }
}
