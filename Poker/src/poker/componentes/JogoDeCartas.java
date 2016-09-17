/*
    Cria o Jogo de Cartas:
    Metodos
        *darCarta: distribui as cartas para as maos
        *play: Executa o jogo
        Classe de regras
        *cartaMaisAlta: determina e retonar a maior carta;
        *maiorPar: verifica o conjunto recebido como um par e retorna o maior 
            par;
 */
package poker.componentes;

public class JogoDeCartas {

    private Dado dado;
    private Carta cartaAtual, cartaMaior;
    private Baralho baralho;
    private Mao mao, mao2;

    public JogoDeCartas() {
        this.dado = new Dado();
        this.baralho = new Baralho(dado);
        this.mao = new Mao(baralho, dado);
        this.mao2 = new Mao(baralho, dado);
    }

    public void play() {
        System.out.println(this.baralho.toString() + "\n");
        System.out.println(this.mao.toString());
        System.out.println(this.mao2.toString());
    }


/*public static class Regras {

        Regras(int valor, int naipe, Dado dado) {
            //cartaAtual = new Carta(valor, naipe, dado);
            //cartaMaior = new Carta(valor, naipe, dado);
        }

        public Carta maiorPar(Carta carta, Carta carta) {
            for (int i = 0; i <= 8; i++) {
            if (i > 0) {
                cartaAtual = dado.getMao(i);
            } else {
                cartaMaior = dado.getMao(i);
            }
            maiorCarta(cartaAtual, cartaMaior);

            return
        }

        private Carta maiorCarta(Carta cartaAtual, Carta cartaMaior) {
            if (cartaAtual.getValor() > cartaMaior.getValor()) {

                cartaMaior = cartaAtual;

            } else if ((cartaAtual.getValor() == cartaMaior.getValor())
                    && (cartaAtual.getNaipe() > cartaMaior.getNaipe())) {

                cartaMaior = cartaAtual;

            }
            return cartaMaior;
        }

    }*/
}
