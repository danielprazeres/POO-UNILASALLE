import java.util.Scanner;

public class OrganizarVetor {
    public static void main(String[] args) {
        int[] vetA= new int[10];
        int aux;

        Scanner teclado = new Scanner(System.in);

        for (int i=0;i<10;i++)
        {
            System.out.println("Entre com o valor do vetor da posição - "+(i+1));
            vetA[i] = Integer.parseInt(teclado.next());
        }
        
        aux = vetA[0];
        for (int i=0;i<10;i++)
        {
            for (int j=0;j<10;j++)
            {
                if(vetA[i]<vetA[j])
                {
                    aux = vetA[i];
                    vetA[i]=vetA[j];
                    vetA[j]=aux;
                }
            }
        }
        
        

        for (int i=0;i<10;i++)
        {
            System.out.print(" ["+vetA[i]+"] ");
            
        }
        

        teclado.close();
}
}