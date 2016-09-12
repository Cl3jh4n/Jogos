/*
    Construtor do Objeto Carta Possui:
        *Um Valor
        *Um Naipe
 */
package poker.componentes;

public class Carta {

    private int valor, naipe;
    private int[] cartas;
    private Dado dado;

    private Carta() {
        dado = new Dado();
    }

    private void Carta(int valor, int naipe) {
        if (valor >= 0 && valor <= 12 && naipe >= 0 && naipe <= 3) {
            this.valor = valor;
            this.naipe = naipe;
        }else{
            System.out.println(toString("Erro ao criar Carta"));
        }
    }

    public Carta(String valor, String naipe) {
        this();
        Carta(Integer.parseInt(valor), Integer.parseInt(naipe));
    }

    public String toString(String aviso) {
        if ("".equals(aviso)) {
            aviso = dado.getValor(this.valor) + " de "
                    + dado.getNaipe(this.naipe);
        }
        return aviso;
    }

    public boolean testaCartaDiferente(Carta carta) { //testa as cartas diferentes
        boolean teste = false;
        for (int i = 0; i < 48; i++) {
            teste = carta.equals(dado.getBaralho(i)); //refazer este teste
        }
        return teste;
    }
}
