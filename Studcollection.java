
/* author: Abhaysingh Solanki
 *Date   : 20/8/18
 *Motive : Understand the magic behind programming
 */

package collection;

import java.util.ArrayList;
import java.util.ListIterator;


 class Studn{
    int id;
	String name;
	int age;
	
	public Studn(int id,String name,int age) {
		
		this.age=age;
		this.id=id;
		this.name=name;
		
	}
	
	
}



public class Studcollection {

	public static void main(String[] args) {
		
		
		Studn s1=new Studn(1, "abhay", 30);
		Studn s2=new Studn(1, "faraz", 40);
		Studn s3=new Studn(1, "madan", 50);
		
		
		ArrayList<Studn> sl=new ArrayList<Studn>();
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		
		ListIterator itr=sl.listIterator();
		
		while (itr.hasNext()) {
		Studn st=(Studn)itr.next();
		
		System.out.println(st.id+" "+st.name+" "+st.age);
			
		}
		
		
	}
	
}
