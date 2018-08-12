// p.97
import prog.io.*;
import prog.utili.Frazione;

public class SommaSequenza {

	public static void main(String[] args) {
		
		// canali di comunicazione 
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		// variabili
		
		Frazione somma = new Frazione(0); // somma = 0
		boolean continua; // usato nel ciclo while per decidere se continuare ad inserire frazioni
		
		/*
		 * boolean continua = in.readSiNo("Vuoi inserire una frazione? (s/n)");
		 */
		
		// Svolgimento operazione mediante ciclo do while
		
		do {
			
			// Creazione della frazione ( verrà completata poi con il suo costruttore )
			
			int num = in.readInt("Inserisci il numeratore:");
			int den = in.readInt("Inserisci il denominatore:");
			
			// Somma -> uso il metodo piu e costruisco la frazione nell'argomento del metodo mediante
			// costruttore che riceve come argomenti il numeratore e denominatore
			
			somma = somma.piu(new Frazione(num, den));
			
			// Faccio decidere se continuare o meno - uso il metodo readSiNo della classe ConsoleInputManager
			
			continua = in.readSiNo("Vuoi inserire un'altra frazione? (s/n)");
			
		} while (continua);
		
		/*
		 * while (continua) { // dipende dalla variabile continua messa sopra in commento 
		 * 
		 *                   int num = in.readInt("Inserisci il numeratore:");
		 *	                 int den = in.readInt("Inserisci il denominatore:");
		 *                   somma = somma.piu(new Frazione(num, den));
		 *                   continua = in.readSiNo("Vuoi inserire un'altra frazione? (s/n)");
		 * }
		 */
		
		out.println("La somma è" + somma.toString());

	}

}
