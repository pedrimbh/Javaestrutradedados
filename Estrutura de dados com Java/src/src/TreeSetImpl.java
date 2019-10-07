package src;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImpl {
	public static void main(String[] args) {
		
		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("Joao");
		tree.add("Maria");
		tree.add("Tiao");
		tree.add("Joao Mesquita");
		tree.add("Ely");
		tree.add("Efren");
		tree.add("Cabeca");
		
		System.out.println(tree);
		
		Iterator<String> iterator = tree.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}
}
