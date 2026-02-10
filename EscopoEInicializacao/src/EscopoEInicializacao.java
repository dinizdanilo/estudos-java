public class EscopoEInicializacao {

    public static void main (String[] args) {

        double price = 400.00;



//        if (price < 200) {
//            double discount = price * 0.1;
//        }
//
//       variavel fora do escopo
//

        double discount;

        if (price < 200) {
            discount = price * 0.1;
        }
        else {
            discount = 0;
        }
        System.out.println(discount);

//         inicialização

//        erro por não atribuição da variavel
//        double price;
//        System.out.println(price);

        System.out.println(price);
    }
}
