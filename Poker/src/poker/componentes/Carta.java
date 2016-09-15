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

    public Carta() {
    }

    public Carta(int valor, int naipe, Dado dado) {
        if (this.cartaPossivel(valor, naipe)) {
            this.valor = valor;
            this.naipe = naipe;

        } /*else {
            System.out.println("Não é possivel criar carta, por favor,"
                    + " verificar valores");
        }*/
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
    public boolean equals(Object carta) {
        return (this.valor == ((Carta) carta).getValor())
                && (this.naipe == ((Carta) carta).getNaipe());
    }

    public String toString(Dado dado) {
        return dado.getValor(this.valor) + " de " + dado.getNaipe(this.naipe);
    }
}
