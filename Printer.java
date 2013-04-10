
public class Printer extends Item {

	public Printer( String name, float price ){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public void accept( Visitor visitor ) {
		visitor.visit( this );
	}

}
