package lista_dalilo;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva o primeiro valor: ");
        int num1 = sc.nextInt();

        System.out.print("Escreva o segundo valor: ");
        int num2 = sc.nextInt();

        System.out.print("Escreva o terceiro valor: ");
        int num3 = sc.nextInt();

        int media = (num1+num2+num3)/3;

        System.out.println();
        System.out.println("A média dos valores é: " + media);

        sc.close();
    }
}
