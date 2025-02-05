import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            Integer numeroConta;
            String agenciaConta;
            String nomeCliente;
            Double saldoConta;

            System.out.println("Digite o número da conta:");
            numeroConta = scanner.nextInt();

            System.out.println("Digite a agência da conta:");
            agenciaConta = scanner.next();

            System.out.println("Digite o nome do cliente:");
            nomeCliente = scanner.nextLine();
            nomeCliente += scanner.nextLine();

            System.out.println("Digite o saldo da conta:");
            saldoConta = scanner.nextDouble();

            System.out.println("Conta criada com sucesso!");
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso Banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo " + saldoConta + " ja está disponível para saque.");
        }

    }
}