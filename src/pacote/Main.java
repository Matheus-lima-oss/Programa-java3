package pacote;

public class Main {

	public static void main(String[] args) {

		String texto = "Corrida de 5km na Pedra da Gávea";
		
		// Testando o prefixo usando startsWith()
		System.out.print("Verifique se a string começa com Corrida usando startsWith: ");
		System.out.println(texto.startsWith("Corrida"));
		
		// Testando o prefixo usando Regex()
		System.out.print("Verifique se a string começa com Corrida usando Matches: ");
		System.out.println(texto.matches("Corrida(.*)"));
		
	}
}
