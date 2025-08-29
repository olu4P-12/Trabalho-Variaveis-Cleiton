import java.util.Scanner;

public class Atividade08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        int temp = input.nextInt();

        if (temp >= 30) {
            System.out.println("Quente");
        }else if (temp > 15 && temp <= 30) {
            System.out.println("Razoavel");
        }else if (temp < 15) {
            System.out.println("Frio");
        }


    }
}
