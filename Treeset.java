
/*Author -Abhay Singh Solanki
 * Date-02 September 2018
 * Motive -Understand the logic behind programming
 */

package set;

import java.util.TreeSet;

/*Tree set
1.The underlying data structure is balanced tree.
2.Duplicate objects are not allowed.
3.Insertion order is not preserved and it is based on some sorting order of objects.
4.Heterogeneous objects are not allowed if we are trying to insert heterogeneous objects then we will get ClassCastException.
Null insertion is possible(only once).
*/
public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		TreeSet t=new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		System.out.println(t);
	}

}
