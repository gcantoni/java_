// p. 86
import prog.io.*;

class Mistero {
	public static void main(String[] args) {
		
		// canali comunicazione ( uso i costruttori )
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		int x = in.readInt("Inserisci primo numero:");
		int y = in.readInt("Inserisci secondo numero:");
		int z = 100; 
		
		if ( x == 1 ) { // parentesi superflua
			if ( y == 1 ) z=x+y; 
		} else z = x-y; // else è riferito al primo if -> parentesi superflua
		
		out.println("Il risultato è" + z);
  }
}
