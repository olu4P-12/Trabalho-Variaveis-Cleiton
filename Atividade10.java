import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        System.out.println("Insira o Valor Total da Compra");
        double total = input.nextDouble();

        double percentualDesconto;
        double valorDesconto;
        double valorFinal;

        if (total > 500) {
            percentualDesconto = 0.20;
        }else if (total >= 200) {
            percentualDesconto = 0.10;
        }else if (total >= 100) {
            percentualDesconto = 0.05;
        }else  {
            percentualDesconto = 0.0;
        }


        valorDesconto = total * percentualDesconto;
        valorFinal = total -  valorDesconto;


        System.out.println("============ Compra Finalizada ========");
        System.out.println("Valor Original da Compra: " + df.format(total));
        System.out.println("Percentual de Desconto: " + percentualDesconto * 100 + "%");
        System.out.println("Valor do Desconto: " + df.format(valorDesconto));
        System.out.println("Valor do Final: " + df.format(valorFinal));




    }

}
