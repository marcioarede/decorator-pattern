
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beverage darkRoast = new DarkRoast();
		CondimentDecorator milk = new Milk(darkRoast);
		CondimentDecorator DobleMocha = new DobleMocha(milk);
		System.out.println(DobleMocha.cost());
		System.out.println(DobleMocha.getDescription());
	}

}
