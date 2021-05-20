package com.sync.supplier;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {

		String test = "My Test String";
		Supplier<String> mySup = () -> test.substring(0, 7);
		
		System.out.println("Substring : " +mySup.get());
	}

}
