package builder;

public class Taco {
	//Aqui tenemos el product
	private String base;
	private String salsa;
	private String ingredientes;
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public String getSalsa() {
		return salsa;
	}
	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	@Override
	public String toString() {
		return "Taco [base=" + base + ", salsa=" + salsa + ", ingredientes=" + ingredientes + "]";
	}
	
}
