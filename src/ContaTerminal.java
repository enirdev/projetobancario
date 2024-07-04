import java.util.Scanner;


public class ContaTerminal{
    public static void main(String[] args) {
        // Conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuario

        // Obter pela scanner os valores digitados no terminal

        // Exibir a mensagem da conta criada

     Scanner input = new Scanner(System.in);
            
            System.out.println("Por favor, digite o número da Agência:");
            String agencia = input.nextLine();
            
            System.out.println("Por favor, digite o número da Conta:");
            int numero = input.nextInt();
            
            input.nextLine(); // limpar o buffer
            
            System.out.println("Por favor, digite o nome do Cliente:");
            String nomeCliente = input.nextLine();
            
            System.out.println("Por favor, digite o saldo da conta:");
            double saldo = input.nextDouble();
            
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
            
            input.close();
        }



    }