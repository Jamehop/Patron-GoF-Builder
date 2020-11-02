package builder;

public class Cook {
	//Este seria el director que recoge al Builder
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
