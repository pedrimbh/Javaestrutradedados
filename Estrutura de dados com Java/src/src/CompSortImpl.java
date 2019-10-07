package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompSortImpl {
	public static void main(String[] args) {
	List<Person> arr = new ArrayList<Person>();
	
	arr.add(new Person("Joao", 27));
	arr.add(new Person("Ely", 27));
	arr.add(new Person("Mariela", 28));
	arr.add(new Person("Ana", 57));
	arr.add(new Person("Abel", 63));
	arr.add(new Person("Maria", 57));
	arr.add(new Person("Tiao", 67));
	arr.add(new Person("Tiaojr", 37));
	arr.add(new Person("Franco", 17));
	arr.add(new Person("Lu", 41));
	
	for (Person p :arr) {
		System.out.println(p.getName() + " " + p.getAge());
	}
	
	System.out.println("");
	
	Collections.sort((List)arr);
	
	for (Person p :arr) {
		System.out.println(p.getName() + " " + p.getAge());
	}
}
}
