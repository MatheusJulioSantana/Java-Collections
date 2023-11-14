package collection;

import java.util.Scanner;
import java.util.Stack;

public class ExPilha01 {

	public static void main(String[] args) {
		int op;
		Scanner input = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<String>();
		
		do {
		
		
		 System.out.println("\n\t\tMenu da biblioteca");
         System.out.println("\n-----------------------------------------------------------");
         System.out.println("\n(1) Adicionar livro.");
         System.out.println("\n(2) Listar todos os livros da pilha");
         System.out.println("\n(3) Retirar livro da pilha");
         System.out.println("\n(0) Sair");
         System.out.println("\n-----------------------------------------------------------");
         System.out.println("\nDigite sua opção: ");
         op = input.nextInt();
         switch (op) {
         case 1:
             input.nextLine();
             System.out.println("\nDigite o nome do livro: ");
             String livro = input.nextLine();
             pilha.add(livro);
             System.out.println("\nLivro adicionado!");
             break;
         case 2:
             input.nextLine();
             System.out.println("\nOs livros na pilha são:");
             System.out.println(pilha);
             break;
         case 3:
        	 input.nextLine();
             if (pilha.isEmpty()) {
                 System.out.println("\nA pilha está vazia.");
             } else {
                 input.nextLine();
                 pilha.pop();
                 System.out.println("\nLivro removido da pilha!");
             }
             break;
         case 0:
        	 input.nextLine();
             System.out.println("\nMuito obrigado por utilizar o serviço");
             break;
        default:
        	input.nextLine();
        	System.out.println("Opção inválida");
	}
		}while (op != 0);
    }
}
