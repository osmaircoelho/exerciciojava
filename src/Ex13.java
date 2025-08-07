import java.util.Scanner;

// Leia um caractere e diga se é vogal ou consoante.
public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra = sc.next().toLowerCase().charAt(0);
        String vogal = "aeiou";

        if (vogal.indexOf(letra) != -1){
            System.out.println("Vogal");
        } else{
            System.out.println("Consoante");
        }

    }
}
