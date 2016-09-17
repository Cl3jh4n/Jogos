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
    private Carta cartaA, cartaB;
    private Baralho baralho;
    private Mao mao, mao2;
    private int anterior;

    public JogoDeCartas() {
        this.dado = new Dado();
        this.baralho = new Baralho(dado);
        this.mao = new Mao(baralho, dado);
        this.mao2 = new Mao(baralho, dado);
    }

    public void play() {
        System.out.println("Distribuindo as cartas...");
        System.out.println("~~~~~~~~~~~Primeira mao~~~~~~~~~~~~~~~\n"
                + this.mao.toString());
        System.out.println("~~~~~~~~~~~Segunda mao~~~~~~~~~~~~~~~\n"
                + this.mao2.toString());

        if (maiorPar(this.mao) > maiorPar(this.mao2)) {
            System.out.println("Primeira Mao ganhou");
        } else if (maiorPar(this.mao) < maiorPar(this.mao2)) {
            System.out.println("Segunda Mao ganhou");
        } else if (maiorCarta(this.mao) > maiorCarta(this.mao2)) {
            System.out.println("Primeira Mao ganhou");
        } else {
            System.out.println("Segunda Mao ganhou");
        }
    }

    //verifica o maior par de cada mão
    public int maiorPar(Mao mao) {//corrigrir esta
        int maiorPar = 0;
        for (int x = 11; x >= 0; x--) {
            int quantidade = 0;
            for (int i = 0; i < 8; i++) {
                if (mao.mao.get(i).getValor() == x) {
                    quantidade += 1;
                }
            }
            if (quantidade >= 2) {
                maiorPar = x;
                break;
            }
        }
        return maiorPar;
    }

    //verifica a maior carta de cada mao
    public int maiorCarta(Mao mao) {
        int maiorCarta = 0;
        for (int i = 8; i > 0; i--) {
            if (mao.mao.get(i).getValor() > maiorCarta) {
                maiorCarta = mao.mao.get(i).getValor();
            }
        }
        return maiorCarta;
    }

    public static void main(String[] args) {
        JogoDeCartas poker = new JogoDeCartas();
        poker.play();
    }
}
