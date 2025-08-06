import java.util.Scanner;

//Verifique se o numero eh positivo negativo ou zero
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            System.out.print("Maior");
        } else if (n < 0) {
            System.out.print("Menor");

        } else {
            System.out.print("zero");
        }
    }
}
