public class Atividade04
{
   public static void main(String[] args)
   {
      String testeMinusculo = "minusculo";
      String testeMaiusculo = "MAIUSCULO";
      
      System.out.println("Converte para minusculo: " + testeMaiusculo.toLowerCase());
      System.out.println("Converte para maiusculo: " + testeMinusculo.toUpperCase());

      //--------------------------------

      String vazia = "";
      String conteudo = "teste";
      
      System.out.println("Vazia, isEmpty: " + vazia.isEmpty());
      System.out.println("Com conteudo, isEmpty: " + conteudo.isEmpty());      

      //--------------------------------

      String teste = "teste";
      String testeCorreto = "teste";
      String testeErroMenor = "test";
      String testeErroMaior = "testee";
      
      System.out.println("Igual: " + testeCorreto.compareTo(teste));
      System.out.println("Menor: " + testeErroMenor.compareTo(teste));
      System.out.println("Maior: " + testeErroMaior.compareTo(teste));
   }
}