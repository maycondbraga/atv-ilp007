public class Atividade18 {
    public static void main(String[] args){
        Caminhao c;

        c = new Caminhao("Mercedes", "XYZ3456", 2000, 10, 3, 50000);

        c.imprime();
        c.deprecia(10);

        System.out.println("\nCaminhao depreciado");
        c.imprime();
    }
}
