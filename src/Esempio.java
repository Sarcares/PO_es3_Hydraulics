import idraulica.Elemento;
import idraulica.Rubinetto;
import idraulica.Scarico;
import idraulica.Sistema;
import idraulica.Sorgente;

public class Esempio {

    public static void main(String[] args) {
    	// crea il sistema
		Sistema s = new Sistema();
		
		// crea degli elementi
		Elemento el1 = new Elemento("elemento1");		
		Elemento el2 = new Elemento("elemento2");
		
		Elemento src = new Sorgente("Src");		
		Elemento tap = new Rubinetto("Tap");		
		Elemento sink = new Scarico("Sink");
        
        // aggiunge gli elementi al sistema
		s.aggiungiElemento(el1);
		s.aggiungiElemento(el2);
		
		s.aggiungiElemento(src);
		s.aggiungiElemento(tap);
		s.aggiungiElemento(sink);
		
		// connetto gli elementi
		src.connetti(tap);
		tap.connetti(sink);
		
		// controllo connessione
		System.out.println("Connessioni nel sistema: ");
		System.out.println("L'elemento "+src.getNome()+" è connesso a "+src.getUscita().getNome());
		System.out.println("L'elemento "+tap.getNome()+" è connesso a "+tap.getUscita().getNome()+"\n");
        
        // ottiene gli elementi
        Elemento[] elementi = s.getElementi();
        
        System.out.println("Il sistema contiene: ");
        System.out.println(s.toString());
        
    }

}
