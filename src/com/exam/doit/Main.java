package com.exam.doit;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// get the first letter with more than 1 instance from an input string
		// example: pneumonoultramicroscopicsilicovolcanoconiosis
		/*
		 * Scanner scannerInput = new Scanner(System.in);
		 * System.out.println("Enter a string to count: "); String inputString =
		 * scannerInput.nextLine(); System.out.println("Input string is: " +
		 * inputString);
		 */
		String inputString = "thisisatestlistoflettertocheckbubblelishious";
		Stream<String> letters = Arrays.stream(inputString.split(""));
		//Stream<String> sorted = letters.sorted();
		//letters.toList().forEach(System.out::println);
		
		Map<String, Long> collect = letters.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		//Map<Object, List<String>> collect = letters.collect(Collectors.groupingBy(o -> o));
		System.out.println(collect);
		//letters.forEach(System.out::println);		
		
		/*
		 * Set<Character> inputSetCharacters = inputString.chars().mapToObj(c -> (char)
		 * c).collect(Collectors.toSet()); List<char[]> arrayInputString =
		 * Arrays.asList(inputString.toCharArray());
		 */
		
		//inputSetCharacters.stream().collect().collect.sorted().forEach(System.out::println);

		// inputSetCharacters.forEach(System.out::println);

	}

}
