/*
    Construtor do Objeto Carta Possui:
        *Um Valor
        *Um Naipe
    Metodos:
        *cartaPossivel-testa se é possivel criar uma carta;
        *getValor
        *getNaipe
        *toString
        *testaCartaDiferente
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
    }

    private boolean cartaPossivel(int valor, int naipe) {   
        return (valor >= 0 && valor <= 11 && naipe >= 0 && naipe <= 3);
    }

    public int getNaipe() {
        return this.naipe;
    }

    public int getValor() {
        return this.valor;
    }

    @Override
    public String toString() {
        return dado.getValor(this.valor) + " de " + dado.getNaipe(this.naipe);
    }

    public boolean testaCartaDiferente(Carta carta) {
        boolean testeCartaDiferente = true;
        for (int i = 0; i == dado.getTamanhoRealBaralho(); i++) {
            Carta cartaArray = dado.getBaralho(i);
            if (carta.getNaipe() == cartaArray.getNaipe()
                    && carta.getValor() == cartaArray.getValor()) { //verifica igualdade
                testeCartaDiferente = false;
                System.out.println("you shall not pass " + carta.toString());
                break;
            }
        }
        return testeCartaDiferente;
    }


}