/*
    Construtor do Objeto Carta Possui:
        *Um Valor
        *Um Naipe
 */
package poker.componentes;

public class Carta {

    private int valor, naipe;
    private Dado dado;

    public Carta() {
    }

    public Carta(int valor, int naipe) {
        if (this.cartaPossivel(valor, naipe)) {
            this.valor = valor;
            this.naipe = naipe;
            this.dado = new Dado();
        } else {
            System.out.println("Não é possivel criar carta, por favor,"
                    + " verificar valores");
        }
        //System.out.println(valor + " " + naipe);
    }

    private boolean cartaPossivel(int valor, int naipe) {   //verifica se é possivel criar a carta
        return (valor >= 0 && valor <= 11 && naipe >= 0 && naipe <= 3);
    }

    public int getNaipe() {
        return this.naipe;
    }

    public int getValor() {
        return this.valor;
    }

    public String toString(String aviso) {
        if ("".equals(aviso)) {
            aviso = dado.getValor(this.valor) + " de "
                    + dado.getNaipe(this.naipe);
        }
        return aviso;
    }

    public boolean testaCartaDiferente(Carta carta) { //testa as cartas diferentes e  testa se é possivel criar
        boolean teste = false;
        if (cartaPossivel(carta.getNaipe(), carta.getValor())) {
            for (int i = 0; i < dado.getTamanhoRealBaralho(); i++) {
                Carta cartaArray = dado.getBaralho(i);
                if (carta.getNaipe() == cartaArray.getNaipe()
                        && carta.getValor() == cartaArray.getValor()) {     //verifica igualdade
                    teste = false;
                    System.out.println("you shall not pass " + carta.toString(""));
                }

            }
        } else {
            teste = false;
        }

        return teste;
    }

}
