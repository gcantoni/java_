// p.103

import prog.io.*;

class StringaMinima {

	public static void main(String[] args) {
		
		// canali di comunicazione
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		String minima = null ; 
		
		// leggo le stringhe e calcolo la minima
		
		String s = in.readLine("Prossima stringa?");
		while(!s.equals("")) {
			if ( minima == null || s.compareTo(minima) < 0);
			 minima = s;
			 
			 s = in.readLine("Prossima string?");
	}
		// comunicazione risultato
		if(minima == null)
			out.println("Non hai inserito nessuna stringa");
		else
			out.println("La stringa minima corrisponde a " + minima.toString());
}
	
}
