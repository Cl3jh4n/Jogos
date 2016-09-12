/*
    Classe com metodos do baralho, contendo 48 cartas distintas
 */
package poker.componentes;

import java.util.Random;

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
        Random gerador = new Random(Limite);
        return String.valueOf(gerador.nextInt());
    }

    /*criar cartas utilizando embaralhar 
    e o construtor de cartas e ir adicionando ao vetor baralho*/
    public int getCarta() {
        Carta carta = new Carta(embaralhar(12), embaralhar(4));
        if (!(carta.testaCartaDiferente(carta)))  { //adiciona carta ao baralho
            dado.setTamanhoRealBaralho(dado.getTamanhoRealBaralho() + 1);
            if (dado.getBaralho(this.i) != null) {
                dado.setBaralho(carta, dado.getTamanhoRealBaralho());
                System.out.println("entrou");
            }
        } else {
            this.i++;
        }
        return this.i;
    }

    @Override //imprime o Baralho //arrumar isto
    public String toString() {
        String Saida = "";
        for (Object l : dado.getBaralho(l)) {
            Saida += "/n" + (l);
        }
        return Saida;
    }
}
