/*
    CLasse baralho:
        *Objeto Dado;
    Metodos
        *embaralhar: gera um numero aleatorio para criação da carta
        *getCarta: cria cartas e adiciona ao objeto dado
        *toString imprime todo o vetor de Baralho
 */
package poker.componentes;

public class Baralho {

    private Dado dado;
    private int i;

    public Baralho() {
        dado = new Dado(1);
        for (i = 0; i < 48;) {
            this.getCarta();
        }
    }

    /*metodo embaralhar usando random 
    para criar a carta já embaralhada.*/
    public int embaralhar(int Limite) {
        int gerador;
        do {
            gerador = (int) (Math.random() * Limite);
            //System.out.println(gerador);
        } while (!(gerador >= 0 && gerador <= Limite));
        //System.out.println("Passou" + gerador);
        return gerador;

    }

    /*criar cartas utilizando embaralhar 
    e o construtor de cartas e ir adicionando ao vetor baralho*/
    public int getCarta() {
        Carta carta = new Carta(embaralhar(11), embaralhar(3));
        //System.out.println("Passou" + carta.toString());
        if (dado.testaCartaDiferente(carta)) { //adiciona carta ao baral
            dado.setBaralho(carta, dado.getTamanhoRealBaralho());
            dado.setTamanhoRealBaralho(dado.getTamanhoRealBaralho() + 1);
            //System.out.println("passou no teste");
            this.i++;
        }
        return this.i;
    }

    @Override //imprime o Baralho //arrumar isto
    public String toString() {
        String Saida = "";
        for (i = dado.getTamanhoRealBaralho(); i <= 0; i--) {
            Carta mostra = dado.getBaralho(i);
            Saida += (mostra.toString() + "\n");        //erro a ser descoberto
        }
        return Saida;
    }
}
