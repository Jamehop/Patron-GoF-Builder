package builder;

public class Vegano extends TacoBuilder{
	//Todos los tipos de Taco con ConcreteBuilders
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
