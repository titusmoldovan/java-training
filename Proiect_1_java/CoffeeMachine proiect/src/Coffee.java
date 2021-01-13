public abstract class Coffee {
   abstract void fillCup();
   abstract void putSugar();
   abstract void showPrice();

   public final void getCoffee(){
	   fillCup();
	   putSugar();
	   showPrice();
   }
}