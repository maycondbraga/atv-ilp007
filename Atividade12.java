import java.util.Scanner;

public class Atividade12
{
   public static void main(String[] args)
   {
      System.out.printf("\n\nConstrutor com numero conta e titular:");
      ContaCorrente cc1 = new  ContaCorrente(12345, "Joao da Silva");
      cc1.verDados();
      
      System.out.printf("\n\nConstrutor com numero conta, titular e saldo:");
      ContaCorrente cc2 = new ContaCorrente(54321, "Maria dos Santos", 500);
      cc2.verDados();

      System.out.printf("\n\nConstrutor com numero conta, titular, saldo e limite:");
      ContaCorrente cc3 = new ContaCorrente(98745, "Fulano Ciclano", 500, 3000);
      cc3.verDados();
      
      Scanner entrada = new Scanner(System.in);
      
      System.out.printf("\n\nValor de deposito em c3: ");
      double vlr = entrada.nextDouble();
      cc3.deposito(vlr);
      cc3.verDados();
      
      System.out.printf("\n\nValor de saque em c3: ");
      cc3.saque(entrada.nextDouble());
      cc3.verDados();
      entrada.close();
   }
}