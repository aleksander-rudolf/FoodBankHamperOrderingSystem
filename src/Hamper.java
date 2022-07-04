/**
@author Aleksander Rudolf, Ansh Singh, Jaskaran Bhatia
@version 2.0
@since 1.0 - Mar. 28/2022
*/

import java.util.*;

public class Hamper {
	
	private SQLData myData;
	private final double TOTAL_GRAINS;
	private final double TOTAL_FV;
	private final double TOTAL_PROTEIN;
	private final double TOTAL_OTHER;
	private final double TOTAL_CALORIES;
	private double actualGrains;
	private double actualFV;
	private double actualProtein;
	private double actualOther;
	private double actualCalories;
	private boolean valid = false;
	private  FoodItem dummyFood = new FoodItem(-1,"",-1,-1,-1,-1,-1);
	private ArrayList<FoodItem> hamperItems = new ArrayList<>();
	
	/**
	 * Constructor #1 for Hamper 
	 * This will be called by createHamper method in the class Family.
	 * @param myData
	 * @param male
	 * @param female
	 * @param under8
	 * @param above8
	 */
	public Hamper(SQLData myData, int male, int female,  int under8, int above8){
		
		int maleCalories = myData.getClients().get(0).getCalories();
		int femaleCalories = myData.getClients().get(1).getCalories();
		int under8Calories = myData.getClients().get(2).getCalories();
		int over8Calories = myData.getClients().get(3).getCalories();
		this.myData = myData;	
		//Calculates total required various nutrition fields
		this.TOTAL_GRAINS = (myData.getClients().get(0).getWholeGrains()*male*0.01*maleCalories
									+ myData.getClients().get(1).getWholeGrains()*female*0.01*femaleCalories 
									+ myData.getClients().get(2).getWholeGrains()*under8*0.01*under8Calories 
									+ myData.getClients().get(3).getWholeGrains()*above8*0.01*over8Calories)*7;
		
	    this.TOTAL_FV = (myData.getClients().get(0).getFruitVeggies()*male*0.01*maleCalories
	    					+ myData.getClients().get(1).getFruitVeggies()*female*0.01*femaleCalories 
							+ myData.getClients().get(2).getFruitVeggies()*under8*0.01*under8Calories 
							+ myData.getClients().get(3).getFruitVeggies()*above8*0.01*over8Calories)*7;
	    
        this.TOTAL_PROTEIN = (myData.getClients().get(0).getProtein()*male*0.01*maleCalories
					        	+ myData.getClients().get(1).getProtein()*female*0.01*femaleCalories 
					        	+ myData.getClients().get(2).getProtein()*under8*0.01*under8Calories 
					        	+ myData.getClients().get(3).getProtein()*above8*0.01*over8Calories)*7;
        
		this.TOTAL_OTHER = (myData.getClients().get(0).getOther()*male*0.01*maleCalories
							+ myData.getClients().get(1).getOther()*female*0.01*femaleCalories 
					    	+ myData.getClients().get(2).getOther()*under8*0.01*under8Calories 
					    	+ myData.getClients().get(3).getOther()*above8*0.01*over8Calories)*7;
		
        this.TOTAL_CALORIES = (maleCalories*male + femaleCalories*female + under8Calories*under8 + over8Calories*above8)*7;
	}
	
	/**
	 * Constructor #2 for Hamper. 
	 * @param hamperItems
	 * @param actualWholeGrains
	 * @param actualFruitVeggies
	 * @param actualProtein
	 * @param actualOther
	 * @param actualCalories
	 */
	public Hamper(ArrayList<FoodItem> hamperItems, double actualGrains, double actualFV, double actualProtein, double actualOther, double actualCalories,
					double totalGrains, double totalFV, double totalProtein, double totalOther, double totalCalories) {
		this.TOTAL_GRAINS = totalGrains;
		this.TOTAL_FV = totalFV;
		this.TOTAL_PROTEIN = totalProtein;
		this.TOTAL_OTHER = totalOther;
		this.TOTAL_CALORIES = totalCalories;
		this.hamperItems = hamperItems;
		this.actualGrains = actualGrains;
		this.actualFV = actualFV;
		this.actualProtein = actualProtein;
		this.actualOther = actualOther;
		this.actualCalories = actualCalories;
	}
	
	/**
	 * Getter for hamperItems.
	 * @return ArrayList<FoodItem>
	 */
	public ArrayList<FoodItem> getHamperItems(){
		return 	this.hamperItems ;
	}

    /**
     * Getter for TOTAL_GRAINS.
     * @return double
     */
    public double getTotalWholeGrains(){
        return 	this.TOTAL_GRAINS;
    }
    
