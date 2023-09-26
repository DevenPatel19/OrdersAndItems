import java.util.ArrayList;

public class Order {

	// MEMBER VARIABLES
	public String name; // default value is null
	public double total;//  default value 0
	public boolean ready; //  default value false

	//  what would be the default if we had not assigned it?
	public ArrayList<Item> items = new ArrayList<Item>();

}