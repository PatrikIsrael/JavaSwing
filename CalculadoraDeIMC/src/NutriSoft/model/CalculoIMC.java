package NutriSoft.model;


public class CalculoIMC {

    private double altura;
    private double peso;
    private double Calculo;

    public CalculoIMC (double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
        this.Calculo = calcularIMC();
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCalculo() {
        return Calculo;
    }

    public void setCalculo() {
        this.Calculo = calcularIMC();
    }

    private double calcularIMC() {
        return peso / (altura * altura);
    }
}
