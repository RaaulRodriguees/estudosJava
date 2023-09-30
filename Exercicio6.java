package lista_dalilo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Insira o primeiro valor: ");
        float num1 = sc.nextFloat();
        System.out.print("Insira o segundo valor: ");
        float num2 = sc.nextFloat();
        System.out.println("Escolha uma das operações a seguir: \n[1]Soma\n[2]Subtração\n[3]Multiplicação\n[4]Divisão\n");
        int oper = sc.nextInt();
        float soma = 1;
        float sub = 2;
        float mult = 3;
        float div = 4;

        if(oper == soma){
            System.out.println(num1 + num2);
        }else if(oper == sub){
            System.out.println(num1 - num2);
        }else if(oper == mult){
            System.out.println(num1 * num2);
        }else if(oper == div){
            System.out.println(num1 / num2);
        }else{
            System.out.println("Nenhuma operação válida foi selecionada.");
        }
        sc.close();
    }
}
