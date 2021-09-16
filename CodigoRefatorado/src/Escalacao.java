import java.util.ArrayList;

public class Escalacao {
// public static ArrayList<String> escalacao;
private String dataJogo;
private ArrayList<Jogador> escalacaoTime;
private Time timeEscalado;
    
public static ArrayList<String> listaNomes(){
    return Jogador.getListaJogador();
}


public static void imprimirEscalacao(String data){
        System.out.println("A escalação do " + Time.getNome() + " para o dia "+ data +"-------------------------------------------------------------  \n " + listaNomes() );
    }


 public void definirData(String dataDoJogo){
     this.dataJogo = dataDoJogo;
 }

public void definirEscalacao(Time time, ArrayList<Jogador> jogadores, String data)
{
    this.timeEscalado = time;
    this.escalacaoTime = jogadores;
    imprimirEscalacao(data);
}

public String getData()
{
    return this.dataJogo;
}

}