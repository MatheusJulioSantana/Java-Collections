package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExSet01 {

    public static void main(String[] args) {
        Set<Integer> valores = new HashSet<Integer>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("\nDigite o valor número " + (i + 1));
            int valor = input.nextInt();
            valores.add(valor);
        }

        Iterator<Integer> iValores = valores.iterator();
        System.out.print("\nOs números no set são: ");
        
        while (iValores.hasNext()) {
            System.out.print(iValores.next() + " ");
        }
    }
}