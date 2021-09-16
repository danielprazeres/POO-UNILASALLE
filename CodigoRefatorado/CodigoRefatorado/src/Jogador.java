import java.util.ArrayList;
public class Jogador {

    //atributos
    private static ArrayList<String> ListaJogadores = new ArrayList<String> ();
    private String nomeJog;
    private String sobreNome;
    private Integer idade;
    private String timeName;
    //public Time time;
  

    //construtor
    /**public Jogador(){
        time = new Time();
    }**/

    //metodos
    public String getNomeJog(){
        return nomeJog;
    }
    public String getSobreNome(){
        return sobreNome;
    }
    public Integer getIdade(){
        return idade;
    }
    public static ArrayList<String> getListaJogador(){
        return ListaJogadores;
    }
    public String getTime(){
        return timeName;
    }
    public void setIdadeJogador(int n1){
        this.idade = n1;
    }
    public void setSobreNome(String sobrenome){
        this.sobreNome = sobrenome;
    }
    public void setNomeJog(String nomejog){
        this.nomeJog = nomejog;
        if(ListaJogadores.size() < 5){
            ListaJogadores.add(nomejog);
        }
        else{
            System.out.println("O numero de jogadores desse time chegou ao m�ximo!!! ");
        }
    }
    public void setTime(String time){
        this.timeName = time;
    }


}