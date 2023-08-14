package entities;

public class CambioMoedas {
    
    public static final double dolar = 4.91;
    public static final double euro = 5.38;
    public static final double yuan = 0.68;
    
    public double quantidadeInformada;
    
    public double calculoDoDolar(double quantidadeInformada) {
   	 return dolar * quantidadeInformada;
    }
    
    public double calculoDoEuro(double quantidadeInformada) {
   	 return euro * quantidadeInformada;
    }
    
    public double calculoDoYuan(double quantidadeInformada) {
   	 return quantidadeInformada * yuan;
    }
    
    //Desenvolvedor: Pablo Rodrigues
    //Github: https://github.com/PabloR18

}
