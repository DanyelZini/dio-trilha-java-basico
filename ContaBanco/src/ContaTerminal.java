import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        List<Conta> contas = new ArrayList<>();

        try (Scanner scan = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Bem vindo ao Banco Digital!");
            Integer opcao = 0;
            while (opcao != 3) {
                System.out.println("Menu:");
                System.out.println("1 - Criar conta");
                System.out.println("2 - Listar contas");
                System.out.println("3 - Sair");
                System.out.print("Escolha uma opção: ");
                
                if (scan.hasNextInt()) {
                    opcao = scan.nextInt();
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                    scan.next();
                    continue;
                }

                if (opcao == 2) {
                    for (Conta conta : contas) {
                        System.out.println("Conta: " + conta.getNumeroConta() + " Agência: " + conta.getAgenciaConta() + " Cliente: " + conta.getNomeCliente() + " Saldo: " + conta.getSaldoConta());
                    }
                } else if (opcao == 1) {
                    contas.add(criarConta(scan));
                } else if (opcao == 3) {
                    System.out.println("Saindo...");
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
    }

    public static Conta criarConta(Scanner scan) {
        Integer numeroConta;
        String agenciaConta;
        String nomeCliente;
        Double saldoConta;

        System.out.println("Digite o número da conta:");
        while (!scan.hasNextInt()) {
            System.out.println("Número da conta inválido. Tente novamente:");
            scan.next();
        }
        numeroConta = scan.nextInt();

        System.out.println("Digite a agência da conta:");
        agenciaConta = scan.next();

        System.out.println("Digite o nome do cliente:");
        nomeCliente = scan.next();

        System.out.println("Digite o saldo da conta:");
        while (!scan.hasNextDouble()) {
            System.out.println("Saldo inválido. Tente novamente:");
            scan.next();
        }
        saldoConta = scan.nextDouble();

        return new Conta(numeroConta, agenciaConta, nomeCliente, saldoConta);
    }
}