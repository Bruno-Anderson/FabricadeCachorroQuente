package vendadecachorroquente;

import java.util.Scanner;

public class MinhaMain {

	    static Scanner scanner = new Scanner(System.in);

	    public static Aluno criarAluno() {
	        System.out.println("Bem-vindo ao sistema de pedidos de cachorro-quente!");
	        System.out.print("Por favor, insira seu nome: ");
	        String nome = scanner.nextLine();
	        System.out.print("Agora, insira sua matricula: ");
	        int matricula = scanner.nextInt();
	        scanner.nextLine(); 
	        return new Aluno(matricula, nome);
	    }

	    public static cachorroQuente criarcachorroQuente() {
	        System.out.println("\nMonte seu cachorro-quente personalizado:");
	        System.out.print("Escolha a proteina (salsicha, linguiça, frango, bacon): ");
	        String proteina = scanner.nextLine();
	        System.out.print("Escolha o queijo (mussarela, prato, parmesao, coalho): ");
	        String queijo = scanner.nextLine();
	        System.out.print("Escolha a bebida (Coca-cola, Del Rio, Suco do Chaves): ");
	        String bebida = scanner.nextLine();
	        return new cachorroQuente(proteina, queijo, bebida);
	    }

	    public static Adicional criarAdicional() {
	        System.out.println("\nAdicione complementos ao seu pedido:");
	        boolean maionese = decidirAdicional("Maionese");
	        boolean ketchup = decidirAdicional("Ketchup");
	        boolean ovo = decidirAdicional("Ovo");
	        boolean batatafrita = decidirAdicional("Batata Frita");
	        return new Adicional(maionese, ketchup, ovo, batatafrita);
	    }

	    public static boolean decidirAdicional(String complemento) {
	        System.out.print("Deseja adicionar (a/o) " + complemento + "? (sim/nao): ");
	        String resposta;
	        do {
	            resposta = scanner.nextLine().toLowerCase();
	        } while (!resposta.equals("sim") && !resposta.equals("nao"));
	        return resposta.equals("sim");
	    }

	    public static void imprimirpedido(pedido pedido) {
	        System.out.println("\nResumo do pedido feito:");
	        System.out.println("Aluno: " + pedido.aluno.nome);
	        System.out.println("Matricula: " + pedido.aluno.matricula);

	        for (int i = 0; i < pedido.cachorroQuente.length; i++) {
	            System.out.println("\nCachorro-quente " + (i + 1) + ":");
	            System.out.println("Proteina escolhida: " + pedido.cachorroQuente[i].proteina);
	            System.out.println("Queijo escolhido: " + pedido.cachorroQuente[i].queijo);
	            System.out.println("Bebida escolhida: " + pedido.cachorroQuente[i].bebida);
	            System.out.print("Complementos escolhidos: ");
	            if (pedido.adicional.maionese) {
	                System.out.print("Maionese; ");
	            }
	            if (pedido.adicional.ketchup) {
	                System.out.print("Ketchup; ");
	            }
	            if (pedido.adicional.ovo) {
	                System.out.print("Ovo; ");
	            }
	            if (pedido.adicional.batatafrita) {
	                System.out.print("Batata Frita;");
	            }
	            System.out.println();
	        }
	    }

	    public static void agradecer() {
	        System.out.println("\nObrigado por fazer seu pedido! Tenha um otimo dia!");
	    }

	    public static void main(String[] args) {
	        Aluno aluno = criarAluno();
	        System.out.print("\nQuantas unidade de cachorro quente voce deseja pedir? ");
	        int quantidade = scanner.nextInt();
	        scanner.nextLine(); // Consumir a quebra de linha

	        cachorroQuente[] cachorros = new cachorroQuente[quantidade];
	        for (int i = 0; i < quantidade; i++) {
	            cachorros[i] = criarcachorroQuente();
	        }

	        Adicional adicional = criarAdicional();
	        pedido pedido = new pedido(aluno, cachorros, adicional);
	        imprimirpedido(pedido);

	        agradecer();
	    }
	}
