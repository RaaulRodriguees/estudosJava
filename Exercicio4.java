package lista_dalilo;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira uma nota: ");
        float nota = sc.nextFloat();

        if(nota >= 5){
            System.out.println();
            System.out.println("Você foi aprovado!");
        }else{
            System.out.println();
            System.out.println("Você reprovou!");
        }

        sc.close();
    }   
}
