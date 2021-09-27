
public class DobleMocha extends CondimentDecorator{
	
	public DobleMocha(Beverage b){
		this.beverage = b;
	}
	public float cost() {
		return beverage.cost()+1.2f;
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+" with Double Mocha";
	}
}
