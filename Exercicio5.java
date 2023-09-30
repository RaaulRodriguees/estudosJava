package lista_dalilo;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Insira um número: ");
        int num = sc.nextInt();

        if(num %2 == 0){
            System.out.println("Seu número é par!");
        }else{
            System.out.println("Seu número é ímpar!");
        }

        sc.close();
    }
}
