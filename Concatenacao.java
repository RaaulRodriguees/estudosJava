import java.util.Scanner;

public class Concatenacao {
    public static void main(String[]args){
        
        //Cria um scanner chamado sc
        //Create a scanner called sc
        Scanner sc = new Scanner(System.in);

        //Pede para o usuário inserir a primeira palavra
        //Ask the user to enter the first word
        System.out.print("Escreva a primeira palavra: ");
        String pal1 = sc.nextLine();

        //Pede para o usuário inserir a segunda palavra
        //Ask the user to enter the second word
        System.out.print("Escreva a segunda palavra: ");
        String pal2 = sc.nextLine();

        //Um sysout apenas para enfeitar
        //A sysout just for decoration
        System.out.println();
        
        //Concatena as duas palavras digitadas
        //Concatenates the two words entered
        System.out.println("As palavras digitadas foram: " + pal1 + ", " + pal2 );

        //Fecha o Scanner
        //Close the Scanner
        sc.close();
    }
}
