import java.util.Scanner;

//Calcule a area de um circulo
//Explicação: Fórmula da área: π * raio².
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);

        System.out.print("Area: " + area);


    }
}
