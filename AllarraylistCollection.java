/* author: Abhaysingh Solanki
 *Date   : 20/8/18
 *Motive : Understand the magic behind programming
 */

package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class AllarraylistCollection {

	public static void main(String[] args) {

	// create array list	
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
// Retrive the array list		

ListIterator itr= al.listIterator();		

System.out.println("Retrive the Element in forward direction");
while(itr.hasNext())
{
	System.out.println(itr.next());
}

System.out.println("Retrive the Element in Backward direction");
while(itr.hasPrevious())	
{
	System.out.println(itr.previous());
}

System.out.println("Retrive the Element by using for loop");
for(int i=0;i<al.size();i++)
{
	System.out.println(al.get(i));
}

System.out.println("Retriving the Element by using for-each loop");
for(Integer aa:al)
{
	System.out.println(aa);
}

al.add(3, 40); // add the element in specific index

System.out.println("After adding the element");
for(int i=0;i<al.size();i++)
{
	System.out.println(al.get(i));
}
al.remove(3);
System.out.println("After removing the Element of specific index(At 3rd position)");
for(int i=0;i<al.size();i++)
{
	System.out.println(al.get(i));
}

}//end of main method
} //end of class loop
