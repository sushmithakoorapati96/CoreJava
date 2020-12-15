package Core;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("mango");
		list.add("pineapple");
		System.out.println(list);

		Iterator itr = list.iterator();
		{
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}

	}

}
