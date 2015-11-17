package idraulica;

public class Rubinetto extends Elemento {

	boolean open;
	
	/**
	 * The default situation for a tap is that it's closed.
	 * @param nome - The name of the tap
	 */
	public Rubinetto(String nome) {
		super(nome);
		this.open = false;
	}
	
	/**
	 * It is possible to set if the tap is open or not.
	 * @param nome - The name of the tap
	 * @param open - True if the tap is open, false otherwise
	 */
	public Rubinetto(String nome, boolean open) {
		super(nome);
		this.open = open;
	}
	
	public void setOpen(boolean open){
		this.open = open;
	}
	
	public void simula(String indentation, double portata) {
		System.out.println(indentation+" | ");
		if(open) {
			System.out.println(indentation+" element: "+name+
				" - inflow: "+portata+" M^3/s - Outflow: "+portata+" M^3/s");
			indentation += "---";
			super.output.simula(indentation, portata);
		}
		else {
			System.out.println(indentation+" element: "+name+
				" - inflow: "+portata+" M^3/s - Outflow: 0 M^3/s");
			System.out.println(indentation+" End of the Flow - ");
			System.out.println(indentation);
		}
	}
}
