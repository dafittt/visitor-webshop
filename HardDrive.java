public class HardDrive extends Item {
	public HardDrive( String name, float price ){
		this.name = name;
		this.price = price;
	}

	@Override
	public void accept( Visitor visitor ) {
		visitor.visit( this );
	}
	
	// class specific methods go here
}
