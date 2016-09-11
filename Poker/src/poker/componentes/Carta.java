/*
    Construtor do Objeto Carta Possui:
        *Um Valor
        *Um Naipe
 */
package poker.componentes;

public class Carta {

    private int valor, naipe;
    private char[] VALORES;
    private String[] NAIPES;

    //Construtor apenas para declaração dos valores
    private Carta() {
        VALORES = new char[12];
        VALORES[0] = '2';
        VALORES[1] = '3';
        VALORES[2] = '4';
        VALORES[3] = '5';
        VALORES[4] = '6';
        VALORES[5] = '7';
        VALORES[6] = '8';
        VALORES[7] = '9';
        VALORES[8] = 'J';
        VALORES[9] = 'Q';
        VALORES[10] = 'K';
        VALORES[11] = 'A';

        NAIPES = new String[3];
        NAIPES[0] = "Espadas";
        NAIPES[1] = "Paus";
        NAIPES[2] = "Copas";
        NAIPES[3] = "Ouro";
        
    }

    Carta(int valor, int naipe) {
        this(); //instancia a Carta com os atributos...
        this.valor = valor;
        this.naipe = naipe;
    }

    Carta(String valor, String naipe) {
        this();
    }

    
    public int getNaipe(int naipe){
        return this.naipe;
    }
    
    public int getValor(int valor){
        return this.valor;
    }
    
    public String toString(){}
    
    public int compararValor(Carta c){}
}
