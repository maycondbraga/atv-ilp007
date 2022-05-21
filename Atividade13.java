public class Atividade13
{
   public static void main(String[] args)
   {
      System.out.printf("\n\nTestando classe Retangulo Sem Parametros- 1o");
      Retangulo r1 = new Retangulo();
      System.out.println(r1.toString());

      System.out.printf("\n\nTestando classe Retangulo não Quadrado - 2o");
      Retangulo r2 = new Retangulo(12, 30);
      System.out.println(r2.toString());

      System.out.printf("\n\nTestando classe Retangulo Quadrado - 3o");
      Retangulo r3 = new Retangulo(30, 30);
      System.out.println(r3.toString());
   }
}