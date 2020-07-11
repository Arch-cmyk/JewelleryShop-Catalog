public class Item
{
	
		private int styleNumber;
		private String description;
		private String material;
		//private double wholeSaleCost;
		//private double retailPrice;
		//both can be merged into one attribute
		private double cost;
		
		public Item(int styleNumber, String description, String material, double cost)
		{
			this.styleNumber=styleNumber;
			this.description = description;      
			this.material = material;       
			this.cost = cost;   
		} 
 
		public double getCost()
		{    
			return cost;    
		} 
		
		public double calculatePrice()
		{
			double price=0;
			if(material.equalsIgnoreCase("gold"))
			{
				price= 2*cost;
			}
			else if(material.equalsIgnoreCase("silver"))
			{
				price= 1.9*cost;
			}
			else	//other materials
			{
				price=1.8*cost;
			}
			
			return price;
		}
		
		public String getDetails()
		{
			return "styleNumber: " +styleNumber+ ", description: " + description+ ", material: " +material+ ", cost: " +cost+ ", price:" +calculatePrice();
		}
		
		public String toString()
		{
			return getClass().getName() + "[" + getDetails() + "]";
		}
		
		public static void main( String[] args)
		{
			Item item= new Item(100, "Shirt Button", "silver", 50.0);
			System.out.println(item);
		}
}
		
 