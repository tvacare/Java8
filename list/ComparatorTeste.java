package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorTeste {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("Joao");
		palavras.add("Maria");
		palavras.add("Thiago");
		palavras.add("Juliana");

		Collections.sort(palavras);
		System.out.println(palavras); // Sort by alphabetic order

		// NO LAMBDA
		// palavras.sort(new Comparator<String>() {
		// public int compare(String s1, String s2) {
		// return Integer.compare(s1.length(), s2.length()); // Sort by string
		// length
		// }
		// });

		// With LAMBDA
		// palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		// OR YET
		palavras.sort(Comparator.comparing(String::length)); // Comparing length
																// from String

		// NO LAMBDA
		// palavras.forEach(new Consumer<String>() { // ForEach in a simpler way
		// public void accept(String s1) {
		// System.out.println(s1);}}

		// With LAMBDA
		// palavras.forEach(s -> System.out.println(s));
		palavras.forEach(System.out::println);
		// With LAMBDA I do not need to specify whether I`m using a Consumer and
		// it`s method or not because it`s obvious
		// as long as "forEach" just accept Consumer as argument and also
		// there`s only one method in Consumer Interface
	}
}