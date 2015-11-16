package idraulica;

public class Elemento {

	private String name;
	private Elemento output;
	
	public Elemento(String nome) {
		this.name = nome;
	}
	
	public String getNome() {
		return name;
	}
	
	/**
	 * This method receives as parameter the element that we want to connect.<BR>
	 * For example "a.connetti(b);" connects the output of "a" to the input of "b".
	 * @param elem - The element that we want to connect to this one.
	 */
	public void connetti(Elemento elem) {
		this.output = elem;
	}
	
	/**
	 * @return - The element that receives the output of <code>this</code> element.
	 */
	public Elemento getUscita() {
		return this.output;
	}
}
