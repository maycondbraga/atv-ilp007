//Maycon Douglas Braga dos Santos RM: 20200484

import java.util.Scanner;

public class Atividade07
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double totalSomado, valorDoProduto, valorFinal;
      totalSomado = 0;
      
      do
      {
         System.out.println("Valor do produto:");
         valorDoProduto = input.nextDouble();
         totalSomado += valorDoProduto;
      } while (valorDoProduto != 0);
      
      if (totalSomado <= 50)
      {
         valorFinal = (totalSomado * 0.95);
      }
      else
      {
         if(totalSomado <= 100)
         {
            valorFinal = (totalSomado * 0.90);
         }
         else
         {
            if (totalSomado <= 200)
               valorFinal = (totalSomado * 0.85);
            else
               valorFinal = (totalSomado * 0.80);
         }
      }
      input.close();
      System.out.printf("\nTotal de compra: %.2f \nValor com Desconto: %.2f", totalSomado,  valorFinal);
   }
}