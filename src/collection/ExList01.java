package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExList01 {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		
		Scanner input = new Scanner(System.in);
		
		
		for (int i=0;i<5;i++) {
		System.out.println("\nDigite uma cor pra ser adiciona a lista: ");
		String cor = input.nextLine();
		cores.add(cor);	
	}
		System.out.println("\n As cores listadas são: "+cores);
		Collections.sort(cores);
		System.out.println("\n Ordenas ficam: "+ cores);
}
}