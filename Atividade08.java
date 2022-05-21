//Maycon Douglas Braga dos Santos RM: 20200484

import java.util.Scanner;

public class Atividade08
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int totalDeFuncionarios;
      double salario, totalSalarios = 0, maiorSalario = 0, menorSalario = Double.MAX_VALUE;
      
      do
      {
         System.out.println("Digite a quantidade de funcionarios:");
         totalDeFuncionarios = input.nextInt();
         
         if (totalDeFuncionarios <= 0) { System.out.println("\nNumero de funcionarios invalido.\n"); }
      } while (totalDeFuncionarios <= 0);
      
      for (int i = 1; i <= totalDeFuncionarios; i++)
      {
         salario = 0;
         System.out.printf("Digite o %do salario:", i);
         salario += input.nextDouble();  
         
         totalSalarios += salario;
         if (salario < menorSalario)
         {
            menorSalario = salario;
         }
         if (salario > maiorSalario)
         {
            maiorSalario = salario;
         }
      }
      input.close();
      System.out.printf("\nMenor Salario: %.2f", menorSalario);
      System.out.printf("\nMaior Salario: %.2f", maiorSalario);
      System.out.printf("\nMedia Salarial: %.2f", totalSalarios/totalDeFuncionarios);
   }
}