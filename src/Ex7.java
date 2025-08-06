import java.util.Scanner;

//Converta graus Celsius para Fahrenheit.
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius = sc.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;

        System.out.println("Fahrenheit: " + fahrenheit);

    }
}
