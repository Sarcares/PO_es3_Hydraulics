package idraulica;

public class Split extends Elemento {

	protected Elemento[] outputs;
	
	public Split(String nome) {
		super(nome);
		outputs = new Elemento[2];
	}
    
	/**
	 * @return An array of elements that are the output elements.
	 */
	public Elemento[] getUscite(){
	    return outputs;
	}

	/**
	 * This method should not be used. 
	 * It is better to use: {@link Split.connetti(Elemento elem, int uscita)}.<BR>
	 * This method connects the output 0 of this element with the imput of the specified element.
	 */
	public void connetti(Elemento elem) {
		super.connetti(elem);
		outputs[0] = elem;
	}
	
	/**
	 * Set an element to a specified output (0 or 1 are allowed).<BR> 
	 * If you choose the value 0 you will set that ouput also in the superclass.	
	 * @param elem - The element that you want to set
	 * @param uscita - The number of the desired exit.
	 */
    public void connetti(Elemento elem, int uscita){
    	if((uscita<0) || (uscita>1)) {
    		System.err.println("LOG - Invalid input: "+uscita);
    		return;
    	}
    	
        if(uscita == 0) {
        	super.connetti(elem);
        }
        outputs[uscita] = elem;
    }
}
