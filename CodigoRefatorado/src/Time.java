/**
TRABALHO POO
Daniel Prazeres e Natan Lemes
Sistemas de Informação
**/
public class Time {

    //atributos
    private static String nome;
    private String escudo;

    public Time(){
        this.escudo = "Vermelho e Preto";
    }

    public static String getNome(){
        return nome;
    }
    public String getEscudo(){
        return escudo;
    }
    public void setTimeNome(String time){
        Time.nome = time;
    }
    
}
