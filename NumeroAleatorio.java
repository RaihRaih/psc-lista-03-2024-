/*Raissa Rodrigues - Sistemas de Informação
* 6. Crie um algoritmo que leia dois números inteiros e realize o sorteio de um número aleatório. O algoritmo deve validar qual é o 
menor e o maior número informado pelo teclado, para que independente da ordem que o usuário digite os números, consiga realizar o sorteio.
Se o algoritmo gerar um número par, escreva na tela o número gerado e informe que ele é par. Se o algoritmo gerar um número ímpar, escreva na tela
o número gerado e que ele é um número ímpar.*/

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numero1, numero2, menor, maior, numeroSorteado;

        System.out.print("Digite o primeiro número inteiro: ");
        numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        numero2 = scanner.nextInt();

        menor = Math.min(numero1, numero2);
        maior = Math.max(numero1, numero2);

        numeroSorteado = random.nextInt(maior - menor + 1) + menor;

        System.out.println("Número sorteado: " + numeroSorteado);

        if (numeroSorteado % 2 == 0) {
            System.out.println("O número sorteado é par.");
        } else {
            System.out.println("O número sorteado é ímpar.");
        }

        scanner.close();
    }
}
