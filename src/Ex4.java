import java.util.Scanner;

//verifigue se o numero he par ou impar
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.print("Par");
        } else {
            System.out.print("Impar");
        }
    }
}
