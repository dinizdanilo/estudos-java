import java.util.Scanner;

public class DiferencaProduto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro primeiro valor (A): ");
        int A = sc.nextInt();

        System.out.print("Digite o segundo valor (B): ");
        int B = sc.nextInt();

        System.out.print("Digite o terceiro valor (C): ");
        int C = sc.nextInt();

        System.out.print("Digite o quarto valor (D): ");
        int D = sc.nextInt();

        sc.close();

        int DIFERENCA = ((A * B) - (C * D));

        System.out.printf("%n A diferença dos produtos é =  %d", DIFERENCA);
    }
}