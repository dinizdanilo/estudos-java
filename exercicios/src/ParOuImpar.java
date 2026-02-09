import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        sc.close();

        if ((numero % 2) == 0) {
            System.out.printf("O número que %d é par!", numero);
        }
        else {
            System.out.printf("O número %d é ímpar!", numero);
        }
    }
}