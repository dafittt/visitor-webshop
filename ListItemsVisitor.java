import java.util.HashMap;
import java.util.Map.Entry;


public class ListItemsVisitor implements Visitor {
	
	HashMap<String, Float> computerParts = 	new HashMap<String, Float>();
	HashMap<String, Float> periphery = 		new HashMap<String, Float>();

	
	//Visitors
	
	@Override
	public void visit( Computer computer ) {
		computerParts.put( computer.getName(), computer.getPrice() );
	}
	
	@Override
	public void visit( Printer printer ) {
		periphery.put( printer.getName(), printer.getPrice() );
	}

	@Override
	public void visit( Case computerCase ) {
		computerParts.put( computerCase.getName(), computerCase.getPrice() );
	}

	@Override
	public void visit( HardDrive hdd ) {
		computerParts.put( hdd.getName(), hdd.getPrice() );
	}
	
	
	//-------------------------------------------------------
	//Utility functions
	
	public void printItemNames(  ){
		System.out.println( "Items in cart:" );
		for( Entry<String, Float> entry : computerParts.entrySet() ) {
			System.out.println( entry.getKey() );
		}
		for( Entry<String, Float> entry : periphery.entrySet() ) {
			System.out.println( entry.getKey() );
		}
	}
	
	public void printFormattedList(  ){
		System.out.println( "Formatted list:" );
		System.out.println( "Computer Parts:" );
		for( Entry<String, Float> entry : computerParts.entrySet()) {
			String line = "Item: " + entry.getKey() + "\tPrice: " + entry.getValue() + " €";
			System.out.println( line );
		}
		
		System.out.println( "Periphery:" );
		for( Entry<String, Float> entry : periphery.entrySet()) {
			String line = "Item: " + entry.getKey() + "\tPrice: " + entry.getValue() + " €";
			System.out.println( line );
		}
	}



}
