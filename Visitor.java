public interface Visitor {
	// one visit Method for each item in the object structure
	public void visit( Printer printer );
	public void visit( Case computerCase );
	public void visit( HardDrive hdd );
	public void visit( Computer computer );
}