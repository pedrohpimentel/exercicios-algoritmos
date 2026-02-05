package algoritmos;

import java.util.Scanner;

/*Peça para o usuário digitar 10 nomes. Depois, peça para ele digitar um nome qualquer.
O programa deve dizer se esse nome está na lista inicial e em qual posição (índice) ele se encontra .*/
public class ExAlg4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String[] nomes = new String[10];
        boolean encontrado = false;

        System.out.println("Digite 10 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print((i + 1) + "º nome: ");
            nomes[i] = sc.nextLine();
        }

        System.out.print("\nDigite um nome para pesquisar na lista: ");
        String nomeBuscado = sc.nextLine();

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBuscado)) {
                System.out.println("Nome encontrado! Está na posição (índice): " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("O nome '" + nomeBuscado + "' não foi encontrado na lista.");
        }

        sc.close();
    }
}
