import idraulica.Elemento;
import idraulica.Ripartitore;
import idraulica.Scarico;
import idraulica.Sistema;
import idraulica.Sorgente;

public class Esempio2 {

	public static void main(String[] args) {
		Sistema s = new Sistema();
		Sorgente src = new Sorgente("Src");		
		Ripartitore par = new Ripartitore("Par",2);	
		Elemento sink1 = new Scarico("Sink 1");		
		Elemento sink2 = new Scarico("Sink 2");		
		s.aggiungiElemento(src);
		s.aggiungiElemento(par);
		s.aggiungiElemento(sink1);
		s.aggiungiElemento(sink2);
		
		src.connetti(par);
		par.connetti(sink1,0);
		par.connetti(sink2,1);
		
		par.setProporzioni(new double[]{20,80});
		double portata = 100.0;
		src.setPortata(portata);
		
		//startCapture();
		s.simula();
		//String output=stopCapture();
		
		//assertEquals(20,findNNum("Sink 1",output,1),0.01);
		//assertEquals(80,findNNum("Sink 2",output,1),0.01);
	}

}
