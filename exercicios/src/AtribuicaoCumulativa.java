import java.util.Locale;
import java.util.Scanner;

// +=, -=, /=, %=, *=

public class AtribuicaoCumulativa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os minutos: ");
        int minutos = sc.nextInt();

        double conta = 50;
        if (minutos > 100) {
            conta += (minutos - 100) * 2;
        }

        System.out.printf("A conta ficou %.2f%n", conta);

        sc.close();
    }
}
