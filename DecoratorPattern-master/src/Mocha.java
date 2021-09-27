
public class Mocha extends CondimentDecorator{
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	public float cost() {
		return beverage.cost()+0.95f;
	}
	public String getDescription() {
		return beverage.getDescription()+" with Mocha";
	}
}
