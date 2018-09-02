
/*Author -Abhay Singh Solanki
 * Date-02 September 2018
 * Motive -Understand the logic behind programming
 */


package set;

import java.util.LinkedHashSet;

/*
 * 1)	The underlying data structure is a combination of LinkedList and Hashtable.
 * 2)Insertion order is preserved.
 * 3)Introduced in 1.4v.
 */

public class Linkedhashset {

	public static void main(String[] args) {
		
		
		LinkedHashSet lh=new LinkedHashSet<>();
		lh.add("A");
		lh.add("B");
		lh.add("C");
		lh.add(null);
		System.out.println(lh);
	}
	
	
	
}
