//Maycon Douglas Braga dos Santos RM: 20200484

import java.util.Scanner;

public class Atividade05
{
   public static void main(String[] args)
   {
      //Dados 3 valores, verifique se os mesmos formam um trianglo ou n�o. Caso afirmativo, informe se � escaleno, is�sceles ou equil�tero.
      int a, b, c;
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Entre com o lado a:");
      a = input.nextInt();
      
      System.out.println("Entre com lado b:");
      b = input.nextInt();
      
      System.out.println("Entre com lado c:");
      c = input.nextInt();

     if ((a + b > c) && (a + c > b) && (b + c > a)) 
     {
         if (a == b && a == c) 
         {
            System.out.println("Os 3 lados formam um triangulo EQUILATERO.");
         }
         else
         {
            if (a == b || a == c || b == c)
            {
               System.out.println("Os 3 lados formam um triangulo ISOSCELES.");
            }
            else
            {
               System.out.println("Os 3 lados formam um triangulo ESCALENO.");
            }
         }
     } 
     else 
     {
         System.out.println("Os 3 lados NAO formam um triangulo.");
     }
     input.close();
   }
}