import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Informe sua Idade:  ");
        int idade = sc.nextInt();

        if(idade >= 18){
            System.out.println("Maior de Idade");
        }else if(idade < 18){
            System.out.println("Menor de Idade");
        }

    }

}
