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
    private Dado dado, dadoBaralho;

    public Carta() {
    }

    public Carta(int valor, int naipe) {
        if (this.cartaPossivel(valor, naipe)) {
            this.valor = valor;
            this.naipe = naipe;
            this.dado = new Dado();
            this.dadoBaralho = new Dado(1);

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

}
