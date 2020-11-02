package builder;

public class Main {

	public static void main(String[] args) {
		Cook cook = new Cook();
		TacoBuilder mexicanoB=new Mexicano();
		cook.setTacoBuilder(mexicanoB);
		cook.hacertaco();

		TacoBuilder veganoB=new Vegano();
		cook.setTacoBuilder(veganoB);
		cook.hacertaco();
		
		TacoBuilder mediterraneoB=new Mediterraneo();
		cook.setTacoBuilder(mediterraneoB);
		cook.hacertaco();
		
		Taco taco=cook.getTaco();
	}

}
