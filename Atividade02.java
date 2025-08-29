import java.util.Scanner;

public class Atividade02 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do Aluno: ");
        double nota = sc.nextDouble();



        if (nota >= 9) {
            System.out.println("Exelente");
        } else if (nota >= 7) {
            System.out.println("Bom");
        } else if (nota >= 5) {
            System.out.println("Satisfatorio");
        } else if (nota < 5) {
        System.out.println("Insatisfatorio");
        }

    }
}
