import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade11 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");


        System.out.println("Informe o Salario do Funcionario: ");
        double salarioBruto = sc.nextDouble();

        if (salarioBruto <= 0) {
            System.out.println("Salario Invalido");
            sc.close();
            return;
        }

        System.out.println("Informe os Anos Trabalhados");
        int anos = sc.nextInt();

        if (anos <= 0) {
            System.out.println("Numero de anos Invalido");
            sc.close();
            return;
        }


        double bonusAnosTrabalhado;
        double impostoSalarioBruto;

        if (anos >= 10) {
            bonusAnosTrabalhado = 0.10;
        } else if (anos >= 5) {
            bonusAnosTrabalhado = 0.05;
        }else  {
            bonusAnosTrabalhado = 0.0;
        }


        if (salarioBruto > 5000) {
            impostoSalarioBruto = 0.27;

        }else if (salarioBruto >= 3000)
        {
            impostoSalarioBruto = 0.18;
        }else {
            impostoSalarioBruto = 0.10;
        }


        double bonus = salarioBruto * bonusAnosTrabalhado;
        double imposto = salarioBruto * impostoSalarioBruto;
        double salarioLiquido = (salarioBruto + bonus) - imposto;


        System.out.println("======== Salario ========");
        System.out.println("Salario Bruto: " + df.format(salarioBruto));
        System.out.println("Bonus Recebido: " + df.format(bonus));
        System.out.println("Imposto Descontado: " + df.format(imposto));
        System.out.println("Salario Liquido: " + df.format(salarioLiquido));







    }

}
