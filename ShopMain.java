import java.util.ArrayList;

public class Shop_main {
	public ArrayList<Item> shoppingCart = new ArrayList<Item>();

	public static void main( String[] args ) {
		new Shop_main().examplePurchase();
	}
	
	public void examplePurchase(){
		// purchase printer
		Printer printerA = new Printer( "HP 12323234", 200 );
		
		// purchase another printer
		Printer printerB = new Printer( "Brother 42", 300 );
		
		// assemble computer
		Computer computer = new Computer();
		
		Case computerCase = new Case( "Generic Case", 30 );
		HardDrive hdd1 = new HardDrive( "Samsung 1TB", 70 );
		HardDrive hdd2 = new HardDrive( "WD 2 TB    ", 120 );
		
		computer.addComponent( computerCase );
		computer.addComponent( hdd1 );
		computer.addComponent( hdd2 );
		
		// place items in shopping cart
		shoppingCart.add( printerA );
		shoppingCart.add( printerB );
		shoppingCart.add( computer );

		// cost visitor
		CostVisitor costVisitor = new CostVisitor();
		
		for( Item item : shoppingCart ){
			item.accept( costVisitor );
		}
		
		// print result
		float totalCost = costVisitor.getSum();
		System.out.println("Total: " +  totalCost + "\n");
		
		// list visitor
		ListItemsVisitor listVisitor = new ListItemsVisitor();
		
		for( Item item : shoppingCart ){
			item.accept( listVisitor );
		}
		
		// print results
		listVisitor.printItemNames();
		System.out.println();
		listVisitor.printFormattedList();
	}
}
