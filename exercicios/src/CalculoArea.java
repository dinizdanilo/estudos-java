import java.util.Locale;
import java.util.Scanner;

public class CalculoArea {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;

        System.out.print("Qual o valor de A?: ");
        A = sc.nextDouble();

        System.out.printf("%nQual o valor de B?: ");
        B = sc.nextDouble();

        System.out.printf("%nQual o valor de C?: ");
        C = sc.nextDouble();

        sc.close();

        double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo, pi;
        pi = 3.14159;

        areaTriangulo =  (A * C) / 2;
        areaCirculo = pi * (C * C);
        areaTrapezio = ((A + B) * C) / 2;
        areaQuadrado = B * B;
        areaRetangulo = A * B;

        System.out.printf("%nÁrea do triângulo: %.3f", areaTriangulo);
        System.out.printf("%nÁrea do círculo: %.3f", areaCirculo);
        System.out.printf("%nÁrea do trapézio: %.3f", areaTrapezio);
        System.out.printf("%nÁrea do quadrado: %.3f", areaQuadrado);
        System.out.printf("%nÁrea do retângulo: %.3f", areaRetangulo);
    }
}
