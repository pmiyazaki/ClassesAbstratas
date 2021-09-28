package ExercicioClasseAbstrata;

public class Sanduiche extends Lanche{
    private String[] ingredientes = new String[10];

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }
}
