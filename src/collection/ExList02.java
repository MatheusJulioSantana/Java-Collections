package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExList02 {

    public static void main(String[] args) {
        List<Integer> listaNum = new ArrayList<Integer>();
        int palpite;
        Scanner input = new Scanner(System.in);

        listaNum.addAll(List.of(2, 5, 1, 3, 4, 9, 7, 8, 10, 6)); // Adiciona diversos valores de uma vez

        System.out.println("\nDigite o número que deseja encontrar: ");
        palpite = input.nextInt();

        // Verifica se o palpite está na lista
        boolean encontrado = listaNum.contains(palpite);

        if (encontrado) {
            int posicao = listaNum.indexOf(palpite);
            System.out.println("O número " + palpite + " foi encontrado na posição " + posicao + " da lista.");
        } else {
            System.out.println("Número não encontrado na lista.");
        }
    }
}

		