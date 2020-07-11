public class Tester 
{ 
 public static void main(String[] args)  
 {   
 Item item1 = new Item(100, "Shirt Button", "silver", 50.0);
 Item item2 = new Ring(200, "Casual Ring", "silver", 500.0, 'M');  
 Item item3 = new Bracelet(300, "Spring Bracelet", "silver", 500.0,"Spring");
 Item item4 = new Earrings(400, "Hoop Earings", "silver", 200.0,"pierced"); 
 
 
  Item[] items = {item1, item2, item3, item4}; 
 
  // display details of all items   
  for(Item item: items)   
  {    
  System.out.println(item);  
  } 
 
  // display details of all the rings  
  for(Item item: items)   
  {   
  if(item instanceof Ring)   
  {    
  System.out.println(item);  
  }   
  } 
 
  // count rings that cost more than 500 dollars each  
  int count = 0;  
  for(Item item: items) 
  {   
  if(item instanceof Ring && item.calculatePrice() > 500)  
  {    
  count++;   
  }   
  }   
  System.out.println(count); 
 
  // count bracelets with spring clasp type   
  count = 0;  
  for(Item item: items)   
  {    
  if(item instanceof Bracelet && ((Bracelet) item).getClaspType().equals("Spring")) 
  {    
  count++; 
  }   
  }   
  System.out.println(count); 
  } 
  }