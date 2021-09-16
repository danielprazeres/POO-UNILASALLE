public class TesteEscalacao {
    public static void main(String[] args){

    Time time = new Time();
    time.setTimeNome("Flamengo");
    
    Jogador jog1 = new Jogador();  
    jog1.setNomeJog("Osvaldo");
    jog1.setSobreNome("Ruan Moreira");
    jog1.setIdadeJogador(25);
    jog1.setTime(Time.getNome());

    Jogador jog2 = new Jogador(); 
    jog2.setNomeJog("Mario");
    jog2.setSobreNome("Valente");
    jog2.setIdadeJogador(25);
    jog2.setTime(Time.getNome());

    Jogador jog3 = new Jogador(); 
    jog3.setNomeJog("Marcos");
    jog3.setSobreNome("Ferreira");
    jog3.setIdadeJogador(25);
    jog3.setTime(Time.getNome());

    Jogador jog4 = new Jogador();  
    jog4.setNomeJog("Fabio");
    jog4.setSobreNome("Jesus");
    jog4.setIdadeJogador(23);
    jog4.setTime(Time.getNome());

    Jogador jog5 = new Jogador();  
    jog5.setNomeJog("Jorge");
    jog5.setSobreNome("Vieira");
    jog5.setIdadeJogador(26);
    jog5.setTime(Time.getNome());

    Escalacao.imprimirEscalacao();
}
}