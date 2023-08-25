import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
            int numero;
            String agencia, nomeCliente;
            double saldo = 237.48;

            Scanner sc = new Scanner(System.in);
            System.out.println("Por favor, digite o número da Agência! ");
            numero = sc.nextInt();

            sc.nextLine();

            System.out.println("Agora digite o número da Agência: ");
            agencia = sc.nextLine();

            System.out.println("Confirme seu nome, por gentileza: ");
            nomeCliente = sc.nextLine();

            sc.close();

            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);

    }
}
