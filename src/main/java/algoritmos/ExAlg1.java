package algoritmos;

import java.util.Scanner;

/*Crie um programa que receba o raio de uma circunferência e calcule sua área.*/
public class ExAlg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double raio,area;

        System.out.print("Digite o raio da circuferência: ");
        raio = sc.nextDouble();

        area = Math.PI * Math.pow(raio,2);

        System.out.printf("Resultado da área da circuferência: %.2f " , area);

        sc.close();
    }
}
