
public class CostVisitor implements Visitor {
	
	private float sum = 0;

	//Visitors
	
	@Override
	public void visit( Computer computer ) {
		sum += computer.getPrice(  );
	}

	@Override
	public void visit( Printer printer ) {
		float rabatt = 0.1f;
		sum += printer.getPrice(  ) * ( 1 - rabatt );
	}

	@Override
	public void visit( Case computerCase ) {
		sum += computerCase.getPrice(  );
	}

	@Override
	public void visit( HardDrive hdd ) {
		sum += hdd.getPrice(  );
	}	
	
	
	//-------------------------------------------------------
	//Utility Functions
	
	public float getSum(  ){
		float versand = 3;
		return sum + versand;
	}
}
