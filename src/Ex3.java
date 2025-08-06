import java.util.Scanner;

//soma as 3 notas e divide por 3
public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3 / 3);

        System.out.println("Media: " + media);

    }
}
