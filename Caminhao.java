public class Caminhao extends Veiculo {
    private int capacidade;
	private int numEixos;
	
	public Caminhao(String modelo, String placa, int anoFabr, int pCapacidade, int pNumEixos, double valor) {
     	super(modelo, placa, anoFabr, valor);
		setCapacidade(pCapacidade);
		setNumeroEixos(pNumEixos);
    }

    public void setNumeroEixos(int numEixos) {
		this.numEixos = 2;
		if (numEixos > 2)
            this.numEixos = numEixos;
	}

    public int getNumeroEixos() {	
		return numEixos;
	}

    public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

    public int getCapacidade() {
		return capacidade;
	}

    public void imprime(){
		System.out.printf("\nVeiculo: %s\nPlaca: %7s\nFabr: %4d", modelo, placa, anoFabr);
        System.out.printf("\nCapacidade: %d\nEixos: %d\nR$ %.2f\n", capacidade, numEixos, valor);
    }
}
