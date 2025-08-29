import java.util.Scanner;

public class Atividade04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "Paulo";
        String senhaCorreta = "1234";


        System.out.println("Digite seu nome do Login: ");
        String usuarioDigitado = sc.nextLine();

        System.out.println("Digite sua Senha: ");
        String senhaDigitada = sc.nextLine();


        if (usuarioDigitado.equals(usuarioCorreto) && senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Login realizado com sucesso: " +  usuarioDigitado);
        }else {
            System.out.println("Login ou senha incorreto, Tente novamente");
        }

    }

}
