package com.sync.method.reference;

public class ConstructorMethodReference {

	public static void main(String[] args) {

		Sayable s = ConstructorMethodReference::new;
		s.saySomething();

		Messagable msg = ConstructorMethodReference::new;
		msg.myMessage("Whats up dude?");
	}

	public ConstructorMethodReference() {
		System.out.println("Default constructor");
	}

	public ConstructorMethodReference(String myMessage) {
		System.out.println("Param constructor with " + myMessage);
	}

}
