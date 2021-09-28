package ExercicioClasseAbstrata;

public class Bolo extends Lanche{
    private String massa;
    private String recheio;
    private String cobertura;

    public Bolo(){
        super.setTempoPreparo(10);
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }
}
