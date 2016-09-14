/*
    Construtor da mao
    Metodos
        *addCarta pega 8 cartas do baralho
        *toString imprime as cartas do baralho
*/
package poker.componentes;


public class Mao {
    private String saida;
    private Dado dado;
    private int i;
    Mao(){
       dado = new Dado(2);
    }
    
    public void addCarta(Carta carta){
       dado.setMao(carta, i);
       i++;
    }
    
    /*@Override        
    public String toString(){
        return
    }*/

}
