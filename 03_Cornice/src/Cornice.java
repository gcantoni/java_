// p. 109

import prog.io.*;

public class Cornice {

	public static void main(String[] args) {
		
		// canali di comunicazione
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		// leggo il nome e calcolo la lunghezza
		String frase = in.readLine("Inserisci il tuo nome:");
		int lunghezza = frase.length();
		
		// righe che fanno la cornice
		String rigaCornice = "";
		
		for (int i=0; i < lunghezza + 6; i = i+1) {
			rigaCornice = rigaCornice.concat("*");
			String spazi = "";
			
			for(int j=0; j < lunghezza+4;j=j+1) {
				spazi = spazi.concat(" ");
			}
		}
		String rigaIntermedia = "*" + spazi + "*";
		String rigaTesto = "* " + frase + " *";

		// visualizzo cornice
		out.println(rigaCornice);
		out.println(rigaIntermedia);
		out.println(rigaTesto);
		out.println(rigaIntermedia);
		out.println(rigaCornice);
	}

}
