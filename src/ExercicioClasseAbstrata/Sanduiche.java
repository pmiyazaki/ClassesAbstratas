package ExercicioClasseAbstrata;

import java.util.Arrays;

public class Sanduiche extends Lanche{
    private int qtdadeIngredientes=0;
    private String[] ingredientes = new String[10];

    @Override
    public String toString() {
        String lanche = "[ ";
        for (int i = 0; i < ingredientes.length; i++) {
            if (ingredientes[i] != null) {
                lanche = lanche + ingredientes[i];
                lanche += " ";
            }
        }
        lanche += "]";
        return lanche;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public Sanduiche() {
        super.setTempoPreparo(15);
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void adicionarIngredientes(String ingrediente) {
        if(qtdadeIngredientes<ingredientes.length) {
            this.ingredientes[qtdadeIngredientes] = ingrediente;
            qtdadeIngredientes++;
        } else {
            System.out.println("Número máximo de ingredientes atingido!");
        }
    }
}
