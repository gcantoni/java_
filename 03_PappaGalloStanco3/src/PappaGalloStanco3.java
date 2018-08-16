// p. 113

import prog.io.*;

public class PappaGalloStanco3 {

	public static void main(String[] args) {
		
		// canali di comunicazione
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		do {
			String mes = in.readLine();
			String risposta = mes.toUpperCase();
			out.println(risposta);
			
			if(mes.equals("stanco"))
				break;
		} while(true);
	}

}
