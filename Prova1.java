package prova_diniz;
import java.util.Scanner;
                                                    //Aluno1: Raul Martins Rodrigues RA: 04722-030;
                                                    //Aluno2: Eric D'Andrea Rapatão  RA: 04722-035;
public class Prova1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha = 0; 
        int aux = 0;
        int aux2 = 0;
        int aux3 = 0;
        int verificar = 0;
        int verificar2 = 0;
        int[] auxVetor = new int[50];

        String[] NomeDasPessoas = new String[50];

        do {
            System.out.println("[1] Cadastrar Pessoa");
            System.out.println("[2] Alterar Pessoa");
            System.out.println("[3] Excluir pessoa");
            System.out.println("[4] Listar Pessoa");
            System.out.println("[5]Pesquisar Pessoa por ID");
            System.out.println("[6] Criadores");
            System.out.println("[7] Sair \n");
            System.out.print("Escolha uma das opções acima: ");
            escolha = sc.nextInt();

            switch (escolha) {

                case 1:
                    System.out.print("Insira o nome que deseja cadastrar: ");
                    NomeDasPessoas[aux] = sc.next();
                    System.out.print("Qual seu ID? ");
                    auxVetor[aux] = sc.nextInt();
                    aux++;
                    break;

                case 2:
                    if (aux == 0) {
                        System.out.println("Não tem usuários cadastrados.");
                    } else {
                        System.out.print("Qual o ID do usuário? ");
                        do {
                            aux2 = sc.nextInt();
                            if (aux2 < 0 || aux2 >= aux) {
                                System.out.println("O ID não existe");
                            } else {
                                verificar2 = 1;
                            }
                        } while (verificar2 != 1);
                        sc.nextLine();
                        System.out.print("Altere o nome do usuário: ");
                        NomeDasPessoas[aux2] = sc.nextLine();
                        System.out.print("Insira o novo ID: ");
                        auxVetor[aux2] = sc.nextInt();
                        System.out.println("Alteração completa");
                    }
                    break;

                case 3:
                    if (aux == 0) {
                        System.out.println("Não há cadastros atualmente.");
                    } else {
                        System.out.print("Qual o ID do usuário para exclusão? ");
                        aux3 = sc.nextInt();
                        NomeDasPessoas[aux3] = "";
                        auxVetor[aux3] = 0;
                        aux--;
                    }
                    break;

                case 4:
                    if (aux == 0) {
                        System.out.println("Não há cadastros atualmente para listar");
                    } else {
                        for (int i = 0; i < aux; i++) {
                            System.out.println("ID: " + auxVetor[i] + " Nome: " + NomeDasPessoas[i]);
                            System.out.println();
                        }
                    }
                    break;

                case 5:
                    if (aux == 0) {
                        System.out.println("Não há cadastros atualmente.");
                    } else {
                        System.out.print("Qual o ID do usuário? ");
                        verificar = sc.nextInt();
                        int i = 0;
                        while (i < aux) {
                            if (verificar == auxVetor[i]) {
                                System.out.println("O usuário se chama: " + NomeDasPessoas[i]);
                                break;
                            } else {
                                i++;
                            }
                        }
                        if (i == aux) {
                            System.out.println("Não há usuários com esse ID.");
                        }
                    }
                    break;

                case 6:
                    System.out.println(
                            "Criadores: \n\nRaul Martins Rodrigues RA: 04722-030 \nEric D'Andrea Rapatão RA: 04722-035 \n");
                    break;

                case 7:
                    System.out.println("Fechando o menu.");
                    break;
                default:
                    System.err.println("Insira uma opção válida.");
                    break;
            }
        } while (escolha != 7);
        sc.close();
    }
}