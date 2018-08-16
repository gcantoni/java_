// p. 141

import prog.io.*;

public class OccorenzeVocali {

	public static void main(String[] args) {
		
		// canali di comunicazione
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		String s = in.readLine("Inserisci la stringa");
		int na = 0, ni = 0, ne = 0, no= 0, nu = 0;
		char c;
		
		for ( int i = 0; i < s.length(); i = i+1 ) {
			c = s.charAt(i);
			
			if( c == 'a' || c == 'A')
				na++;
			else if( c == 'e' || c == 'E')
				ne++;
			else if( c == 'i' || c == 'I')
				ni++;
			else if( c == 'o' || c == 'O')
				no++;
			else if( c == 'u' || c == 'U')
				nu++;			
		}
		
		out.println("Numero di a:" + na);
		out.println("Numero di e:" + ne);
		out.println("Numero di i:" + ni);
		out.println("Numero di o:" + no);
		out.println("Numero di u:" + nu);

	}

}
