public class main {
    public static void main(String[] args) {

        Conta c1 = new Conta();
        c1.setNumero(1);
        c1.setLimite(1000.00);
        c1.saldo = 500.00;

        System.out.println("Saldo: " + c1.saldo);

        c1.sacar(600.00);

        System.out.println("Saldo: " + c1.getSaldo());

        c1.sacar(900.00);

        System.out.println("Saldo: " + c1.getSaldo());

        c1.sacar(100.00);

        System.out.println("Saldo: " + c1.getSaldo());



    }
}
//        Quadrado q1 = new Quadrado();
//            q1.setLado (10.0);
//
//        Quadrado q2 = new Quadrado();
//            q2.setLado (15.5);
//
//            System.out.println(q2.podeConter(q1));
//            System.out.println(q1.podeConter(q2));
//
//            System.out.println("A area do quadrado 1 eh " + q1.calcularArea());
//            System.out.println("O perimetro do quadrado 1 eh " + q1.calcularPerimetro());
//
//
//            System.out.println("A area do quadrado 2 eh " + q2.calcularArea());
//            System.out.println("O perimetro do quadrado 2 eh " + q2.calcularPerimetro());
//
//
//
//        Retangulo r1 = new Retangulo();
//        r1.setBase(10.0);
//        r1.setAltura(5.0);
//
//        Retangulo r2 = new Retangulo();
//        r2.setBase(20.00);
//        r2.setAltura(10.00);
//
//        System.out.println(r2.podeConter(r1));
//        System.out.println(r1.podeConter(r2));
//
//            System.out.println("A area do retangulo eh " + r1.calcularArea());
//            System.out.println("O perimetro do retangulo eh " + r1.calcularPerimetro());
//
//
//        Circulo c1 = new Circulo();
//        c1.setRaio(40.00);
//
//            System.out.println("A area do círculo é " + c1.calcularArea());
//            System.out.println("O perímetro do círculo é " + c1.calcularPerimetro());
//
//   }
//
//