    /**
     * Getter for TOTAL_FV.
     * @return double
     */
    public double getTotalFV(){
		return  this.TOTAL_FV;
	}	
    
    /**
     * Getter for TOTAL_PROTEIN.
     * @return double
     */
	public double getTotalProtein(){
		return this.TOTAL_PROTEIN;
	}
	
    /**
     * Getter for TOTAL_OTHER.
     * @return double
     */
	public double getTotalOther(){
		return this.TOTAL_OTHER ;
	}
	
    /**
     * Getter for TOTAL_CALORIES.
     * @return double
     */
	public double getTotalCalories(){
		return this.TOTAL_CALORIES ;
	}
	
    /**
     * Getter for actualGrains.
     * @return double
     */
    public double getActualWholeGrains(){
        return 	this.actualGrains;
    }
    
    /**
     * Getter for actualFV.
     * @return double
     */
    public double getActualFV(){
		return  this.actualFV;
	}	
    
    /**
     * Getter for actualProtein.
     * @return double
     */
	public double getActualProtein(){
		return this.actualProtein;
	}
	
    /**
     * Getter for actualOther.
     * @return double
     */
	public double getActualOther(){
		return this.actualOther;
	}
	
    /**
     * Getter for actualCalories.
     * @return double
     */
	public double getActualCalories(){
		return this.actualCalories;
	}
	/**
	 * Setter for actualGrains.
	 * @param num
	 */
    public void setActualWholeGrains(double num){
         	this.actualGrains = num;
    }
    
    /**
     * Setter for actualFV.
     * @param num
     */
    public void setActualFV(double num){
		  this.actualFV = num;
	}	
    
    /**
     * Setter for actualProtein.
     * @param num
     */
	public void setActualProtein(double num){
		 this.actualProtein = num;
	}
	
	/**
	 * Setter for actualOther.
	 * @param num
	 */
	public void setActualOther(double num){
		 this.actualOther = num;
	}
	/**
	 * Setter for actualCalories.
	 * @param num
	 */

	public void setActualCalories(double num){
		 this.actualCalories = num;
	}	
	/**
	 * Getter for myData.
	 * @return SQLData
	 */
	public SQLData getMyData(){
		return this.myData;
	}
	
	/**
	 * Setter for myData.
	 * @param myData
	 */
	public void setMyData(SQLData myData){
		this.myData = myData;
	}
	
	/*
	 * This method updates inventory if the hamper is valid.
	 * All the FoodItems which are added to ArrayList<FoodItem> hamperItems,
	 * are replaced by the dummyFood FoodItem inside ArrayList of foodItems for updatedInventory.
	 */
    public void updateInventory(){
        Inventory inventory = myData.getUpdatedInventory();	  
		ArrayList<FoodItem> foodInsideInventory = inventory.getInventoryItems();
		if(valid){
		    for(int i = 0; i<hamperItems.size();i++){
				foodInsideInventory.set(hamperItems.get(i).getItemID()-1, this.dummyFood);
			}
        }					
	}
    
    /**
     * Getter for valid.
     * @return boolean
     */
	public boolean getValid(){
		return this.valid;
	}
	
	/**
	 * Setter for valid.
	 * @param validity
	 */
    public void setValid(boolean validity){
        this.valid = validity;
    }
    
    /**
     * Recursive method that finds all the sub-sets of a given ArrayList.
     * @param set
     * @return  ArrayList<ArrayList<FoodItem>>
     */
	public ArrayList<ArrayList<FoodItem>> getSubsets(ArrayList<FoodItem> set) {

		ArrayList<ArrayList<FoodItem>> subsetCollection = new ArrayList<ArrayList<FoodItem>>();

		if (set.size() == 0) {
			subsetCollection.add(new ArrayList<FoodItem>());
		} 
		else {
			ArrayList<FoodItem> reducedSet = new ArrayList<FoodItem>();
			reducedSet.addAll(set);
			FoodItem first = reducedSet.remove(0);
			ArrayList<ArrayList<FoodItem>> subsets = getSubsets(reducedSet);
			subsetCollection.addAll(subsets);
			subsets = getSubsets(reducedSet);

			for (ArrayList<FoodItem> subset : subsets) {
				if(!first.getName().equals("")) {
					subset.add(0, first);
				}
			}
			subsetCollection.addAll(subsets);
		}
		return subsetCollection;
	}
	
