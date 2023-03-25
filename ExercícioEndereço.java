import java.util.Scanner;

public class ExercícioEndereço {
    public static void main(String[] args) {
        System.out.println("-----CADASTRO DE USUÁRIOS-----");
        Scanner scanner = new Scanner(System.in);
        \r\n

        // Solicitar o nome completo do usuário
            System.out.print("Digite seu nome completo: ");
            String nome = scanner.nextLine();

        // Solicitar a rua
            System.out.print("Em qual rua você reside?: ");
            String rua = scanner.nextLine();

        // Solicitar o número
            System.out.print("Qual o número da sua residência?: ");
            String numero = scanner.nextLine();
            
        // Solicitar o bairro
            System.out.print("Em que bairro?: ");
            String bairro = scanner.nextLine();

        // Solicitar a cidade
            System.out.print("Em qual cidade?: ");
            String cidade = scanner.nextLine();

        // Solicitar o estado
            System.out.print("Em que estado?: ");
            String estado = scanner.nextLine();

        // Solicitar o CEP
            System.out.print("Qual o CEP da residência?: ");
            String cep = scanner.nextLine();

        // Exibir informações formatadas.
        System.lineSeparator();
        System.out.println("-----CADASTRO EFETUADO COM SUCESSO-----");
        System.lineSeparator();
        System.out.println("Abaixo os dados cadastrados em nosso sistema: ");
        System.out.println("Nome completo: " + nome);
        System.out.println("Reside no endereço: " + rua + ", " + numero + " - " + bairro + ", " + cidade + " - " + estado + " - CEP: " + cep);
    }
}
