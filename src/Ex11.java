import java.util.Scanner;

//Troque os valores de duas variaveis
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + " b = " + b);

    }
}
