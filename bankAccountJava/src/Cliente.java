import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeDoCliente = "Gustavo Villeth";
        String tipoDeConta = " Corrente ";
        int saldoInicial =  25000 ;

        System.out.println("**************************");
        System.out.println("Dados iniciais do client:");
        System.out.println("Nome:" + nomeDoCliente);
        System.out.println("Tipo da conta" + tipoDeConta);
        System.out.println(" Saldo da conta " + saldoInicial);
        System.out.println("**************************");

        int opcao;
        do {
            System.out.println("\nOperações\n");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Fechar o aplicativo!");
            System.out.print("\nDigite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(" Saldo atual: R$ " + saldoInicial);
                    break;
                case 2:
                    System.out.print("Digite o valor a receber: ");
                    double valorRecebido = scanner.nextDouble();
                    saldoInicial += valorRecebido;
                    System.out.println("Valor recebido com sucesso. Saldo atual: R$ " + saldoInicial);
                    break;
                case 3:
                    System.out.print("Digite o valor a transferir: ");
                    double valorTransferir = scanner.nextDouble();
                    if (valorTransferir <= saldoInicial) {
                        saldoInicial -= valorTransferir;
                        System.out.println("Transferência realizada com sucesso! Saldo atual: R$ " + saldoInicial);
                    } else {
                        System.out.println("Saldo insuficiente para completar a  transferência.");
                    }
                    break;
                case 4:
                    System.out.println("Fechando o programa.");
                    break;
                default:
                    System.out.println("Opção invalida. Digite novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}



