/*Raissa Rodrigues - Sistemas de Informação 
 *5. Escrever um algoritmo que leia a partir do teclado dois números reais e um dos símbolos de operação: + , - , * , / ou ^ .
O algoritmo deve retornar o resultado da operação. Caso o símbolo informado seja diferente dos símbolos preestabelecidos, o algoritmo
deve apresentar uma mensagem de erro, informando que o símbolo da operação é inválido. */

import java.util.Scanner;

public class LerNumeroESimbolo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float numero1, numero2, resultado;
        char caractere;

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextFloat();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextFloat();

        System.out.println("Digite a operação que voce deseja fazer: ");
        caractere = scanner.next().charAt(0);

        switch (caractere) {
            case '+':

                resultado = numero1 + numero2;
                System.out.println("Resultado da soma de: " + numero1 + " + " + numero2 + ": " + resultado);

                break;

            case '-':

                resultado = numero1 - numero2;
                System.out.println("Resultado da subtracao de: " + numero1 + " - " + numero2 + ": " + resultado);

                break;

            case '*':

                resultado = numero1 * numero2;
                System.out.println("Resultado da multiplicão de: " + numero1 + " * " + numero2 + ": " + resultado);

                break;

            case '/':

                resultado = numero1 / numero2;
                System.out.println("Resultado da divisão de: " + numero1 + " / " + numero2 + ": " + resultado);

                break;

            case '^':

                resultado = (float) Math.pow(numero1, numero2);
                System.out.println("O numero: " + numero1 + " , elevado a: " + numero2 + ": " + resultado);

                break;

            default:
                System.out.println("Operação inválida.");

        }
    }
}
