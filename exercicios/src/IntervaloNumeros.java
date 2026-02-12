import java.util.Scanner;

public class IntervaloNumeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos valores você quer conferir: ");
        int n = sc.nextInt();

        int in = 0;
        int out = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in ++;
            }
            else {
                out ++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}