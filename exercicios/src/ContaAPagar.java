import java.util.Scanner;

public class ContaAPagar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 ----- Cachorro Quente\n" +
                "2 ----- X-Salada\n" +
                "3 ----- X-Bacon\n" +
                "4 ----- Torrada simples\n" +
                "5 ----- Refrigerante\n"
        );

        System.out.print("Qual item você deseja?: ");
        int item = sc.nextInt();

        System.out.print("\nDigite a quantidade de itens que você deseja: ");
        int qtd = sc.nextInt();

        if (item < 1 || item > 5){
            System.out.println("Digite um válor válido");
            return;
        }

        double valor, valorTotal;

            if (item == 1) {
                valor = 4;
            } else if (item == 2) {
                valor = 4.5;
            } else if (item == 3) {
                valor = 5;
            } else if (item == 4) {
                 valor = 2;
            } else {
                 valor = 1.5;
            }

        valorTotal = valor * qtd;
        System.out.printf("\nO valor total da conta foi de %.2f", valorTotal);
    }
}