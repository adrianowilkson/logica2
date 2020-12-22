public class main {
    public static void main(String[] args){
        Quadrado q1 = new Quadrado();
            q1.lado = 10.0;

        Quadrado q2 = new Quadrado();
            q2.lado = 15.5;

            System.out.println(q2.podeConter(q1));
            System.out.println(q1.podeConter(q2));

//            System.out.println("A area do quadrado 1 eh " + q1.calcularArea());
//            System.out.println("O perimetro do quadrado 1 eh " + q1.calcularPerimetro());
//
//
//            System.out.println("A area do quadrado 2 eh " + q2.calcularArea());
//            System.out.println("O perimetro do quadrado 2 eh " + q2.calcularPerimetro());
//
//
//
        Retangulo r1 = new Retangulo();
        r1.base = 10.0;
        r1.altura = 5.0;

        Retangulo r2 = new Retangulo();
        r2.base = 20.0;
        r2.altura = 10.0;

        System.out.println(r2.podeConter(r1));
        System.out.println(r1.podeConter(r2));

//            System.out.println("A area do retangulo eh " + r1.calcularArea());
//            System.out.println("O perimetro do retangulo eh " + r1.calcularPerimetro());
//
//
//        Circulo c1 = new Circulo();
//        c1.raio = 4.0;
//
//            System.out.println("A area do círculo é " + c1.calcularArea());
//            System.out.println("O perímetro do círculo é " + c1.calcularPerimetro());

   }


    }
