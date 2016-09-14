/*
    CLasse baralho:
        *Objeto Dado;
    Metodos
        *embaralhar: gera um numero aleatorio para criação da carta
        *getCarta: cria cartas e adiciona ao objeto dado
        *toString: imprime todo o vetor de Baralho
        *getDado: entrega o objeto dado da classe
 */
package poker.componentes;

public class Baralho {

    private int i;
    private StringBuilder saida;

    public Baralho(Dado dado) {
        this.saida = new StringBuilder();
        for (i = 0; i < 48;) {
            this.getCarta(dado);
        }
    }

    public int embaralhar(int Limite) {
        int gerador;
        do {
            gerador = (int) (Math.random() * Limite);
        } while (!(gerador >= 0 && gerador <= Limite));
        return gerador;

    }

    private int getCarta(Dado dado) {
        Carta carta = new Carta(embaralhar(11), embaralhar(3), dado);
        if (dado.testaCartaDiferente(carta)) { //adiciona carta ao baralho
            dado.setBaralho(carta, dado.getTamanhoRealBaralho());
            dado.setTamanhoRealBaralho(dado.getTamanhoRealBaralho() + 1);
            saida.append(i + 1).append(": ").append(carta.toString(dado)).append("\n");
            this.i++;
        }
        return this.i;
    }

    public Dado getDado(Dado dado) {
        return dado;
    }

    @Override
    public String toString() {
        return this.saida.toString();
    }
}
