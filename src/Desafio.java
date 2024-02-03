import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Nome de Exemplo";
        String tipoDeConta = "Conta Corrente";
        double saldo = 1599.99;

        System.out.println("****************************************");
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Tipo da Conta: " + tipoDeConta);
        System.out.println("Salto Atual: " + saldo);
        System.out.println("****************************************");

        String menu = """
                \n########################################
                *** Digite sua opção ***
                1 - Consultar Saldo
                2 - Sacar Valor
                3 - Depositar Valor
                4 - SAIR
                ########################################
                """;

        Scanner leitura = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo Atual: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja Transferir?");
                double valorSaida = leitura.nextDouble();
                if (valorSaida > saldo) {
                    System.out.println("Saldo insuficiente!!!");
                } else {
                    saldo = saldo - valorSaida;
                    System.out.println("Saldo Atualizado: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Qual o valor que deseja Depositar?");
                double valorEntrada = leitura.nextDouble();
                if (valorEntrada <= 0) {
                    System.out.println("Valor incorreto!!!");
                } else {
                    saldo = saldo + valorEntrada;
                    System.out.println("Saldo Atualizado: " + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Programa Finalizado");
            } else if (opcao != 4) {
                System.out.println("Opção Invalida");
            }
        }
    }
}
