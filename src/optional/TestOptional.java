package optional;

import java.util.Optional;

public class TestOptional {

	public static void main(String [] arg) {
		Person person = new Person("Lai", 10);
		Optional<String> optional = person.getName();
		System.out.println("Optional:" + optional.isPresent());
	}
}
