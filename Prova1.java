package prova_diniz;

import java.util.Scanner;
                                                    //Aluno1: Raul Martins Rodrigues RA: 04722-030;
                                                    //Aluno2: Eric D'Andrea Rapatão  RA: 04722-035;
public class Prova1 {
    public static void main(String[] args) {

        //Criar um scanner com o nome de sc
        //Create a scanner with the name sc
        Scanner sc = new Scanner(System.in);

        //Variaveis 
        //Variables
        int escolha = 0; 
        int aux = 0;
        int aux2 = 0;
        int aux3 = 0;
        int verificar = 0;
        int verificar2 = 0;
        int[] auxVetor = new int[50];

        //Criar um vetor
        //Create a vector
        String[] NomeDasPessoas = new String[50];

        
        do {
          
            //Layout pedido em uma das questões da prova
            //Layout requested in one of the test questions
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
                
                //Ao selecionar a opção 1 você deverá colocar um nome e ID de usuario
                //When selecting option 1 you must enter a name and user ID
                case 1:
                    System.out.print("Insira o nome que deseja cadastrar: ");
                    NomeDasPessoas[aux] = sc.next();
                    System.out.print("Qual seu ID? ");
                    auxVetor[aux] = sc.nextInt();
                    aux++;
                    break;
                
                //Se você selecionar 2, você irá colocar o ID do usuário para alterar os dados. Porem se não tiver cadastrado ninguem ou não colocar o ID certo aparecerar mensagens de erro
                //If you select 2, you will enter the user ID to change the data. However, if no one has registered or you do not enter the correct ID, error messages will appear.
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
                
                //Se você selecionar 3 irá excluir um cadastro existente. Porem se não houver nenhum, aparecerá uma mensagem de erro
                //If you select 3 you will delete an existing registration. However, if there are none, an error message will appear.
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
                
                //Se você selecionar 4 irá mostrar todos os cadastros existentes. Porem se não houver nenhum, aparecerá uma mensagem de erro
                //If you select 4 it will show all existing records. However, if there are none, an error message will appear.
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
                
                //Se você selecionar 5 você terá a opção de procurar o ID de algum usuário para ver seus dados. Porem se não houver nenhum, aparecerá uma mensagem de erro   
                //If you select 5 you will have the option to search for a user's ID to see their data. However, if there are none, an error message will appear.
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
                
                //Se você selecionar 6 irá mostrar os criadores do código (Eu + meu amigo de faculdade)
                //If you select 6 it will show the creators of the code (Me + my college friend)
                case 6:
                    System.out.println(
                            "Criadores: \n\nRaul Martins Rodrigues RA: 04722-030 \nEric D'Andrea Rapatão RA: 04722-035 \n");
                    break;
                
                //Se você selecionar 7 fecha o código
                //If you select 7 closes the code
                case 7:
                    System.out.println("Fechando o menu.");
                    break;
                
                //Se você selecionar nenhum dos 7 números, aparecerá essa mensagem
                //If you select none of the 7 numbers, this message will appear
                default:
                    System.err.println("Insira uma opção válida.");
                    break;
            }
          
        //Enquanto não for selecionado a opção 7, o código ficar rodando infinitamente
        //As long as option 7 is not selected, the code will run infinitely   
        } while (escolha != 7);
        sc.close();
    }
}
