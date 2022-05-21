//Maycon Douglas Braga dos Santos RM: 20200484

import java.util.Scanner;

public class Atividade02
{
   public static void main(String[] args)
   {
      Scanner input;
      input = new Scanner(System.in);
      
      double temperaturaConvertida;
      double temperaturaEmFahrenheit;
      
      System.out.println("Converte Fahrenheit para Celsius:\n");
      
      System.out.println("\nDigite a temperatura em Fahrenheit: ");
      temperaturaEmFahrenheit = input.nextDouble();
      
      temperaturaConvertida = (temperaturaEmFahrenheit - 32) * 5 / 9;
      System.out.printf("Temperatura convertida para Celsius: %5.2f%cC", temperaturaConvertida, 167);
      input.close();
   }
}