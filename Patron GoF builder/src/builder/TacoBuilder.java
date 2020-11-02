package builder;

public abstract class TacoBuilder {
	protected Taco taco;
	public Taco getTaco() {
		return this.taco;
	}
	public void createTacoProduct() {
		this.taco=new Taco();
	}
	public abstract void hacerBase();
	public abstract void hacerSalsa();
	public abstract void hacerIngredientes();
}
