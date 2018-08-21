/* author: Abhaysingh Solanki
 *Date   : 21/8/18
 *Motive : Understand the magic behind programming
 */

package collection;

import java.util.LinkedList;

public class Linkedlistdemo {

	public static void main(String[] args) {

/* we can go for linkedlist in collection when
		frequent operation is insertion or deletion
	cause is uses doubly linkedlist as a underlying data structure 
	no shifting is needeed performance is better than array list
	Note: retrival of data is worst choice & null insertion is possible	
		*/

		
LinkedList l=new LinkedList<>();
 
 l.add("abhay");
 l.add(10);
 l.add(null);
 System.out.println(l); // abhay 10 null
 l.add(20);
 System.out.println(l); // abhay 10 null 20
 l.set(2, "king");
 System.out.println(l);// abhay 10 king 20
 
 l.remove(3);
 System.out.println(l); // abhay 10 king
 
 
	}

}
