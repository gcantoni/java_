// p.113

import prog.io.*;

public class PappaGalloStanco {

	public static void main(String[] args) {
		
		// canali di comunicazione
		
		ConsoleInputManager tastiera = new ConsoleInputManager();
		ConsoleOutputManager video = new ConsoleOutputManager();

		// esecuzione
		
		do {
			String messaggio = tastiera.readLine();
			String risposta = messaggio.toUpperCase();
			video.println(risposta);
			
			if(messaggio.equals("Stanco"))
				break;
		} while (true);
	}

}
