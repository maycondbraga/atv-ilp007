public class Circulo
{
	private double _raio;

   public Circulo()
   {
   }   
   
   public Circulo(double r)
   {
      setRaio(r);
   }

	public void setRaio(double raio)
	{
      if (raio < 0)
         System.out.println("Raio invalido.");
      else
      	_raio = raio;
	}

	public double getRaio()
	{
		return _raio;
	}

	public double getDiametro(){
		return 2 * _raio;
	}
	
	public double getArea() {
		return (Math.PI * (Math.pow(_raio, 2)));
	}
	
	public double getCircunferencia() {
		return ((2 * Math.PI) * _raio);
	}

	public void exibeDados()
	{
		System.out.printf("\n\nDados do circulo de raio: %.2f", getRaio());
  		System.out.printf("\nDiametro      : %.2f", getDiametro());
  		System.out.printf("\nCircunferencia: %.2f", getCircunferencia());
  		System.out.printf("\nArea          : %.2f", getArea());
	}
}