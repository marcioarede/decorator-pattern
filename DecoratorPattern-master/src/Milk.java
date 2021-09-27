
public class Milk extends CondimentDecorator{
	
	public Milk(Beverage beverage){
		this.beverage = beverage;
	}
	
	public float cost() {
		return beverage.cost()+0.85f;
	}
	
	public String getDescription(){
		return this.beverage.getDescription()+" with milk";
	}
}
