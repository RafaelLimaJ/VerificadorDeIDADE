import java.util.Scanner;

class CadastroUsuario {

    public static void cadastrarUsuario(String nome, int idade) throws IdadeInvalidaException {
        if (idade < 18) {
            throw new IdadeInvalidaException("O usuário precisa ser maior de idade para se cadastrar.");
        } else {
            System.out.println("usuário " + nome + ", foi cadastrado com sucesso.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        try {
            cadastrarUsuario(nome, idade);

        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Processo de cadastro finalizado.");
        }

        scanner.close();
    }
}