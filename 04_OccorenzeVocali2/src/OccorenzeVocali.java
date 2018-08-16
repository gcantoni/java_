// p. 158

import prog.io.*;

public class OccorenzeVocali {

	public static void main(String[] args) {
		
		// canali di comunicazione
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		String s = in.readLine("Inserisci la stringa:");
		int na = 0, ni = 0, ne = 0, no = 0, nu = 0;
		
		for ( int i = 0; i < s.length(); i = i+1) {
			switch(s.charAt(i)) {
			
			case 'a':
			case 'A':
				na++;
				break;
				
			case 'e':
			case 'E':
				ne++;
				break;
				
			case 'i':
			case 'I':
				ni++;
				break;
				
			case 'o':
			case 'O':
				no++;
				break;
				
			case 'U':
			case 'u':
				nu++;
				break;
			}
		}
		
		out.println("A : " + na);
		out.println(" I = " + ni);
		out.println(" E = " + ne);
		out.println(" U = " + nu);
		out.println(" O = " + no);
	}

}
