package NutriSoft.model;

public class CalculoGastoCalorico {
    private double peso;
    private double altura;
    private double idade;
    private double calculo;

    public CalculoGastoCalorico(double peso, double altura, double idade, String sexo) {
        if (peso <= 0 || altura <= 0 || idade <= 0) {
            throw new IllegalArgumentException("Valores inválidos para peso, altura ou idade.");
        }

        this.peso = peso;
        this.altura = altura;
        this.idade = idade;

        if (sexo.equalsIgnoreCase("Homem")) {
            this.calculo = calculoBasalHomem();
        } else if (sexo.equalsIgnoreCase("Mulher")) {
            this.calculo = calculoBasalMulher();
        } else {
            throw new IllegalArgumentException("Sexo inválido.");
        }
    }

   

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public double getCalculo() {
        return calculo;
    }

    private double calculoBasalHomem() {
        return 66 + (13.8 * peso) + (5 * altura) - (6.8 * idade);
    }

    private double calculoBasalMulher() {
        return 655 + (9.6 * peso) + (1.9 * altura) - (4.7 * idade);
    }

 
}
