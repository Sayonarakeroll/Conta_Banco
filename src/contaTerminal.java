import java.util.Scanner;

public class contaTerminal {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite o numero da Agencia: ");
        String numAgencia = scanner.nextLine();

        System.out.println("Digite o numero da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial");
        double saldo = scanner.nextDouble();


        System.out.println(" Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência- " + numAgencia + ", conta- " + numeroConta + " e seu saldo - $" + saldo + " já está disponível para saque.");


        scanner.close();
    }
}