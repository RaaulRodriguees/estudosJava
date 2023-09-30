package lista_dalilo;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva o primeiro valor: ");
        int num1 = sc.nextInt();

        System.out.print("Escreva o segundo valor: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;
        int sub = num1 - num2;
        int div = num1/num2;
        int multi = num1 * num2;

        System.out.println();
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A subtração dos valores é: " + sub);
        System.out.println("A multiplicação dos valores é: " + multi);
        System.out.println("A divisão dos valores é: " + div);

        sc.close();
    }
}
