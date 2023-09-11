
package atividade04;


public class Dados {
    
    private String Data;
    private String Hora;
    private int PressaoSistolica;
    private int PressaoDiastolica;
    private boolean NivelPressao;
    
    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public int getPressaoSistolica() {
        return PressaoSistolica;
    }

    public void setPressaoSistolica(int PressaoSistolica) {
        this.PressaoSistolica = PressaoSistolica;
    }

    public int getPressaoDiastolica() {
        return PressaoDiastolica;
    }

    public void setPressaDiastolica(int PressaoDiastolica) {
        this.PressaoDiastolica = PressaoDiastolica;
    }

    public boolean isNivelPressao() {
        return NivelPressao;
    }

    public void setNivelPressao(boolean NivelPressao) {
        this.NivelPressao = NivelPressao;
    }
   
}
