import java.util.Scanner;

public class InteiroPositivo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor positivo: ");
        int N = sc.nextInt();
        while (N < 0) {
            System.out.print("Digite um valor positivo: ");
            N = sc.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(i);
            int quadrado = i * i;
            System.out.print(" " + quadrado);
            int cubo = i * i * i;
            System.out.println(" " +cubo);
        }
        sc.close();
    }
}