package kyu8;

public class BrokenGreetings {
	String name;

	public BrokenGreetings(String personName) {
		name = personName;
	}

	public String greet(String yourName) {
		return String.format("Hi %s, my name is %s", yourName, name);
	}
}