package xyz.compar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* Use of Comparator Interface */
/* author: Abhaysingh Solanki
 *Date   : 6/2/2019
 *Motive : Understand the magic behind programming
 */


public class Democlass {

	public static void main(String[] args) {
		
		ArrayList<Integer> a =new ArrayList<Integer>();
		
		a.add(456);
		a.add(765);
		a.add(500);
		Collections.sort(a);
		
	System.out.println("Simple sorting ");	
		for(Integer aa:a)
		{
			System.out.println(aa);
		}
		
		Comparator<Integer> com=new Comparatorsorting();
		
		Collections.sort(a, com);
		System.out.println("Comparator sorting");
		System.out.println("This Sorting of data is customised (based on user requirement)");
		for(Integer aaa:a)
		{
			System.out.println(aaa);
		}
		
	Comparator< Integer> cmp=new Comparator<Integer>() {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			if(o1%100<o2%100)  // sorting based on the last two digit
			{
				return 1;
			}
			else
				return -1;
		}
	};	
	
	Collections.sort(a, cmp);
	System.out.println("comparator sorting by using anonymous inner class concept");
	for(int mycomp:a)
	{
		System.out.println(mycomp);
	}
	
	
		
	}
	
	
}
