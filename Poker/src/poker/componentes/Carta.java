/*
    Construtor do Objeto Carta Possui:
        *Um Valor
        *Um Naipe
 */
package poker.componentes;

public class Carta {

    private int valor, naipe;
    private int[] cartas;
    private Dado dado;

    private Carta() {
        dado = new Dado();
    }

    private void Carta(int valor, int naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public Carta(String valor, String naipe) {
        this();
        Carta(Integer.parseInt(valor), Integer.parseInt(naipe));
    }

    public String toString(String aviso) {
        if ("".equals(aviso)) {
            aviso = dado.getValor(this.valor) + " de "
                    + dado.getNaipe(this.naipe);
        }
        return aviso;
    }

    public boolean testaCartaDiferente(Carta c) { //testa as cartas diferentes
        boolean teste = false;
        for (int i = 0; i <= dado.getTamanhoRealBaralho(); i++) {
            if (c != dado.getBaralho(i)) {
                teste = true;
            }
        }
        return teste;
    }
}
