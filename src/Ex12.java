import java.util.Scanner;

//Calcule o IMC
public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso = sc.nextDouble();
        double altura = sc.nextDouble();
        double imc = (peso / (altura * altura));

        System.out.printf("IMC: %.2f", imc);

        if (imc <= 18.5) {
            System.out.println("\n\nMagreza");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("\n\nNormal");
        } else if (imc > 25 && imc <= 29.9) {
            System.out.println("\n\nSobrepeso");
        } else if (imc > 30 && imc <= 34.9) {
            System.out.println("\n\nObesidade grau I");
        } else if (imc > 35 && imc <= 39.9) {
            System.out.println("\n\nObesidade grau II");
        } else if (imc >= 40) {
            System.out.println("\n\nObesidade grau III");
        }
    }
}
