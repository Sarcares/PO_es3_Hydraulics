package idraulica;

public class Ripartitore extends Split { //could extends Elemento{
	
	public Ripartitore(String nome, int num) {
		super(nome);
		super.outputs = new Elemento[num];
	}
	
	public int getNumeroUscite() {
		return super.outputs.length;
	}
	
	public void setProporzioni(double[] proporzioni) {
		// TODO: completare
	}
    
	public void connetti(Elemento elem, int uscita) {
    	if((uscita < 0) || (uscita > super.outputs.length)) {
    		System.err.println("LOG - Invalid input: "+uscita);
    		return;
    	}
    	
        if(uscita == 0) {
        	super.connetti(elem);
        }
        super.outputs[uscita] = elem;
	}
	
}
