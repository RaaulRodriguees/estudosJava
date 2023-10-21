import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[]args){
        
        //Cria um Scanner chamado sc
        //Cria um Scanner chamado sc
        Scanner sc = new Scanner(System.in);

        //Usuário insere o primeiro valor
        //User enters the first value
        System.out.print("Escreva o primeiro valor: ");
        int num1 = sc.nextInt();

        //Usuário insere o segundo valor
        //User enters the second value
        System.out.print("Escreva o segundo valor: ");
        int num2 = sc.nextInt();

        //Cria variáveis para as operações matematicas
        //Create variables for mathematical operations
        int soma = num1 + num2;
        int sub = num1 - num2;
        int div = num1/num2;
        int multi = num1 * num2;
        
        System.out.println();
        
        //Faz as operações e depois concatena com o sysout
        //Perform the operations and then concatenate with the sysout
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A subtração dos valores é: " + sub);
        System.out.println("A multiplicação dos valores é: " + multi);
        System.out.println("A divisão dos valores é: " + div);

        //Fecha o Scanner
        //Close the Scanner
        sc.close();
    }
}
