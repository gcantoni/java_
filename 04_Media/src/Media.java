// p. 137

import prog.io.*;

public class Media {

	public static void main(String[] args) {
		
		// canali di comunicazione
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		int x,y,z;
		double media;
		
		x = in.readInt("Inserisci x");
		y = in.readInt("Inserisci y");
		z = in.readInt("Inserisci z");
		
		media = ( x + y +z ) / 3.0;
		
		out.println("La media è:" + media);

	}

}
