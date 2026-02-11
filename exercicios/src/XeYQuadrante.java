import java.util.Scanner;

public class XeYQuadrante {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            System.out.print("Digite o eixo X: ");
            int x = sc.nextInt();
            System.out.print("Digite o eixo Y: ");
            int y = sc.nextInt();

        while (x != 0  && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("Seus eixos estão no Quadrante 1.");
            } else if (x < 0 && y > 0) {
                System.out.println("Seus eixos estão no Quadrante 2.");
            } else if (x < 0 && y < 0) {
                System.out.println("Seus eixos estão no Quadrante 3.");
            }
            else {
                System.out.println("Seus eixos estão no Quadrante 4");
            }

            System.out.print("Digite o eixo X: ");
            x = sc.nextInt();
            System.out.print("Digite o eixo Y: ");
            y = sc.nextInt();
        }

        sc.close();
    }
}
