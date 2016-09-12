/*
    Construtor do Objeto Carta Possui:
        *Um Valor
        *Um Naipe
    ps:são armazenados como valores inteiros
 */
package poker.componentes;

public class Carta {

    private int valor, naipe;
    private String[] VALORES;
    private String[] NAIPES;

    private Carta() {
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

    }

    public void Carta(int valor, int naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public Carta(String valor, String naipe) {
        this();
        this.Carta(Integer.parseInt(valor), Integer.parseInt(naipe));
    }

    public int getNaipe() {
        return this.naipe;
    }

    public int getValor() {
        return this.valor;
    }

    public String toString(String aviso) {
        if ("".equals(aviso)) {
            aviso = VALORES[this.valor] + " de " + NAIPES[this.naipe];
        }
        return aviso;
    }
    
    //só falta a comparação
}
