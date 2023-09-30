package lista_dalilo;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.print("Quantos números deseja utilizar? ");
        int qtd = sc.nextInt();
        System.out.println();

        for (int i = 0; i < qtd; i++) {
            System.out.printf("Digite o valor n° %d: ", i + 1);
            int num = sc.nextInt();

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }

        }

        System.out.println("\nO maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        sc.close();
    }
}
