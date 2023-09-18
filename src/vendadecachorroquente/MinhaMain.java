package vendadecachorroquente;

import java.util.Scanner;

public class MinhaMain {

	 static Scanner leitor = new Scanner(System.in);

	    public static Aluno criarAluno() {
	        System.out.println("Insira seu nome:");
	        String nome = leitor.nextLine();
	        System.out.println("Insira sua matricula:");
	        int matricula = leitor.nextInt();
	        leitor.nextLine();
	        return new Aluno(matricula, nome);
	    }

	    public static boolean decidirAdicional(String complemento) {
	        System.out.println("Voce quer  " + complemento + "? (s/n)");
	        String resposta;
	        do {
	            resposta = leitor.nextLine().toLowerCase();
	        } while (!resposta.equals("s") && !resposta.equals("n"));

	        return resposta.equals("s");
	    }

	    public static Adicional criarAdicional() {
	        boolean maionese = decidirAdicional("maionese");
	        boolean ketchup = decidirAdicional("ketchup");
	        boolean ovo = decidirAdicional("ovo");
	        boolean batatafrita = decidirAdicional("batata frita");
	        return new Adicional(maionese, ketchup, ovo, batatafrita);
	    }

	    public static cachorroQuente criarCachorro() {
	        System.out.print("Digite a proteiBna de sua escolha: salsicha, linguica, frango, bacon ");
	        String proteina = leitor.nextLine();
	        System.out.print("Digite o queijo de sua escolha: mussarela, prato, parmessao, qualho ");
	        String queijo = leitor.nextLine();
	        System.out.print("Digite a bebida de sua escolha: coca cola, suco do chaves, del rio ");
	        String bebida = leitor.nextLine();
	        return new cachorroQuente(proteina, queijo, bebida);
	    }

	    public static void impressaodepedido(pedido pedido) {
	        System.out.println("\n\nALUNO");
	        System.out.println("Nome: " + pedido.aluno.nome);
	        System.out.println("Matrícula: " + pedido.aluno.matricula);
	        for (int i = 0; i < pedido.cachorroQuente.length; i++) {
	            System.out.println("\n\nCachorro quente n: " + (i + 1));
	            System.out.println("Proteína: " + pedido.cachorroQuente[i].proteina);
	            System.out.println("Queijo: " + pedido.cachorroQuente[i].queijo);
	            System.out.println("Bebida: " + pedido.cachorroQuente[i].bebida);
	        }
	        System.out.print("Complementos: ");
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
	    }

	    public static void main(String[] args) {
	        Aluno aluno = criarAluno();
	        System.out.println("Escolha quantos cachorros quentes serao comprados: ");
	        int quantidade = leitor.nextInt();
	        leitor.nextLine(); 
	        cachorroQuente cachorroQuente[] = new cachorroQuente[quantidade];
	        for (int i = 0; i < quantidade; i++) {
	            cachorroQuente[i] = criarCachorro();
	        }
	        Adicional adicional = criarAdicional();
	        pedido pedido = new pedido(aluno, cachorroQuente, adicional);
	        impressaodepedido(pedido);
	    }
	}