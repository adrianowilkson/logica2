import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        int n1;
        int n2;
        int choice;


        System.out.println("Bem-vindo à Calculadora.");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("Qual operação você quer fazer?");

        Scanner scanner = new Scanner(System.in);

        choice = Integer.parseInt(scanner.nextLine());


        if (choice == 1) {
            System.out.println("Você escolheu SOMAR.");
            System.out.println("Digite o primeiro numero.");
            n1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Digite o segundo numero.");
            n2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Calculando...");
            System.out.println("Resultado: ");
            sum(n1, n2);
        } else if (choice == 2) {
            System.out.println("Você escolheu SUBTRAIR.");
            System.out.println("Digite o primeiro numero.");
            n1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Digite o segundo numero.");
            n2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Calculando...");
            System.out.println("Resultado: ");
            minus(n1, n2);
        } else if (choice == 3) {
            System.out.println("Você escolheu MULTIPLICAR.");
            System.out.println("Digite o primeiro numero.");
            n1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Digite o segundo numero.");
            n2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Calculando...");
            System.out.println("Resultado: ");
            times(n1, n2);

        } else if (choice == 4) {
            System.out.println("Você escolheu DIVIDIR.");
            System.out.println("Digite o primeiro numero.");
            n1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Digite o segundo numero.");
            n2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Calculando...");
            System.out.println("Resultado: ");
            divide(n1, n2);

        }
        else {
            System.out.println("Escolha inválida. Tente outra vez...");
        }
    }


    static void sum(int x, int y){
        System.out.println(x + y);
    }
    static void minus(int x, int y) {
        System.out.println(x - y);
    }
    static void times(int x, int y) {
        System.out.println(x * y);
    }
    static void divide(int x, int y) {
        System.out.println(x / y);
    }

}
