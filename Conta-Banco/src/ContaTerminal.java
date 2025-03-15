import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        Scanner ler = new Scanner(System.in);
        String nome, agencia;
        //Exibir as mensagens para o nosso usuário
        System.out.print("Digite o seu nome: ");
        nome = ler.nextLine();

        System.out.print("Digite o número da agência: ");
        agencia = ler.nextLine();

        System.out.print("Digite o número da conta: ");
        int num = ler.nextInt();

        System.out.print("Informe o saldo da conta: ");
        double saldo = ler.nextDouble();

        System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                            agencia + ", conta " + num + " e seu saldo " + saldo + " já está disponível para saque.");

        // "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
    }
}
