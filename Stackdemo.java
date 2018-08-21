/* author: Abhaysingh Solanki
 *Date   : 21/8/18
 *Motive : Understand the magic behind programming
 */
/*It is the child class of Vector.
Whenever last in first out(LIFO) order required then we should go for Stack.
Constructor:

It contains only one constructor.

Stack s= new Stack();*/

package collection;

import java.util.Stack;

public class Stackdemo {

	
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);//[A, B, C]
		System.out.println(s.pop());//C
		System.out.println(s);//[A, B]
		System.out.println(s.peek());//B
		System.out.println(s.search("A"));//2
		System.out.println(s.search("Z"));//-1
		System.out.println(s.empty());//false
	}
}
