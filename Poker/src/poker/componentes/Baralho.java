/*
    Classe com metodos do baralho, contendo 48 cartas distintas
 */
package poker.componentes;

public class Baralho {

    private Dado dado;
    private int i;

    public Baralho() {
        dado = new Dado();
        for (i = 0; i < 49;) {
            getCarta();
        }
    }

    /*metodo embaralhar usando random 
    para criar a carta já embaralhada.*/
    public String embaralhar(int Limite) {
        int gerador;
        do {
            gerador = (int) (Math.random() * Limite);
            //System.out.println(gerador);

        } while (!(gerador >= 0 && gerador <= Limite));
        //System.out.println("Passou" + gerador);
        return String.valueOf(gerador);
        
    }

    /*criar cartas utilizando embaralhar 
    e o construtor de cartas e ir adicionando ao vetor baralho*/
    public int getCarta() {
        Carta carta = new Carta(embaralhar(12), embaralhar(4));
        //System.out.println("Passou" + carta.toString(""));
        if (carta.testaCartaDiferente(carta)) { //adiciona carta ao baralho
            dado.setTamanhoRealBaralho(dado.getTamanhoRealBaralho() + 1);
            if (dado.getBaralho(this.i) != null) {
                dado.setBaralho(carta, dado.getTamanhoRealBaralho());
                System.out.println("entrou");
                this.i++;
            }
        } else {
        }
        return this.i;
    }

    @Override //imprime o Baralho //arrumar isto
    public String toString() {
        String Saida = "";
        for (i = 0; i < dado.getTamanhoRealBaralho(); i++) {
            Saida += "/n" + dado.getBaralho(i);
        }
        return Saida;
    }
}
