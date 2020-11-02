package builder;

public class Cook {
	private TacoBuilder tacoBuilder;
	public void setTacoBuilder(TacoBuilder pb) {
		this.tacoBuilder=pb;
	}
	public Taco getTaco() {
		return this.tacoBuilder.getTaco();
	}
	public void hacertaco() {
		tacoBuilder.createTacoProduct();
		tacoBuilder.hacerBase();
		tacoBuilder.hacerSalsa();
		tacoBuilder.hacerIngredientes();
	}
}
