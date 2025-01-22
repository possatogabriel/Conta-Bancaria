import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Escreva seu nome: ");
        String nomePessoa = input.nextLine();

        System.out.printf("Escreva seu saldo inicial: ");
        double saldo = input.nextDouble();

        int opcao = 0;

        String contaBancaria = """
                
                **************************************
                Nome: %s
                Tipo de conta: Corrente
                Saldo: %.2f
                **************************************""".formatted(nomePessoa, saldo);

        String mensagemOpcoes = """
                    
                Operações: 
                    
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Atualizar nome
                5 - Mostrar conta bancária 
                6 - Sair
                    
                Digite a opção desejada: """;

        System.out.println(contaBancaria);

        System.out.println();
        System.out.printf("Pressione 0 para continuar: ");
        int primeiroContinuar = input.nextInt();

        while (opcao != 6) {
            System.out.printf(mensagemOpcoes);
            opcao = input.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é: " + saldo);

                System.out.println();
                System.out.printf("Pressione 0 para continuar: ");
                int continuar = input.nextInt();
            }

            else if (opcao == 2) {
                System.out.println();
                 System.out.printf("Insira o valor a ser RECEBIDO: ");
                 double valorRecebido = input.nextDouble();

                 saldo += valorRecebido;
                 System.out.println("Novo saldo: " + saldo);

                System.out.println();
                System.out.printf("Pressione 0 para continuar: ");
                int continuar = input.nextInt();
            }

            else if (opcao == 3) {
                System.out.println();
                System.out.printf("Insira o valor a ser TRANSFERIDO: ");
                double valorTransferido = input.nextDouble();

                if (valorTransferido > saldo) {
                    System.out.println("Não é possível realizar essa transferência, tente novamente!");

                    System.out.println();
                    System.out.printf("Pressione 0 para continuar: ");
                    int continuar = input.nextInt();
                } else {
                    saldo -= valorTransferido;
                    System.out.println("Novo saldo: " + saldo);

                    System.out.println();
                    System.out.printf("Pressione 0 para continuar: ");
                    int continuar = input.nextInt();
                }
            }

            else if (opcao == 4) {
                System.out.println();

                System.out.printf("Digite o novo nome: ");
                nomePessoa = input.next();
                System.out.println("O novo nome é: " + nomePessoa);

                System.out.println();
                System.out.printf("Pressione 0 para continuar: ");
                int continuar = input.nextInt();
            }

            else if (opcao == 5) {
                String contaBancariaAtualizada = """
                **************************************
                Nome: %s
                Tipo de conta: Corrente
                Saldo: %.2f
                **************************************""".formatted(nomePessoa, saldo);
                System.out.println(contaBancariaAtualizada);

                System.out.println();
                System.out.printf("Pressione 0 para continuar: ");
                int continuar = input.nextInt();
            }

            else {
                System.out.println("Programa encerrado.");
                break;
            }
        }
    }
}