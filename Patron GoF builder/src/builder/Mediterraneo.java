package builder;

public class Mediterraneo extends TacoBuilder{

	@Override
	public void hacerBase() {
		this.taco.setBase("Gruesa");
		
	}

	@Override
	public void hacerSalsa() {
		this.taco.setSalsa("Blanca");
		
	}

	@Override
	public void hacerIngredientes() {
		this.taco.setIngredientes("Carne + queso");
		
	}

}
