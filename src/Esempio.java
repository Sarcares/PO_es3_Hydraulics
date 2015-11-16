import idraulica.Elemento;
import idraulica.Ripartitore;
import idraulica.Rubinetto;
import idraulica.Scarico;
import idraulica.Sistema;
import idraulica.Sorgente;
import idraulica.Split;

public class Esempio {

    public static void main(String[] args) {
    	// crea il sistema
		Sistema s = new Sistema();
		
		// crea degli elementi
		Elemento el1 = new Elemento("elemento1");		
		Elemento el2 = new Elemento("elemento2");
		
		Elemento src = new Sorgente("Src");	
		Elemento tap = new Rubinetto("Tap");		
		Elemento sink = new Scarico("Snk");
		
		Elemento source = new Sorgente("Source");
		Split t = new Split("T");
		Elemento sink1 = new Scarico("Sink 1");
		Elemento sink2 = new Scarico("Sink 2");	
		
		Elemento source0 = new Sorgente("Source 0");
		Ripartitore par = new Ripartitore("Par", 3);
        
        // aggiunge gli elementi al sistema
		s.aggiungiElemento(el1);
		s.aggiungiElemento(el2);
		
		s.aggiungiElemento(src);
		s.aggiungiElemento(tap);
		s.aggiungiElemento(sink);
		
		s.aggiungiElemento(source);
		s.aggiungiElemento(t);
		s.aggiungiElemento(sink1);
		s.aggiungiElemento(sink2);
		
		s.aggiungiElemento(source0);
		s.aggiungiElemento(par);
		
		// connetto gli elementi
		src.connetti(tap);
		tap.connetti(sink);
		
		source.connetti(t);
		t.connetti(sink1, 0);
		t.connetti(sink2, 1);
		
		source0.connetti(par);
		par.connetti(sink, 0);
		par.connetti(sink1, 1);
		par.connetti(sink2, 2);
		
		// controllo connessione
		System.out.println("Connessioni nel sistema: ");
		System.out.println("L'elemento "+src.getNome()+" � connesso a "+src.getUscita().getNome());
		System.out.println("L'elemento "+tap.getNome()+" � connesso a "+tap.getUscita().getNome()+"\n");
		
		System.out.println("L'elemento "+source.getNome()+" � connesso a "+source.getUscita().getNome());
		for(Elemento e : t.getUscite()) {
			System.out.println("L'elemento "+t.getNome()+" � connesso a "+e.getNome());
		}
		System.out.println();
		
		System.out.println("L'elemento "+source0.getNome()+" � connesso a "+source0.getUscita().getNome());
		for(Elemento e : par.getUscite()) {
			System.out.println("L'elemento "+par.getNome()+" � connesso a "+e.getNome());
		}
		System.out.println();
        
        // ottiene gli elementi
        Elemento[] elementi = s.getElementi();
        
        System.out.println("Il sistema contiene: ");
        System.out.println(s.toString());
        
    }

}
