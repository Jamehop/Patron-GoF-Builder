package builder;

public class Mexicano extends TacoBuilder {
	//Todos los tipos de Taco con ConcreteBuilders
	@Override
	public void hacerBase() {
		this.taco.setBase("Fina");
		
	}

	@Override
	public void hacerSalsa() {
		this.taco.setSalsa("Picante");
		
	}

	@Override
	public void hacerIngredientes() {
		this.taco.setIngredientes("Carne + Frijoles");
		
	}
}
