// p. 161

/**
 * @author giorgiocantoni - utilizzo di Tipi Enumerativi + switch
 *
 */

import prog.io.*;
import prog.utili.MeseDellAnno;
import prog.utili.Data;

public class GiorniMancanti {

	public static void main(String[] args) {
		
		// canali di comunicazione
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		// costruisco la data
		Data oggi = new Data();
		// calcolo mese
		MeseDellAnno mese = oggi.getMeseDellAnno();
		// calcolo dei giorni del mese
		int giorniNelMese = mese.numeroGiorni(oggi.getAnno());
		// calcolo giorni mancanti a fine mese
		int giorniAFineMese = giorniNelMese - oggi.getGiorno();

		// calcolo dei giorni mancanti a fine anno
		int giorniAFineAnno = giorniAFineMese;
		switch(mese.successivo()) {
		case FEBBRAIO:
			giorniAFineAnno += oggi.isInAnnoBisestile() ? 29 : 28;
		case MARZO:
			giorniAFineAnno += 31;
		case APRILE:
			giorniAFineAnno += 30;
		case MAGGIO:
			giorniAFineAnno += 31;
		case GIUGNO:
			giorniAFineAnno += 30;
		case LUGLIO:
			giorniAFineAnno += 31;
		case AGOSTO:
			giorniAFineAnno += 31;
		case SETTEMBRE:
			giorniAFineAnno += 30;
		case OTTOBRE:
			giorniAFineAnno += 31;
		case NOVEMBRE:
			giorniAFineAnno += 30;
		case DICEMBRE:
			giorniAFineAnno += 31;
		}
		
		// risultati
		out.print("Mancano" + giorniAFineMese + " giorni alla fine del mese");
		out.println(" e " + giorniAFineAnno + "alla fine dell'anno");
	}

}
