import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char opcao;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = C * 9 / 5 + 32;
            System.out.println("Equivalente em Farenheit: " + F);

            System.out.print("Deseja repetir? (s/n): ");
            opcao = sc.next().charAt(0);
        } while(opcao == 's');

        sc.close();
    }
}