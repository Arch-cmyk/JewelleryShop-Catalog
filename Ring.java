	public class Ring extends Item
 {   
	private char size; 
 
   public Ring(int styleNumber, String description,String material, double cost, char size)   
   {      
	super(styleNumber, description, material, cost);       
	this.size = size;  
   } 
 
   public double calculatePrice()    
   {     
	return 2 * getCost();  
   } 
 
   public String getDetails()  
   {     
	return super.getDetails() + ", size: " + size;   
   } 
 
   public static void main(String [] args) 
   {    
	Ring ring = new Ring(200, "Engagement Ring", "silver", 500.0, 'M'); 
 
	System.out.println(ring); // price should be 1000.0   
   } 
   
   } 