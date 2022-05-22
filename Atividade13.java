public class Atividade13
{
   public static void main(String[] args)
   {
      System.out.printf("\n\nTestando classe Retangulo Sem Parametros- 1o");
      RetanguloOld r1 = new RetanguloOld();
      System.out.println(r1.toString());

      System.out.printf("\n\nTestando classe Retangulo não Quadrado - 2o");
      RetanguloOld r2 = new RetanguloOld(12, 30);
      System.out.println(r2.toString());

      System.out.printf("\n\nTestando classe Retangulo Quadrado - 3o");
      RetanguloOld r3 = new RetanguloOld(30, 30);
      System.out.println(r3.toString());
   }
}