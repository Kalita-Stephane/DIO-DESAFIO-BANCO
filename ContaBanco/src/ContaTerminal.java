import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args)  {
        System.out.println("----------Bem Vindo ao Banco KLLIV ------------------------");
        Scanner scanner = new Scanner(System.in);
        int numeroConta;
        String agencia;
        String nome;
        double saldo;
        System.out.print("Digite seu nome:");
        nome = scanner.nextLine();
        System.out.print("Digite a agencia Bancaria:");
        agencia = scanner.nextLine();
        System.out.print("Digite o numero da conta:");
        numeroConta = scanner.nextInt();
        System.out.print("Digite seu Saldo:");
        saldo = scanner.nextDouble();
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " 
        + agencia +  " conta: " + numeroConta + " e seu saldo no valor de: " + saldo + " já está disponível para saque");
        
    }
}
