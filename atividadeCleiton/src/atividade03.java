import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade03 {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o nome do Produto: ");
        String nomeProduto = terminal.nextLine();

        System.out.println("Digite o Valor do Produto: ");
        double valorProduto = terminal.nextDouble();

        System.out.println("Digite a quantidade do Produto: ");
        int quantidadeProduto = terminal.nextInt();

        System.out.println("Digite a Taxa de imposto sobre o Produto (em %) : ");
        double taxaSobreProduto = terminal.nextDouble() / 100;

        System.out.println("Digite a margem de Lucro do Produto (em %): ");
        double margemLucro = terminal.nextDouble() / 100;


        double valorsemImp = valorProduto * quantidadeProduto;

        double valorcomImp = valorsemImp * taxaSobreProduto;

        double valorTotalcomimp = valorsemImp + valorcomImp;

        double precoVenda = valorTotalcomimp * (1 + margemLucro);

        DecimalFormat dfMoeda = new DecimalFormat("R$: #,##0.00");

        String valorComImpostoFormatado = dfMoeda.format(valorcomImp);
        String precoVendaFormatado = dfMoeda.format(precoVenda);


        System.out.println("-------- Dados do Produto --------");

        System.out.println("Nome: " + nomeProduto);
        System.out.println("Valor do Produto: " + valorProduto);
        System.out.println("Quantidade do Produto: " + quantidadeProduto);
        System.out.println("Taxa sobre o Produto: " + (taxaSobreProduto * 100) + "%");
        System.out.println("Margem de Lucro do Produto: " + (margemLucro * 100) + "%");


        System.out.println("------- Calculo da Compra -------");

        System.out.println("Valor total sem imposto: " + dfMoeda.format(valorsemImp));
        System.out.println("Valor do Imposto: " + dfMoeda.format(valorcomImp));
        System.out.println("Valor total com Imposto: " + valorComImpostoFormatado);
        System.out.println("Preco de Venda sugerido: " + precoVendaFormatado);


    }
}
