package jogoDaVelha;

public class Main {
	public static void main(String[] args) {
		boolean exit = false;
		
		while (!exit) {
			System.out.printf("Menu do Jogo da Velha:\n"
							 + "1. Novo Jogo\n"
							 + "2. Instruções\n"
							 + "3. Integrantes do Grupo\n"
							 + "4. Sair\n"
							 + "Opção: ");
			
			int escolha = Jogo.entrada.nextInt();
			switch (escolha) {
				case 1:
					Jogo.game();
					break;
				case 2:
					Jogo.instruct();
					break;
				case 3:
					Jogo.group();
					break;
				case 4:
					System.out.println("Fim do Programa");
					Jogo.entrada.close();
					exit = true;			
			}
		}
	}
}