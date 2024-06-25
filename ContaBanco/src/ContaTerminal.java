import java.util.Scanner;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TO DO: Conhecer e importar a classe scanner 
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Digite o número da conta: "); // Solicita ao usuário para digitar número da conta
        int numero = sc.nextInt(); // le a entrada do numero da conta
       
        sc.nextLine(); // consome nova linha

        System.out.println("Digite o número da agência: "); // Solicita ao usuário para digitar número da agencia
        String agencia = sc.nextLine(); //le a entrada do numero da agencia
        
        System.out.println("Digite o seu nome: "); // Solicita ao usuário para digitar seu nome
        String nomeCliente = sc.nextLine();  // le a entrada do nome do cliente
        
        System.out.println("Digite seu saldo: "); // Solicita ao usuário para digitar o saldo
        String saldoStr = sc.nextLine(); // le a entrada do saldo

        BigDecimal saldo = new BigDecimal(saldoStr); // Converte a String para BigDecimal

        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale ("pt", "BR")); //Formata valor para moeda
        String saldoFormatado = nf.format(saldo); // formata BigDecimal para moeda

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numero + " e seu saldo é " + saldoFormatado + ", ja está disponível para saque");

        sc.close();
    }
}
