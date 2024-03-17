/*Raissa Rodrigues - Sistemas de Informação
* 1. Escreva um algoritmo que leia 3 números a partir do teclado.
O algoritmo deve apresentar:
 */
import java.util.Scanner;

public class TresNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1, numero2, numero3, media, maior, menor;

        System.out.println("Digite tres numeros: ");
        System.out.println("numero 1: ");
        numero1 = scanner.nextDouble();
        System.out.println("numero 2: ");
        numero2 = scanner.nextDouble();
        System.out.println("numero 3: ");
        numero3 = scanner.nextDouble();

        media = (numero1 + numero2 + numero3) / 3;

        maior = numero1;
        if (numero2 > maior) {
            maior = numero2;
        }
        if (numero3 > maior) {
            maior = numero3;
        }

        menor = numero1;
        if (numero2 < menor) {
            menor = numero2;
        }
        if (numero3 < menor) {
            menor = numero3;
        }

        System.out.println("O maior número é: " + maior + "\nO menor número é: " + menor + "\nA média aritmética é: " + media);

        scanner.close();
    }
}
