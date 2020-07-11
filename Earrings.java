public class Earrings extends Item 
{   
	private String style; 
 
   public Earrings(int styleNumber, String description,String material, double cost, String style)  
   {      
   super(styleNumber, description, material, cost);   
   this.style = style;   
   } 
 
   public double calculatePrice()   
   {     
   if (style.equalsIgnoreCase("pierced"))
   {          
   return 1.9 * getCost();      
   }    
   else      
   {         
   return 2.2 * getCost();   
   }    
   } 
 
   public String getDetails()    
   {      
   return super.getDetails() + ", style: " + style;  
   }
	
	public static void main(String [] args)  
	{   
	 Earrings earrings= new Earrings(400, "Hoop Earings", "silver", 200.0,"pierced"); 
 
	 System.out.println(earrings); 
	 // price should be 380.0 
	}
	
	} 
 