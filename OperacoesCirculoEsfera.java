  /*Raissa Rodrigues - Sistemas de Informação
 * 4.. Escreva um algoritmo que leia dois valores: o primeiro servindo de indicador de
operação e o segundo correspondendo ao raio de um círculo ou esfera. */
import java.util.Scanner;

public class OperacoesCirculoEsfera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio, perimetro, area, volume;

        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Calcular perímetro do círculo");
        System.out.println("2 - Calcular área do círculo");
        System.out.println("3 - Calcular volume da esfera");
        System.out.print("Opção: ");
        int codigoOperacao = scanner.nextInt();

        switch (codigoOperacao) {
            case 1:
                System.out.print("Digite o raio do círculo: ");
                raio = scanner.nextDouble();
                perimetro = 2 * Math.PI * raio;
                System.out.println("Perímetro do círculo: " + perimetro);
                break;
            case 2:
                System.out.print("Digite o raio do círculo: ");
                raio = scanner.nextDouble();
                area = Math.PI * raio * raio;
                System.out.println("Área do círculo: " + area);
                break;
            case 3:
                System.out.print("Digite o raio da esfera: ");
                raio = scanner.nextDouble();
                volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
                System.out.println("Volume da esfera: " + volume);
                break;
            default:
                System.out.println("Código da operação inválido. Por favor, escolha entre 1, 2 ou 3.");
        }

        scanner.close();
    }
}
