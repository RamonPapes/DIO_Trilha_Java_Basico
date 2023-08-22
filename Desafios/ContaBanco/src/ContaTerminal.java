import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroAgencia = 0;
        String nomeAgencia = "";
        String nomeCliente = "";
        double saldo = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Agencia !");
        numeroAgencia = input.nextInt();
        
        // Método sendo utilizado para consumir o caractere de nova linha pendente
        input.nextLine();
        
        System.out.println("Por favor, digite o nome da Agencia !");
        nomeAgencia = input.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente !");
        nomeCliente = input.nextLine();
        
        System.out.println("Por favor, digite o valor do saldo da Conta !");
        saldo = input.nextDouble();
        
        input.close();
        
        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e " + nomeAgencia + ", conta " + numeroAgencia + " e seu saldo " + saldo +  " já está disponível para saque");
        
    }
}
