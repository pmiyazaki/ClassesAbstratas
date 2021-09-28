package ExercicioClasseAbstrata;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        do {
            System.out.println("Menu Delivery");
            System.out.println("[1] Sanduíches");
            System.out.println("[2] Massas");
            System.out.println("[3] Bolos");
            System.out.println("[4] Sair");
            System.out.println("Digite a sua opção: ");

            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();

            System.out.println("Opção digitada: " + opcao);

            switch (opcao) {
                case 1:
                    System.out.println("Opção escolhida: Sanduíche");
                    break;
                case 2:
                    System.out.println("Opção escolhida: Massa");
                    break;
                case 3:
                    System.out.println("Opção escolhida: Bolo");
                    break;
                case 4:
                    System.out.println("Opção escolhida: sair do sistema");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida, digite uma opção válida!");
            }
        } while(true);
    }
}
