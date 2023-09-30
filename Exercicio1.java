package lista_dalilo;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva a primeira palavra: ");
        String pal1 = sc.nextLine();
        System.out.print("Escreva a segunda palavra: ");
        String pal2 = sc.nextLine();

        System.out.println();
        System.out.println("As palavras digitadas foram: " + pal1 + ", " + pal2 );

        sc.close();
    }
}
