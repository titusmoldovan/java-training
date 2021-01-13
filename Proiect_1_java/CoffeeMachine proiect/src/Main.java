public class Main {
   public static void main(String[] args) {

      Coffee coffee = new Espresso();
      coffee.getCoffee();
      System.out.println();
      
      coffee = new Cappuccino();
      coffee.getCoffee();	
      System.out.println();	
      
      coffee = new LatteMacchiato();
      coffee.getCoffee();	
      System.out.println();	
   }
}

/*

In Template Pattern, clasa abstracta "Coffee" expune moduri diferite pentru a-si executa metodele.
Subclasele sale pot suprascrie implementarea metodei in functie de particularitatile clasei generale.

Am creat o clasa abstracta "Coffee" care defineste operatiunea generala "getCoffee" setata cu
atributul "final", pentru a nu putea fi suprascrisa (dar pot fi suprascrise metodele apelate
in functia generala "getCoffee").

*/