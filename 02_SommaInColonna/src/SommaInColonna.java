// pag. 74-75

import prog.io.*;

class SommaInColonna {
	public static void main(String[] args) {
		
		// canali di comunicazione
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		// righe usate per il risultato
		
	    String rigaMeno = "----------"; // si puo eliminare
		String spazi = "          ";
		
		// variabili operandi ( addedendi ) + risultato ( somma )
		
		int op1, op2, somma;
		
		// lettura dati
		
		op1 = in.readInt("Inserisci il primo operando:");
		op2= in.readInt("Inserisci il secondo operando:");
		
		// calcolo somma
		
		somma = op1+op2;
		
		/* costruisco le stringhe che rappresentano i valori -> Uso metodo statico ( lo noto dal fatto che 
	    ** applico un metodo su una classe - nel nostro caso classe String ) e non su un oggetto 
		*/
	
		String strOp1 = String.valueOf(op1); // In particolare rendo op1 che è int una stringa con metodo valueOf
		String strOp2 = String.valueOf(op2); // stessa cosa
		String strSomma = String.valueOf(somma); // stessa cosa 
		
		// costruzione righe da stampare
		
		String riga1= spazi.substring(0, strSomma.length() - strOp1.length() ) + strOp1 + "+";
		String riga2 = spazi.substring(0, strSomma.length() - strOp1.length() ) + strOp2 + "=";
		String riga3= spazi.substring(0, strSomma.length());
		
		// visualizzo a schermo
		/*
		 * Ipotetico fix per vedere bene la tabella rispetto a pag. 75
		 */
		
		out.println(riga1); // out.println(strOp1 + "+");
		out.println(riga2); // out.println(strOp2 + "=");
		out.println(riga3); // out.println(rigaMeno);
		out.println(strSomma);
		
	}
}
