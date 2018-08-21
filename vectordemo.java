
/* author: Abhaysingh Solanki
 *Date   : 21/8/18
 *Motive : Understand the magic behind programming
 */


/*vector is a legacy class introduced in v1.0
 * Thread safe .
 * Every method is synchronised(Thread safe).
 * The underlying data structure is resizable array (or) growable array.
 * Duplicate objects are allowed.
 *  Insertion order is preserved.
 *  Heterogeneous objects are allowed.
 *  Null insertion is possible.
 
  */
package collection;

import java.util.Vector;

public class vectordemo {

	
	public static void main(String[] args) {
		
Vector v=new Vector<>();
System.out.println(v.capacity());//		

for(int i=0;i<10;i++)
{
	v.addElement(i);
}
	System.out.println(v.capacity());	//10
	v.addElement("abhay");
	
	System.out.println(v.capacity());//20
	System.out.println(v); // 0-9 abhay
	
	
	}
}
