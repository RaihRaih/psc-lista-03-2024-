/*Raissa Rodrigues - Sistemas de Informação
* 1. . Escreva o algoritmo de uma máquina de venda automática de salgadinhos, doces, sucos e refrigerantes. O algoritmo deve calcular o menor número 
de notas que deve ser dado de troco para um pagamento efetuado. O algoritmo deve ler o valor da compra e o valor pago. Se o valor pago for menor que
o valor da compra, a máquina deve apresentar uma mensagem, informando que a quantia paga é insuficiente para realizar a compra. A máquina aceita apenas 
notas de: R$ 50,00, R$ 20,00, R$ 10,00, R$ 5,00, R$ 2,00 e R$ 1,00.*/

import java.util.Scanner;

public class MaquinaVendas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorCompra, valorPago, troco;
        int quantidade;
        int[] notas = {50, 20, 10, 5, 2, 1};

        // Ler o valor da compra e o valor pago
        System.out.print("Digite o valor da compra: ");
        valorCompra = scanner.nextDouble();

        System.out.print("Digite o valor pago: ");
        valorPago = scanner.nextDouble();

        // Calcular o troco
        troco = valorPago - valorCompra;

        // Verificar se o valor pago é suficiente
        if (troco < 0) {
            System.out.println("Quantia paga é insuficiente para realizar a compra.");
            return;
        }

        // Iterar sobre as notas disponíveis
        for (int nota : notas) {
            // Calcular a quantidade de notas necessárias
            quantidade = (int) (troco / nota);
            // Se a quantidade for maior que zero, entregar a quantidade de notas
            if (quantidade > 0) {
                System.out.println("Entregar " + quantidade + " nota(s) de R$ " + nota);
                // Atualizar o valor do troco
                troco %= nota;
            }
        }
        // Verificar se ainda há troco restante
        if (troco > 0) {
            System.out.println("Não é possível fornecer o troco exato.");
        } else {
            System.out.println("Troco fornecido com sucesso.");
        }

        scanner.close();
    }
}
