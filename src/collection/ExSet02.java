package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExSet02 {

    public static void main(String[] args) {
        Set<Integer> valores = new HashSet<>();
        int palpite;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("\nDigite o valor número " + (i + 1));
            int valor = input.nextInt();
            valores.add(valor);
        }

        System.out.println("\nDigite o número que deseja encontrar: ");
        palpite = input.nextInt();

        // Verifica se o palpite está no conjunto
        boolean encontrado = valores.contains(palpite);

        if (encontrado) {
            System.out.println("O número " + palpite + " foi encontrado.");
        } else {
            System.out.println("Número não encontrado.");
        }
    }
}
