import java.util.Scanner;

public class For {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.print("Digite o valor de N: ");
       int N = sc.nextInt();

       int soma = 0;
       for (int i = 0; i < N; i++) {
           int x = sc.nextInt();
           soma += x;
       }

       System.out.println(soma);
    }
}