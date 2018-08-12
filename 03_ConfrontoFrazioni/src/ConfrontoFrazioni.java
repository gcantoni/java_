// p. 85
import prog.io.*;
import prog.utili.Frazione;

class ConfrontoFrazioni {

	public static void main(String[] args) {
		
		// canali di comunicazione ( qui uso i costruttori )
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		// leggo la prima frazione + la costruisco
		
		int num = in.readInt("Inserisci il numeratore:");
		int den = in.readInt("Inserisci il denominatore:");
		
		Frazione f1 = new Frazione (num, den);
		
		// leggo la seconda frazione + la costruisco
		
		int num1 = in.readInt("Inserisci il numeratore:");
		int den1 = in.readInt("Inserisci il denominatore:");
		
		Frazione f2 = new Frazione (num1, den1);
		
		// Le frazioni inserite
		// AGGIUNTA DA ME NON PRESENTE A PAG 85
		
				out.println("Le frazioni che hai inserito sono:");
				out.println(" ");
				out.println("La prima:" + " " + f1);
				out.println("La seconda:" + " " + f2);
				out.println(" ");
				out.println("Quindi...");
				
		// Confronto
		
		if(f1.equals(f2))
				out.println("Le due frazioni sono uguali");
		else
			out.println("Le due frazioni sono diverse");
		

	}

}
