/**
@author Aleksander Rudolf, Ansh Singh, Jaskaran Bhatia
@version 2.0
@since 1.0 - Mar. 28/2022
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory implements Cloneable {
	
	private ArrayList<FoodItem> inventoryItems = new ArrayList<FoodItem>();
	
	/**
	 * Default constructor for Inventory.
	 */
	public Inventory() {}
	
	/**
	 * Getter for inventoryItems.
	 * @return ArrayList<FoodItem>
	 */
	public ArrayList<FoodItem> getInventoryItems() {
		return inventoryItems ;
	}
	
	/*
	 * Setter for inventoryItems.
	 */
	public void setInventoryItems(ArrayList<FoodItem>inventoryItems) {
		this.inventoryItems = inventoryItems ;
	}
	
	/**
	 * Returns a FoodItem at particular index at ArrayList.
	 * @param index
	 * @return FoodItem
	 */
    public FoodItem getInventoryItem(int index) {
        return inventoryItems.get(index);
    }		
	
    /**
     * Clones Inventory.
     * @return Object
     */
	public Object clone() throws CloneNotSupportedException {
		Inventory copy = (Inventory)super.clone();
		copy.inventoryItems = new ArrayList<FoodItem>();
		Iterator<FoodItem> iterator = this.inventoryItems.iterator();
        // This while loops clones every element of ArrayList of FoodItem
		while(iterator.hasNext()) {
			copy.inventoryItems.add((FoodItem)iterator.next().clone());
		}
		return copy;
	}
}