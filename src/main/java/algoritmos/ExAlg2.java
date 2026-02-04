package algoritmos;

import java.util.Scanner;

/*Leia um número inteiro. Se ele for par e positivo, imprima "Válido".
Se for ímpar ou negativo, imprima "Inválido".*/
public class ExAlg2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int numero;

        System.out.print("Digite um numero: ");
        numero = sc.nextInt();

        if (numero % 2 == 0 && numero > 0){
            System.out.println("Válido");
        }
        else {
            System.out.println("Digite um número acima de " + numero);
        }
        sc.close();
    }
}
