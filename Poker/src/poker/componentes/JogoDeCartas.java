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

    Dado dado;
    Baralho baralho;
    Mao mao, mao2;

    public JogoDeCartas() {
        dado = new Dado();
        baralho = new Baralho(dado);
        mao = new Mao(baralho, dado);
        mao2 = new Mao(baralho, dado);
    }

    public static class Regras {

        public boolean maiorPar() {
            
            return
        }

        public boolean maiorCarta() {
            
            return
        }
    }

    public void play() {
        JogoDeCartas poker = new JogoDeCartas();
    }
}
