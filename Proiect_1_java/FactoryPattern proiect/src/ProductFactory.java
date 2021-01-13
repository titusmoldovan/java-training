public class ProductFactory {

   public Product getProduct(String productType){
      if(productType == null)
         return null;
      
      if(productType.equalsIgnoreCase("TV"))
         return new TV();
         
      if(productType.equalsIgnoreCase("MONITOR"))
         return new Monitor();
         
      if(productType.equalsIgnoreCase("LAPTOP"))
         return new Laptop();
      
      return null;
   }
}