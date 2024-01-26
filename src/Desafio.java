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
        }
    }
}
