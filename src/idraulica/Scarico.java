package idraulica;

public class Scarico extends Elemento {

	public Scarico(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * This method is disabled for a sink and does not work.
	 */
	public void connetti(Elemento elem) {
		System.err.println("It is not possible to connect a Sink to something.");
	}

}
