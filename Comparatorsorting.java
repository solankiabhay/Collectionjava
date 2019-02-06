package xyz.compar;

import java.util.Comparator;
/*Comparator Interface Use*/
public class Comparatorsorting  implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1%10<o2%10)
		{
			return 1;  // swap
		}
		return -1; //dnt swap
	}

}
