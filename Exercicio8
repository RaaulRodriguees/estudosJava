package lista_dalilo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Calcular a primeira média
        System.out.print("Quantas notas deseja utilizar? ");
        int qtd = sc.nextInt();
        System.out.println();

        //Tive que criar um array para armazenar as notas inseridas, já que eu quis dar a possibilidade de utilizar quantas notas o usuário quisesse e assim irá me dar a possibilidade de continuar o exercicio
        float[] notas = new float[qtd];
        float soma = 0;

        //Nesse for enquanto o usuário insere as notas, o soma vai somando os valores inseridos
        for (int i = 0; i < qtd; i++) {
            System.out.printf("Digite a nota %d: ", i + 1);
            notas[i] = sc.nextFloat();
            soma += notas[i];
        }
        
        //Aqui será pego os valores somados no array pelo soma e irá fazer uma média
        float media = soma / qtd;
        System.out.println("Sua média foi: " + media);

        //Aqui é para verificar se o usuário passou ou não
        if (media > 5) {
            System.out.println("Você foi aprovado!");
        //No exercicio era pedido que caso o usuário fosse reprovado, deveria ser adicionado uma nova nota
        } else {
            System.out.println("Você foi reprovado!\n");
            System.out.println("Digite uma nova nota: ");
            float newNota = sc.nextFloat();


            //Nova média

            
            //Aqui ele irá considerar inicialmente a primeira nota como menor
            float menorNota = notas[0];

            //Nesse looping o menorNota irá passar por todo o array e verificar qual é realmente o menor número
            for (int i = 1; i < qtd; i++) {
                if (notas[i] < menorNota) {
                    menorNota = notas[i];
                }
            }

            // Substitui a menorNota pela newNota e se utiliza o break para parar quando encontrar a menorNota
            for (int i = 0; i < qtd; i++) {
                if (notas[i] == menorNota) {
                    notas[i] = newNota;
                    break;
                }
            }

            //Zeramos o soma para não haver erros
            soma = 0;

            //Agora volta ao soma e média de antes, porém com as novas notas
            for (int i = 0; i < qtd; i++) {
                soma += notas[i];
            }

            media = soma / qtd;

            if (media > 5) {
                System.out.println("Você foi aprovado com a nova nota!");
            } else {
                System.out.println("Você continuou reprovado mesmo com a nova nota.");
            }
        }
        sc.close();
    }
}
