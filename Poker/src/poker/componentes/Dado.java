/*
    Esta classe é responsável por todo o fluxo de dados do jogo
    *cada mão contem 8 cartas
    *duas mãos
    *Constates
 */
package poker.componentes;

public class Dado {

    private static String[] VALORES;
    private static String[] NAIPES;
    private static Carta[] baralho;
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

    public boolean testaCartaDiferente(Carta carta) {
        for (int i = 0; i <= this.tamanhorealbaralho; i++) {
            if (carta.equals(this.baralho[i])) {
                //System.out.println("you shall not pass: " + carta.toString(this));
                return false;
            }
        }
        return true;
    }
}
