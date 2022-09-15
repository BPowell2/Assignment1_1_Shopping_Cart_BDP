//Benjamin Powell Shopping cart interface Tester 09/1/22  

  

   

  

// a interface that describes the operations of the Shopping cart  

  

public interface ShoppingCartInterface <T> {  

  

  

  

/**  

  

* checks the size of the shopping cart  

  

* @return an int value of the number of items in the shopping cart  

  

*/  

  

public int getsize();  

  

  

  

/**  

  

* checks the shopping cart to check if it is empty or not   

  

* @return true or false depending on if the shopping cart is empty or not   

  

*/  

  

public boolean isEmpty();  

  

  

  

/**  

  

* this adds a item to the current shopping cart  

  

* @param item is added to the shopping cart as a new item  

  

* @return true if the item is added or false if it is not   

  

*/  

  

public boolean add(ResizableArrayBag<T> item, int cost);  

  

  

  

/**  

  

* this removes a item from the current shopping cart  

  

* @return true if the item is removed and false if not   

  

*/  

  

public void remove();  

  

/**  

  

* this method removes a particular item from the shopping cart  

  

* @param item is removed from the shopping cart   

  

* @return true if the item is removed or false if it is not removed  

  

*/  

  

public void removeItem(int item, int costremoved); 

  

  

  

/**  

  

* this method clears the shopping cart  

  

* @return nothing  

  

*/  

  

public void clear();  

  

  

  

/**  

  

* this method takes a item and sees how many times that item shows up in the shopping cart  

  

* @param item is used to tell the method what item it is looking for inside the shopping cart  

  

* @return true if the  key item is found or false if the key item is not found  

  

*/  

  

public int getFrequency(int[] arr,int  item); 

  
/**
 * this sets
 * @return amount
 */
  


/** 

  

  

* this is used to print out the shopping cart in a array   

  

* @return the shoppping cart as a array  

  

*/  

  

public T [] toArray();  

  

  

  

  

  

   

  

  

  

   

  

}// end of interface 