	/*
	 * Fills the hamperItems ArrayList with the optimal combination of FoodItems, reducing excess waste in the,
	 * actualCalories field. Calls the getSubsets() method to determine optimal FoodItem combinations.
	 */
	public void fillHamper() {
		
    	Inventory inventory = myData.getUpdatedInventory();
    	ArrayList<FoodItem> items = inventory.getInventoryItems();
    	
		ArrayList<ArrayList<FoodItem>> allsubsets = getSubsets(items);
    	ArrayList<Hamper> hamperCombos = new ArrayList<Hamper>();
    	ArrayList<Hamper> invalidHamperCombos = new ArrayList<Hamper>();
    	for(int i = 0; i < allsubsets.size(); i++) {
    		double wg = 0;
    		double fv = 0;
    		double pro = 0;
    		double other = 0;
    		double cal = 0;
    		for(int j = 0; j < allsubsets.get(i).size(); j++) {
    			wg += allsubsets.get(i).get(j).getGrainContent()*allsubsets.get(i).get(j).getCalories()*0.01;
    			fv += allsubsets.get(i).get(j).getFVContent()*allsubsets.get(i).get(j).getCalories()*0.01;
    			pro += allsubsets.get(i).get(j).getProContent()*allsubsets.get(i).get(j).getCalories()*0.01;
    			other += allsubsets.get(i).get(j).getOtherContent()*allsubsets.get(i).get(j).getCalories()*0.01;
    			cal += allsubsets.get(i).get(j).getCalories();
    		}
    		if(wg>=TOTAL_GRAINS && fv>=TOTAL_FV && pro>=TOTAL_PROTEIN && other>=TOTAL_OTHER && cal>=TOTAL_CALORIES) {
    			hamperCombos.add(new Hamper(allsubsets.get(i), wg, fv, pro, other, cal, TOTAL_GRAINS, TOTAL_FV, TOTAL_PROTEIN, TOTAL_OTHER, TOTAL_CALORIES));
    		}
    		else {
    			if(cal>TOTAL_CALORIES&&(fv<TOTAL_FV || pro<TOTAL_PROTEIN || other<TOTAL_OTHER || cal<TOTAL_CALORIES))
    				invalidHamperCombos.add(new Hamper(allsubsets.get(i), wg, fv, pro, other, cal, TOTAL_GRAINS, TOTAL_FV, TOTAL_PROTEIN, TOTAL_OTHER, TOTAL_CALORIES));

    		}
    	}
    	if(!hamperCombos.isEmpty()) {
    		Hamper optimalHamper = hamperCombos.get(0);
    		for(int i = 0; i < hamperCombos.size(); i++) {
    			if(hamperCombos.get(i).getActualCalories() < optimalHamper.getActualCalories()) {
    				optimalHamper = hamperCombos.get(i);
    			}
    		}
        	actualGrains=optimalHamper.getActualWholeGrains();
			actualFV=optimalHamper.getActualFV();
			actualProtein=optimalHamper.getActualProtein();
			actualOther=optimalHamper.getActualOther();
			actualCalories=optimalHamper.getActualCalories();
            hamperItems = optimalHamper.getHamperItems();
            this.valid = true;

    	}
    	else {
    		if(!invalidHamperCombos.isEmpty()) {
        		Hamper optimalHamper = invalidHamperCombos.get(0);
        		for(int i = 0; i < invalidHamperCombos.size(); i++) {
        			if(invalidHamperCombos.get(i).getActualCalories() > optimalHamper.getActualCalories()) {
        				optimalHamper = invalidHamperCombos.get(i);
        			}
        		}
        		actualGrains=optimalHamper.getActualWholeGrains();
				actualFV=optimalHamper.getActualFV();
				actualProtein=optimalHamper.getActualProtein();
				actualOther=optimalHamper.getActualOther();
				actualCalories=optimalHamper.getActualCalories();
                hamperItems = optimalHamper.getHamperItems();
    		}
    		else {
        		actualGrains=Double.MAX_VALUE;
				actualFV=Double.MAX_VALUE;
				actualProtein=Double.MAX_VALUE;
				actualOther=Double.MAX_VALUE;
				actualCalories=0;
                hamperItems = new ArrayList<FoodItem>();
    		}  
    	}
	}
	
	/**
	 * Returns string telling which nutrition component is deficient inside the Inventory.
	 * @return
	 */
	public String checkGaps() {
		StringBuilder gaps = new StringBuilder();
	

		if(this.actualGrains < this.TOTAL_GRAINS) {
			gaps.append("whole grains,");
		}
		if(this.actualFV < this.TOTAL_FV) {
			gaps.append("fruits or veggies,");
		}
		if(this.actualProtein < this.TOTAL_PROTEIN) {
			gaps.append("protein,");
		}
		if(this.actualOther < this.TOTAL_OTHER) {
			gaps.append("other content,");
		}
		if(this.actualCalories < this.TOTAL_CALORIES) {
			gaps.append("food to meet total calories,");
		}
		return gaps.toString();
	}
}