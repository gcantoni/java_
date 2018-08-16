// p. 131

import prog.io.*;
// import static java.lang.Math.PI oppure import static java.lang.Math.*

public class CalcoloCerchio {

	public static void main(String[] args) {
		
		// canali di comunicazione
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		double raggio, area, circonferenza;
		
		/**
		 * Se importo java.lang.Math.X non ho bisogno della costante
		 */
		final double PI = 3.14; // costante 
		
		// leggo raggio
		raggio = in.readDouble("Inserisci il raggio:");
		
		// area e circonferenza
		area = raggio * raggio * PI; // In tal caso importando .Math userò Math.PI invece di PI ( costante )
		circonferenza = raggio * 2 * PI;
		
		// risultati
		out.println("Area cerchio = " + area);
		out.println("Circonferenza = " + circonferenza);

	}

}
