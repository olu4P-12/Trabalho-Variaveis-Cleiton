import java.util.Scanner;

public class Atividade03 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        if(numero%2==0){
            System.out.println("O numero: " + numero + " é PAR");
        }else{
            System.out.println("O numero: " + numero + " é IMPAR");

        }

    }
}
