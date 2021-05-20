package com.sync.consumer;

import java.util.function.Consumer;

public class DisplayObjectInformation {

	public static void main(String[] args) {

		String text = "This is a test string for consumer";
		Consumer<String> con = str -> {
			System.out.println("String length : " +str.length());
		};
		
		con.accept(text);
	}

}
