package algoritmos;

import java.util.Scanner;

/*Escreva um programa que receba 5 notas de um aluno, armazene-as em um Array e,
ao final, exiba a média aritmética e quantas notas ficaram acima dessa média.*/
public class ExAlg3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double[] notas = new double[5];
        double soma = 0;

        System.out.println("Digite suas 5 notas. ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i +1) + ": " );
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.printf("\nMédia Aritmética: %.2f \n" , media);

        int contadorAcima = 0;
        for(double nota : notas){
            if (nota >media){
                contadorAcima++;
            }
        }

        System.out.println("Quantidade de notas acima da média: " + contadorAcima);

        sc.close();
    }
}
