public class Atividade11
{
   public static void main(String[] args)
   {
      Data dataComum = new Data(28, 02, 2022);
      System.out.println("Data com ano comum: " + dataComum.toString());
      System.out.println("Ano bissexto: " + dataComum.bissexto()+"\n");

      Data dataAnoBissexto = new Data(29, 02, 2016);
      System.out.println("Data com ano bissexto: " + dataAnoBissexto.toString());
      System.out.println("Ano bissexto: " + dataAnoBissexto.bissexto()+"\n");      

      
      Data dataErro = new Data(29, 02, 2022);
      System.out.println("Data com erro: " + dataErro.toString()+"\n");
   }
}