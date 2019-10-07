package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrSync {
	public static void main(String[] args) {
	//	List<String> list = Collections.synchronizedList(new ArrayList<String>());
		
		List<String> list = new CopyOnWriteArrayList<String>();
		
		list.add("Joao");
		list.add("Pedro");
		list.add("Mesquita");
		list.add("Ely");
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
		
		System.out.println(iterator.next());
		}
//		synchronized (list) {
//			Iterator<String> iterator = list.iterator();
//			
//			while(iterator.hasNext()) {
//				
//				System.out.println(iterator.next());
//			}
//		}
	}

}
