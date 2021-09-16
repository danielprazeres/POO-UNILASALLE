import java.util.ArrayList;
import java.util.Scanner;

public class TesteEscalacao {
    public static void main(String[] args){

    var entrada = new Scanner(System.in);


    Time time = new Time();
    System.out.print("Nome do time: ");
    time.setTimeNome(entrada.next());
    
    ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    for(int i=0; i<5;i++)
    {
        Jogador jogadorRodada = new Jogador();

        System.out.print("Nome do jogador: ");
        jogadorRodada.setNomeJog(entrada.next());
        System.out.print("Sobrenome do Jogador: ");
        jogadorRodada.setSobreNome(entrada.next());
        System.out.print("Idade: ");
        jogadorRodada.setIdadeJogador(entrada.nextInt());
        jogadorRodada.setTime(Time.getNome());
        System.out.println("----------------------------------- \n");

        jogadores.add(jogadorRodada);
    }
    

    Escalacao jogo = new Escalacao();
    System.out.print("Data que vai acontecer o jogo: ");
    jogo.definirData(entrada.next());
    jogo.definirEscalacao(time, jogadores, jogo.getData());
    
   entrada.close();
}
}
