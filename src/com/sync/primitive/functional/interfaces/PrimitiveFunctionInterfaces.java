package com.sync.primitive.functional.interfaces;

import java.util.function.DoubleFunction;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class PrimitiveFunctionInterfaces {

	public static void main(String[] args) {
		
		IntPredicate intpredicate = i -> i%2==0;
		System.out.println("Divide by 2 check : "+intpredicate.test(3));
		System.out.println("Divide by 2 check : "+intpredicate.test(30));
		System.out.println("Divide by 2 check : "+intpredicate.test(13));
		System.out.println("Divide by 2 check : "+intpredicate.test(44));

		//////////////////////////////////////////////////////////////
		
		IntFunction<Integer> squareCalculator = num -> num * num;
		System.out.println("Square of 10 : " + squareCalculator.apply(10));

		IntFunction<String> concatinator = num -> "Tester " + num;
		System.out.println("Concatinate : " + concatinator.apply(22));

		DoubleFunction<Double> doubleCheck = d -> d + d;
		System.out.println("Double tester : " + doubleCheck.apply(44.0));

		ToIntFunction<Integer> toIntChecker = i -> i * 2 * 4;
		System.out.println("To Int checker : " + toIntChecker.applyAsInt(12));

		IntToDoubleFunction intToDouble = i -> 20.0 * i;
		System.out.println("Int to double check : " + intToDouble.applyAsDouble(43));
		
		////////////////////////////////////////////////////////////////
		
		IntConsumer mycon = i -> System.out.println("Square : "+i*i);
		mycon.accept(20);
		
		////////////////////////////////////////////////////////////////
		
		IntSupplier intSupplier = () -> (int) (Math.random()*12);
		System.out.println("Int Supplier : "+intSupplier.getAsInt());
	}

}
