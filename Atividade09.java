import java.util.Scanner;

public class Atividade09 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = input.nextInt();

        if (numero > 0) {
            System.out.println("Positivo");
        }else if (numero < 0) {
            System.out.println("Negativo");
        } else if (numero == 0) {
            System.out.println("Zero");
        }




    }


}
