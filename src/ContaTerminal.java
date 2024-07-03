import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        int numero = scanner.nextInt();

        System.out.println("Agora, por favor, digite o nome da Agência que o senhor deseja: ");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Digite o seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        double saldo = 250;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo " + saldo + " reais já está disponível para saque. ");

    }
}
