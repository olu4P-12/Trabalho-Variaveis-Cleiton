import java.util.Scanner;

public class atividade2 {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe o Nome do Funcionario: ");
        String nomeFuncionario = terminal.nextLine();

        System.out.println("Informe a Idade do Funcionario: ");
        int idadeFuncionario = terminal.nextInt();

        System.out.println("Informe o Salario Bruto do Funcionario: ");
        double salarioBruto = terminal.nextDouble();

        System.out.println("Informe a Quantidade de Messes Trabalhados: ");
        int messesTrabalhados = terminal.nextInt();

        int descontoInss = 120;

        double salarioLiquido =  (salarioBruto  * messesTrabalhados ) - (messesTrabalhados * descontoInss) ;
        System.out.println("Salario Liquido Anual: " + salarioLiquido);

        System.out.println("Informe a Quantidade de Produtos comprados: ");
        int quantidadeProdutos = terminal.nextInt();

        System.out.println("Qual o valor gasto com os Produtos: ");
        double valorGastop = terminal.nextDouble();

        double gastoProdutos = (quantidadeProdutos * valorGastop);


        System.out.println("Seu valor gasto com os Produtos é de: " + gastoProdutos);

        System.out.println("Ola Funcionario: " + nomeFuncionario);
        System.out.println("Seu salario Liquido Anual é de: " + salarioLiquido);


    }

}
