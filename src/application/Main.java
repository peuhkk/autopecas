package application;

import entities.Pecas;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Pecas pecas = new Pecas();

        System.out.println("CENTRAL AUTOPEÇAS");
        System.out.println("");

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.printf("%nOlá, %s Você deseja cadastrar alguma peça? (s/n) ", nome);
        char escolha = sc.next().charAt(0);

        if (escolha == 's') {
            System.out.print("Digite o ID da peça: ");
            pecas.setID(sc.nextInt());
            System.out.print("Digite o nome da peça: ");
            sc.nextLine();
            pecas.setNome(sc.nextLine());
            System.out.print("Deseja adcionar uma descrição? ");
            char escolhaDescricao = sc.next().charAt(0);
            if (escolhaDescricao == 's') {
                sc.nextLine();
                pecas.setDescricao(sc.nextLine());
                System.out.println("Descrição Adicionada com sucesso!");
            } else {
                pecas.setDescricao("Peça sem descrição");
            }
            System.out.println("Peça Cadastrada com sucesso!");
        }

        System.out.println("");
        System.out.print("Digite o ID da peça: ");
        int procurar = sc.nextInt();

        if (procurar == pecas.getID()) {
            System.out.println(pecas);
        } else {
            System.out.println("A peça com o ID " + procurar + " não está cadastrada!");
        }
        sc.close();
    }
}