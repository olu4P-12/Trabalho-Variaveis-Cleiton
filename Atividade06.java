import java.util.Scanner;

public class Atividade06 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a Media do Aluno: ");
        double mediaAluno = sc.nextDouble();

        if(mediaAluno >= 7){
            System.out.println("Aprovado");
        }else if(mediaAluno >= 5 && mediaAluno <= 7){
            System.out.println("Recuperaçao");
        }else if (mediaAluno < 5){
            System.out.println("Reprovado");
        }




    }
}
