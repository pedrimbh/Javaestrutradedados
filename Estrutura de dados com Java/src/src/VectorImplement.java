package src;

import java.util.Vector;

public class VectorImplement {
	public static void main(String[] args) {
//		int[] arr = new int[10];
//		arr[0] = 1;
//		arr[1] = "5";
		Vector v = new Vector<>(2, 1);
		System.out.println(v.capacity());

		v.addElement(1);
		v.addElement("a");
		System.out.println(v.size());

		
//		v.remove(0);
		v.addElement("bc");
		System.out.println(v.capacity());
		
//		while(v.elements().hasMoreElements()) {
//			System.out.println(v.elements().nextElement());
//		while(v.iterator().hasNext()) {
//			System.out.println(v.elements().nextElement());
//		}
	}
}
