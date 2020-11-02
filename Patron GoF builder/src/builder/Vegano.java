package builder;

public class Vegano extends TacoBuilder{

	@Override
	public void hacerBase() {
		this.taco.setBase("Integral");
		
	}

	@Override
	public void hacerSalsa() {
		this.taco.setSalsa("Tomate");
		
	}

	@Override
	public void hacerIngredientes() {
		this.taco.setIngredientes("Frijoles + lechuga");
		
	}

}
