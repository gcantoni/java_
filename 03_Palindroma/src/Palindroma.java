// p.112

import prog.io.*;

public class Palindroma {

	public static void main(String[] args) {
		
		// canali di comunicazione
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		// leggo la stringa
		
		String s = in.readLine("Inserisci una stringa:");

		// esame della stringa
		
		boolean palindroma = true;
		
		for ( int sx= 0, dx = s.length() -1 ;  sx < dx ; sx = sx + 1 , dx = dx - 1 ) {
			if(s.charAt(sx) != s.charAt(dx)) 
				palindroma = false;
		}
		
		// risultato
		
		if(palindroma)
			out.println("La stringa" + " "+  s + " " + "e' palindroma");
		else
			out.println("La stringa" + " " + s + " " +"NON e' palindroma");
	}

}
