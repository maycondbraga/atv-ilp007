public class Atividade17 {
    public static void main(String[] args){
        Carro c;
        c = new Carro("Uno", "ABC1234", 2006, 2007, 3, 31000);
        c.imprime();

        c.deprecia(10);
        System.out.println("\nCarro depreciado");
        c.imprime();
    }
}
