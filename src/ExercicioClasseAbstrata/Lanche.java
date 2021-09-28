package ExercicioClasseAbstrata;

public abstract class Lanche {
    private double preco;

    public Lanche() {
        this.preco = 0;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
