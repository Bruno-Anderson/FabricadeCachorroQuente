package vendadecachorroquente;

import java.util.Scanner;

public class MinhaMain {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Bem-vindo ao sistema de pedidos de cachorro-quente!");
	        
	        System.out.print("Digite seu nome: ");
	        String nome = scanner.nextLine();
	        
	        System.out.print("Digite sua matricula: ");
	        int matricula = scanner.nextInt();
	        
	        System.out.print("Quantos cachorros-quentes voce deseja pedir? ");
	        int quantidade = scanner.nextInt();
	        scanner.nextLine(); // Consumir a quebra de linha
	        
	        System.out.println("\nMonte seu cachorro-quente personalizado:");

	        for (int i = 1; i <= quantidade; i++) {
	            System.out.println("Cachorro-quente " + i + ":");
	            
	            System.out.print("Proteina (salsicha, linguiça, frango, bacon): ");
	            String proteina = scanner.nextLine();
	            
	            System.out.print("Queijo (mussarela, prato, parmesao, coalho): ");
	            String queijo = scanner.nextLine();
	            
	            System.out.print("Escolha a bebida (Coca-cola, Del Rio, Suco do Chaves): ");
	            String bebida = scanner.nextLine();
	            
	            System.out.print("Adicionar Maionese (sim/nao): ");
	            boolean maionese = scanner.nextLine().equalsIgnoreCase("sim");
	            
	            System.out.print("Adicionar Ketchup (sim/nao): ");
	            boolean ketchup = scanner.nextLine().equalsIgnoreCase("sim");
	            
	            System.out.print("Adicionar Ovo (sim/nao): ");
	            boolean ovo = scanner.nextLine().equalsIgnoreCase("sim");
	            
	            System.out.print("Adicionar Batata Frita (sim/nao): ");
	            boolean batataFrita = scanner.nextLine().equalsIgnoreCase("sim");
	            
	            System.out.println("\nResumo do Cachorro-quente " + i + ":");
	            System.out.println("Proteina: " + proteina);
	            System.out.println("Queijo: " + queijo);
	            System.out.println("Bebida: " + bebida);
	            System.out.println("Complementos: " +
	                    (maionese ? "Maionese; " : "") +
	                    (ketchup ? "Ketchup; " : "") +
	                    (ovo ? "Ovo; " : "") +
	                    (batataFrita ? "Batata Frita;" : ""));
	        }

	        System.out.println("\nObrigado por fazer seu pedido! Tenha um otimo dia!");
	        scanner.close();
	    }
	}
