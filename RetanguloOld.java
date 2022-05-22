public class RetanguloOld {
    private double base, altura;

    public RetanguloOld(){
        setBase(2);
        setAltura(1);
    }

    public RetanguloOld(double base, double altura){
        if(base <= 0 || altura <= 0){
            System.out.println("\nDimensões inválidas. Setando dimensão padrão.");
            if(base <= 0){
                setBase(2);
            }
            if(altura <= 0){
                setAltura(1);
            }
        }
        else{
            setBase(base);
            setAltura(altura);
        }
    }

    public void setBase (double base){
        if (base <= 0){
            System.out.println("Base inválida.");
        }
        else{
            this.base = base;
        }
    }

    public void setAltura (double altura){
        if (altura <= 0){
            System.out.println("Altura inválida.");
        }
        else{
            this.altura = altura;
        }
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public double area(){
        return base * altura;
    }

    public double perimetro(){
        return 2 * (base + altura);
    }

    public boolean ehQuadrado(){
        if (base == altura){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        
        result.append("\n\n-----------------------\n");
        
        result.append("\nRetangulo:\n");
        result.append(String.format("Base     : %.2f\nAltura   : %.2f\nArea     : %.2f\nPerimetro: %.2f\nÉ quadrado? %b", getBase(), getAltura(), area(), perimetro(), ehQuadrado()));
        
        result.append("\n-----------------------\n");

        return result.toString();
    }
}
