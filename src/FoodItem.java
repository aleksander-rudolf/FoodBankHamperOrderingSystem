/**
@author Aleksander Rudolf, Ansh Singh, Jaskaran Bhatia
@version 2.0
@since 1.0 - Mar. 28/2022
*/

public class FoodItem implements Cloneable {
	
	private final int ITEM_ID;
	private final int GRAIN_CONTENT;
	private final int FV_CONTENT;
	private final int PRO_CONTENT;
	private final int OTHER;
	private final int CALORIES;
	private final String NAME;
	
	/**
	 * Constructor for FoodItem.
	 * @param itemID 
	 * @param name 
	 * @param grainContent 
	 * @param fvContent
	 * @param proContent 
	 * @param other 
	 * @param calories 
	 */
	public FoodItem(int itemID, String name, int grainContent, int fvContent, int proContent, int other, int calories) {
		this.ITEM_ID = itemID;
		this.NAME = name;
		this.GRAIN_CONTENT = grainContent;
		this.FV_CONTENT = fvContent;
		this.PRO_CONTENT = proContent;
		this.OTHER = other;
		this.CALORIES = calories;
	}
	
	/**
	 * Getter method for Name.
	 * @return String 
	 */
    public String getName() {
		return this.NAME;
	}
    
    /**
     * Getter method for ItemID.
     * @return int 
     */
	public int getItemID() {
		return this.ITEM_ID;
	}
	
    /**
     * Getter method for GrainContent.
     * @return int
     */
	public int getGrainContent() {
		return this.GRAIN_CONTENT;
	}
	
    /**
     * Getter method for FVContent.
     * @return int
     */
	public int getFVContent() {
		return this.FV_CONTENT;
	}
	
    /**
     * Getter method for ProContent.
     * @return int 
     */
	public int getProContent() {
		return this.PRO_CONTENT;
	}
	
    /**
     * Getter method for OtherContent.
     * @return int 
     */
	public int getOtherContent() {
		return this.OTHER;
	}
	
    /**
     * Getter method for calories.
     * @return int
     */
	public int getCalories() {
		return this.CALORIES;
	}
	
    /**
     * Clone method for FoodItem class.
     * @return Object 
     */
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}