public class Data
{
   private int _dia; // 1 a 31, de acordo com o mês
   private int _mes; // 1 a 12
   private int _ano; // qualquer ano
   
   public Data (int ano)
   {
      setData(1, 1, ano);
   }
   
   public Data (int mes, int ano)
   {
      setData(1, mes, ano);
   }
   
   public Data (int dia, int mes, int ano)
   {
      setData(dia, mes, ano);
   }
   
   public void setData(int dia, int mes, int ano)
   {
      if (mes > 0 && mes <= 12)
      {
         _mes = mes;
      }
      else
      {
         _mes = 1;
         System.out.println("Mês " + mes + " Invalido. Configurado mês = 1.");
      }
      
      _ano = ano;
      _dia = checkDia(dia);
   }
   
   private int checkDia (int diaTeste)
   {
      int diasMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

      if (bissexto())
         diasMes[2] = 29;

      if (diaTeste > 0 && diaTeste <= diasMes[_mes])
      {
         return diaTeste;
      }
      
      System.out.println("Dia " + diaTeste + " Invalido. Configurado dia = 1.");
      return 1;
   }
   
   public boolean bissexto() 
   {
      return (_ano % 4 == 0) && (_ano % 100 != 0 || _ano % 400 == 0);
   }
   
   public int getDia()
   {
      return _dia;
   }
   
   public int getMes()
   {
      return _mes;
   }   
   
   public int getAno()
   {
      return _ano;
   }
   
   public String toString()
   {
      return _dia + "/" + _mes + "/" + _ano;
   }
   
}