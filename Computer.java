import java.util.ArrayList;

public class Computer extends Item {
	ArrayList<Item> components = new ArrayList<Item>();

	@Override
	public void accept( Visitor visitor ) {
		for( Item component : components )
			component.accept( visitor );
	}
	
	public void addComponent( Item component ){
		components.add( component );
	}
}