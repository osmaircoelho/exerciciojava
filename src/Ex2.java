import java.util.Scanner;

//leia dois numeros e imprima a soma
public class Ex2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Soma: "+(a+b));
    }
}
