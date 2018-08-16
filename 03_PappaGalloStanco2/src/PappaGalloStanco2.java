// p.105

import prog.io.*;

public class PappaGalloStanco2 {

	public static void main(String[] args) {
		
		// canali di comunicazione
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		// creazione stringa
		
		String mex = ""; // non puo essere null perche senno cado nel nullpointerexception
		
		while(!mex.equals("stanco")) {
			mex = in.readLine();
			String risposta = mex.toUpperCase();
			out.println(risposta);
			
		}

	}

}
