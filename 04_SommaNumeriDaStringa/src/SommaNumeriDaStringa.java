// p.150
/**
 * utilizzo di StringTokenizer
 */
import prog.io.*;
import java.util.StringTokenizer;

public class SommaNumeriDaStringa {

	public static void main(String[] args) {
		
		// canali di comunicazione
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		// leggo la sequenza
		String sequenza = in.readLine("Inserisci la sequenza di numeri " + "interi separati da uno spazio");
		
		// costruisco l'estrattore di token ( sottostringhe )
		StringTokenizer stk = new StringTokenizer(sequenza , " "); // primo arg è la mia stringa - secondo arg è il mio separatore
		
		// calcolo somma
		int somma = 0;
		while(stk.hasMoreTokens()) {
			String token = stk.nextToken();
			somma = somma + Integer.parseInt(token); // conversione mediante classe involucro Integer e metodo statico parseint
		}

		// risultato
		out.println("La somma dei numeri in sequenza è" + somma);
	}

}
