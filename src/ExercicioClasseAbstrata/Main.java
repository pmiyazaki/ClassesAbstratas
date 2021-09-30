package ExercicioClasseAbstrata;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        do {
            mostrarMenuPrincipal();
        } while(true);
    }

    public static void fecharPedido() {
        Sanduiche sanduiche = new Sanduiche();
        System.out.println("============================");
        System.out.println("Fechar pedido");
        System.out.println("Distância da entrega: ");

        Scanner scanner = new Scanner (System.in);
        Double distancia = scanner.nextDouble();
        System.out.println("Tempo estimado de entrega: " + (sanduiche.calcularEntrega(distancia) + sanduiche.getTempoPreparo()) + " minutos");


    }

    public static void montarSanduiches(){
        Sanduiche sanduiche = new Sanduiche();
        do {
            System.out.println("====================================");
            System.out.println("[1] Queijo        [5] Presunto");
            System.out.println("[2] Hamburguer    [6] Molho Especial");
            System.out.println("[3] Bacon         [7] Alface");
            System.out.println("[4] Ovo           [8] Tomate");
            System.out.println("[9] Montar Lanche [0] Voltar ao menu principal");

            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> sanduiche.adicionarIngredientes("Queijo");
                case 2 -> sanduiche.adicionarIngredientes("Hamburguer");
                case 3 -> sanduiche.adicionarIngredientes("Bacon");
                case 4 -> sanduiche.adicionarIngredientes("Ovo");
                case 5 -> sanduiche.adicionarIngredientes("Presunto");
                case 6 -> sanduiche.adicionarIngredientes("Molho Especial");
                case 7 -> sanduiche.adicionarIngredientes("Alface");
                case 8 -> sanduiche.adicionarIngredientes("Tomate");
                case 9 -> mostrarLanche(sanduiche);
                case 0 -> { System.out.println("Seu lanche está sendo produzido!") ;mostrarMenuPrincipal(); }
            }
        } while (true);
    }

    public static void mostrarLanche(Sanduiche sanduiche) {
        System.out.println("Seu sanduíche contém os seguintes ingredientes: ");
        System.out.println(sanduiche.toString());
    }

    public static void mostrarMenuMassas(){}

    public static void mostrarMenuBolos(){}

    private static void mostrarMenuPrincipal() {
        System.out.println("Menu Delivery");
        System.out.println("[1] Sanduíches");
        System.out.println("[2] Massas");
        System.out.println("[3] Bolos");
        System.out.println("[4] Fechar pedido");
        System.out.println("[0] Sair");
        System.out.println("Digite a sua opção: ");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        System.out.println("Opção digitada: " + opcao);

        String msg = "Opção escolhida: ";
        switch (opcao) {
            case 1 -> { System.out.println(msg + "Sanduíche"); montarSanduiches(); }
            case 2 -> System.out.println(msg + "Massa");
            case 3 -> System.out.println(msg + "Bolo");
            case 4 -> { fecharPedido(); System.exit(0); }
            case 0 -> {
                System.out.println(msg + "sair do sistema");
                System.exit(0);
            }
            default -> System.out.println("Opção inválida, digite uma opção válida!");
        }
    }
}
