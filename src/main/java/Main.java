import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int entrada = sc.nextInt();

        for(int i = 0; i < entrada; i++){
            System.out.print("Digite um valor para media 1: ");
            double valorUm = sc.nextDouble();
            System.out.print("Digite um valor para media 2: ");
            double valorDois = sc.nextDouble();
            System.out.print("Digite um valor para media 3: ");
            double valorTres = sc.nextDouble();

            double media = (valorUm * 2.0 + valorDois * 3.0 + valorTres * 5.0) / 10;
            System.out.printf("Valores da media: %.1f\n", media);
        }

        sc.close();
    }
}
