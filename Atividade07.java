import java.util.Scanner;

public class Atividade07 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o Primeiro Numero");
        int primeiroNumero = sc.nextInt();
        System.out.println("Digite o Segundo Numero");
        int segundoNumero = sc.nextInt();


        int adicao = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;
        int divisao = primeiroNumero / segundoNumero;

        System.out.println("======== Escolha uma Operaçao ========  " +
                "  1 - Adiçao" +
                "  2 - Subtraçao" +
                "  3 - Multiplicaçao" +
                "  4 - Divisao");

        System.out.println("Escolha sua operaçao: ");
        int operacao = sc.nextInt();

        if (operacao == 1) {
            System.out.println("O resultado da sua Operaçao é: " + adicao);
        } else if (operacao == 2) {
            System.out.println("O resultado da sua Operaçao é: " +  subtracao);
        }else if (operacao == 3) {
            System.out.println("O resultado da sua Operaçao é: "  +  multiplicacao);
        }else if (operacao == 4) {
            System.out.println("O resultado da sua Operaçao é: "  +  divisao);
        }


    }
}


