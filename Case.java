
public class Case extends Item {
	
	public Case( String name, float price ){
		this.name = name;
		this.price = price;
	}

	@Override
	public void accept( Visitor visitor ) {
		visitor.visit( this );
	}

}
