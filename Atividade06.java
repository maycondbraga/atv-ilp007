//Maycon Douglas Braga dos Santos RM: 20200484

import java.util.Scanner;

public class Atividade06
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Entre com o numero da conta:");
      String numeroConta = input.nextLine();
      
      if (numeroConta.length() <= 6)
      {
         int somaNumeroConta = 0;
         for (String numero: numeroConta.split(""))
         {
            somaNumeroConta += Integer.parseInt(numero);
         }
         
         System.out.printf("\nNumero da conta: %06d-%1d", Long.parseLong(numeroConta), somaNumeroConta % 10);
      }
      else
      {
         System.out.println("Numero invalido.");
      }
      input.close();
   }
}