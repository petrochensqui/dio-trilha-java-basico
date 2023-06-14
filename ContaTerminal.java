import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println( "Digite nome do Cliente:");
            String nomecliente = scanner.next();

            System.out.println("Digite a gencia da conta: ");
            String agencia = scanner.next();

            System.out.println("Digite o numero da conta: ");
            int conta = scanner.nextInt();

            System.out.println("Saldo a depositar: ");
            Float saldo = scanner.nextFloat();


            System.out.println( "Olá " + nomecliente +",obrigado por criar uma conta em nosso banco,sua agencia é " + agencia + 
             ",conta " + conta + ",e seu saldo " + saldo + " ja esta disponivel para saque!");
        }

        
    }
}