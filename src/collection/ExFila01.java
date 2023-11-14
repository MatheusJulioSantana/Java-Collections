package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExFila01 {

	public static void main(String[] args) {
		int op;
		Scanner input = new Scanner(System.in);
		
		Queue<String> clientes = new LinkedList<String>();
		
		do {
		
		
		 System.out.println("\n\t\tMenu de clientes");
         System.out.println("\n-----------------------------------------------------------");
         System.out.println("\n(1) Adicionar cliente.");
         System.out.println("\n(2) Listar todos os clientes");
         System.out.println("\n(3) Retirar cliente da fila");
         System.out.println("\n(0) Sair");
         System.out.println("\n-----------------------------------------------------------");
         System.out.println("\nDigite sua opção: ");
         op = input.nextInt();
         switch (op) {
         case 1:
             input.nextLine();
             System.out.println("\nDigite o nome do cliente: ");
             String cliente = input.nextLine();
             clientes.add(cliente);
             break;
         case 2:
             input.nextLine();
             System.out.println("\nOs clientes na fila são:");
             System.out.println(clientes);
             break;
         case 3:
        	 input.nextLine();
        	 clientes.remove();
        	 System.out.println("\n O cliente foi chamado");
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
