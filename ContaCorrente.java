public class ContaCorrente
{
   private int _numeroConta;
   private String _titular;
   private double _saldo;
   private double _limite;
   
   public ContaCorrente(int numeroConta, String titular)
   {
      setTitular(titular);
      
      if (numeroConta < 0)
         System.out.println("\nNumero de conta invalido.");
      else
         _numeroConta = numeroConta;
         
      _saldo = 0;
      _limite = 0;
   }
   
   public ContaCorrente(int numeroConta, String titular, double saldo)
   {
      setLimite(1000.0);
      setTitular(titular);
      
      if (numeroConta < 0)
         System.out.println("\nNumero de conta invalido.");
      else
         _numeroConta = numeroConta;
      
      deposito(saldo);
   }
   
   public ContaCorrente(int numeroConta, String titular, double saldo, double limite)
   {
      setLimite(limite);
      setTitular(titular);
      
      if (numeroConta < 0)
         System.out.println("\nNumero de conta invalido.");
      else
         _numeroConta = numeroConta;
      
      deposito(saldo);
   }
   
   public void setTitular(String titular)
   {
      _titular = titular;
   }
   
   public String getTitular()
   {
      return _titular;
   }

   public int getNumeroConta()
   {
      return _numeroConta;
   }
   
   public double getSaldo()
   {
      return _saldo;
   }
   
   public double getLimite()
   {
      return _limite;
   }
   
   public void setLimite(double limite)
   {
      _limite = limite;
   }   
   
   public void deposito(double valor)
   {
      if (valor > 0)
         _saldo += valor;
      else
         System.out.printf("\nValor de deposito R$%.2f invalido.", valor);
   }
   
   public void saque(double valor)
   {
      if (valor > 0)
         if (valor < _saldo)
         {
            _saldo -= valor;
         }
         else if (valor <= (_saldo + _limite))
         {
            double descontarDoLimite = valor - _saldo;
            
            _saldo = 0;
            _limite -= descontarDoLimite;
         } 
         else
            System.out.printf("\nSaque insuficiente por falta de recursos.");
      else
         System.out.printf("\nValor de saque R$%.2f invalido.", valor);         
   }
   
   public void verDados()
   {
      System.out.printf("\n\nConta  : %07d", getNumeroConta());
      System.out.printf("\nTitular: %s", getTitular());
      System.out.printf("\nSaldo  : R$ %.2f", getSaldo());      
      System.out.printf("\nLimite  : R$ %.2f", getLimite());      
   }
}