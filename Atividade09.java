import java.util.Scanner;

public class Atividade09
{
   public static void main(String[] args)
   {
      double raio;
   	Scanner input = new Scanner(System.in);
   	Circulo c = new Circulo();
   	
   	System.out.println("Digite o valor do raio: ");
   	raio = input.nextDouble();
      
      c.setRaio(raio);
      c.exibeDados();
      input.close();
   }
}