import java.util.Scanner;

public class Senha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.print("Senha inválida. Digite novamente: ");
            senha = sc.nextInt();
        }

        System.out.print(("Acesso pertmitido."));
    }
}
