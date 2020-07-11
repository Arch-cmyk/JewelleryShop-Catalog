public class Bracelet extends Item 
{  
 private String claspType; 
 
   public Bracelet(int styleNumber, String description,String material, double cost, String claspType)   
   {     
	super(styleNumber, description, material, cost);  
	this.claspType = claspType; 
   } 
 
   public double calculatePrice()   
   {    
   return 1.8 * getCost(); 
   } 
 
   public String getDetails()   
   {   
	return super.getDetails() + ", claspType: " + claspType;  
   } 
 
   public String getClaspType() 
   {   
   return claspType;    
   } 
 
   public static void main(String [] args)   
   {   
   Bracelet bracelet = new Bracelet(300, "Spring Bracelet", "silver",     500.0, "Spring"); 
 
   System.out.println(bracelet); 
   // price should be 900.0 
   }
   } 