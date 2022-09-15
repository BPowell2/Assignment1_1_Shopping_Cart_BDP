//Benjamin Powell 9/14/22 this is the shopping cart generic class

public class ShoppingCart<T>  { 

 

ResizableArrayBag<T> [] MyArrayBag = new ResizableArrayBag [50]; 


private int Length = 0; 

public int price = 0;

public int entrys = 0;





/**  
* checks the size of the shopping cart  
* @return an int value of the number of items in the shopping cart  
*/  

public int getsize() { 

 

return MyArrayBag.length; 

}//end of getsize

  

/**  
* checks the shopping cart to check if it is empty or not   
* @return true or false depending on if the shopping cart is empty or not   
*/  


public boolean isEmpty() { 

if (entrys==0)  {
	return true; 
	
}//end of if statement
else {
	return false;
}// end of else statement

} 

  
/**  



* this adds a item to the current shopping cart  
* @param item is added to the shopping cart as a new item  
* @return true if the item is added or false if it is not   
*/  
 

public boolean add(ResizableArrayBag<T> item, int cost) { 

price = price+cost;

MyArrayBag[Length] = item; 

Length++; 
entrys++;

return true; 

}//end of add method

  

 
/**  
* this removes a item from the current shopping cart  
* @return true if the item is removed and false if not   
*/ 

public void remove() { 

 MyArrayBag[entrys] = null;
 entrys = entrys -1;



}//end of remove method

  

/**  
* this method removes a particular item from the shopping cart  
* @param item is removed from the shopping cart   
* @return true if the item is removed or false if it is not removed  
*/  

public void removeItem(int item, int costremoved) { 

price= price-costremoved;	
 MyArrayBag[item] = null;
 

}//end of removeitem method

  

/**  
* this method clears the shopping cart  
* @return true if the cart is cleared or false if it is not cleared   
*/   

public void clear() { 

	while (!isEmpty()) {
		remove();
	}// end while
 



}// end of clear method

  

/**  



* this method takes a item and sees how many times that item shows up in the shopping cart  
* @param item is used to tell the method what item it is looking for inside the shopping cart  
* @return true if the  key item is found or false if the key item is not found  
*/  

public int getFrequency(int[] arr,int  item) { 

 int counter = 0;
 
 for(int i =0; i<=50; i++) {
	 if (arr[i]== item){
		 counter++;
	 }// end of if statement
	 
 }//end of for loop
return counter;

}// end of getFrequency method

 
/** 
* this is used to print out the shopping cart in a array   
* @return the shoppping cart as a array  
*/  
  

 

public void toArray() {
	System.out.println("the price is "+price);
	for (int i = 0; i< MyArrayBag.length; i++) {
		if(MyArrayBag[i] == null) {
			return ;
		}
		for(int j = 0; j< MyArrayBag[i].bag.length; j++) {
		System.out.println(MyArrayBag[i].bag[j]);	
		}// end of for
	}// for loop 
	


 

 

}//end of toArray


  

 


  

  

  

  

  

  

  

}// end of shopping cart
