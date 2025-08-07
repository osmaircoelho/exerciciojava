import java.util.Scanner;

// Leia a idade e diga se é maior de idade.
public class Ex9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("Voce eh maior de idade, sua idade eh: "+idade);
        }else{
            System.out.println("Voce eh menor de idade, sua idade eh: "+idade);
        }
    }
}
