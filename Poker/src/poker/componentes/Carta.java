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

    public int getNaipe() {
        return this.naipe;
    }

    public int getValor() {
        return this.valor;
    }

    private void Carta(int valor, int naipe) {
        if (valor >= 0 && valor <= 12 && naipe >= 0 && naipe <= 3) {
            this.valor = valor;
            this.naipe = naipe;
            System.out.println(valor + " " + naipe);
        }
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

    public boolean testaCartaDiferente(Carta carta) { //testa as cartas diferentes
        boolean teste = true;
        int cartaNaipe = carta.getNaipe();
        int cartaValor = carta.getValor();

        for (int i = 0; i < dado.getTamanhoRealBaralho(); i++) {
            Carta c = dado.getBaralho(i);
            if (cartaNaipe == c.getNaipe() && cartaValor == c.getValor()) {
                teste = false;
                System.out.println("you shall not pass " + cartaNaipe);
            }

        }
        return teste;
    }
}
