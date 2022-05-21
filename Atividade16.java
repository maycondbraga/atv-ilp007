public class Atividade16 {
    public static void main(String[] args){
        Veiculo v;
        v = new Veiculo("Uno", "ABC1234", 2007, 34000);
        v.imprime();

        v.deprecia(10);
        System.out.println("\nVeículo depreciado");
        v.imprime();
    }
}
