import java.util.Scanner;

public class VerificarIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        try {
            if (idade < 18){
                throw new IdadeInvalidaException("Idade invalida");
            }
            else{
                System.out.println("Ola " + nome);
            }
        }
        catch (IdadeInvalidaException e) {
            System.out.println("IDADE INVALIDA");
        }
        finally {
            System.out.println("Cadastro finalizado");
        }
    }
}
