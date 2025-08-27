import java.util.Scanner;

public class atividade01 {


    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = terminal.nextLine();

        System.out.println("informe sua Primeira idade: ");
        int primeiraIdade = terminal.nextInt();

        System.out.println("informe sua Segunda idade: ");
        int segundaIdade = terminal.nextInt();

        int somaIdade = primeiraIdade + segundaIdade;
        System.out.println("A soma das Idades sao: " + somaIdade);

        System.out.println("informe sua Altura em cm: ");
        double altura = terminal.nextDouble();

        double alturaX2 = altura * 2;
        System.out.println("Sua altura em dobro é: " + alturaX2);

        boolean usuarioEstudante = true;

        System.out.println("ola " + nome + "!" );



    }
}