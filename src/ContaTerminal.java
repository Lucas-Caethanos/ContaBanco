import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("🏦 Bem-vindo ao programa ContaTerminal! \n");

            System.out.print("➡️ Digite seu nome: ");
            String nomeCliente = input.nextLine();

            System.out.print("➡️ Digite o número da Agência: ");
            String agencia = input.nextLine();

            System.out.print("➡️ Digite o número da conta: ");
            int numero = input.nextInt();

            System.out.print("➡️ Digite o saldo da sua conta: ");
            float saldo = input.nextFloat();

            System.out.println("\n✅ Conta criada com sucesso!\n");

            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
        }
    }
}
