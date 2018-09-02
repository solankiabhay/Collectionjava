/*Author -Abhay Singh Solanki
 * Date-02 September 2018
 * Motive -Understand the logic behind programming
 */


package set;

import java.util.HashSet;


/*  Hash-set
 * Underlying data Structure is hashtable
If you want to represent group of object as a single entity where 
duplicates are not allowed and insertion order is not preserved go for this
If the frequent operation is search
One null insertion is possible 
Insertion order is based on the hash code of the object

*/

public class hashset {

	
	public static void main(String[] args) {
		
		
		HashSet h=new HashSet();
		
	     h.add("A");
	     System.out.println(h);
	     h.add("B");
	     h.add(null);
	     h.add("A");     /* Duplicates are not allowed */
	     System.out.println(h);
		
	}
	
}
