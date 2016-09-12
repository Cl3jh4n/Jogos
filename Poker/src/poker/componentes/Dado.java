/*
    Esta classe é responsável por todo o fluxo de dados do jogo
    *cada mão contem 8 cartas
    *duas mãos
    *Constates
 */
package poker.componentes;

public class Dado {

    private String[] VALORES;
    private String[] NAIPES;
    private Carta[] baralho;
    private Carta[] mao;
    private Mao[] maos;
    private int tamanhorealbaralho;

    Dado() {
        VALORES = new String[12];
        VALORES[0] = "2";
        VALORES[1] = "3";
        VALORES[2] = "4";
        VALORES[3] = "5";
        VALORES[4] = "6";
        VALORES[5] = "7";
        VALORES[6] = "8";
        VALORES[7] = "9";
        VALORES[8] = "J";
        VALORES[9] = "Q";
        VALORES[10] = "K";
        VALORES[11] = "A";

        NAIPES = new String[4];
        NAIPES[0] = "Espadas";
        NAIPES[1] = "Paus";
        NAIPES[2] = "Copas";
        NAIPES[3] = "Ouro";

        baralho = new Carta[48];
        mao = new Carta[8];
        maos = new Mao[2];
        tamanhorealbaralho = 0;
    }

    public String getNaipe(int i) {
        return this.NAIPES[i];
    }

    public String getValor(int i) {
        return this.VALORES[i];
    }

    public void setBaralho(Carta c, int posicao) {
        this.baralho[posicao] = c;
    }

    public Carta getBaralho(int posicao) {
        return this.baralho[posicao];
    }


    public void setTamanhoRealBaralho(int tamanhorealbaralho) {
        this.tamanhorealbaralho = tamanhorealbaralho;
    }

    public int getTamanhoRealBaralho() {
        return this.tamanhorealbaralho;
    }

    public void setMao(Carta c, int posicao) {
        this.mao[posicao] = c;
    }

    public Carta getMao(int posicao) {
        return this.mao[posicao];
    }

    public void setMaos(Mao mao, int posicao) {
        this.maos[posicao] = mao;
    }

    public Mao getMaos(int posicao) {
        return this.maos[posicao];
    }

}
