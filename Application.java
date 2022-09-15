//benjamin powell testing class for shopping cart methods

public class Application { 

public static void main(String[]args) { 

ShoppingCart<String> Cart1 = new ShoppingCart<String>(); 

ShoppingCart<String> Cart2 = new ShoppingCart<String>();
String[] contents1 = {"Milk", "Shoes"};
Cart1.add(new ResizableArrayBag<String>(contents1), 1000); 


 
Cart1.toArray();
 
Cart1.remove();

Cart1.toArray();

Cart1.add(new ResizableArrayBag<String>(contents1), 1000);

Cart1.toArray();

Cart1.removeItem(1, 500);

Cart1.toArray();

String[] contents2 = {"Shirt", "Chicken", "Juice", "Bread", "Cheese"};

Cart2.add(new ResizableArrayBag<String>(contents2), 1000);

Cart2.toArray();

Cart2.clear();

Cart2.toArray();


}//end of main 

}// end of Application 

 
