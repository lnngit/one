package com.lnn;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Hello {

	public static void main(String[] args) {
		// 1. list of words
		// 2. word, count
		// 3. sort by count and word.

		List<String> list = Arrays.asList("I", "Love", "Word", "I", "Love");
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		//map.entrySet().stream().sorted(Comparator.(Entry.comparingByValue()).thenComparing(Entry.comparingByKey()))
		// I - 2, "Word" -1, "Love"- 2
		
	}

	public static void sort(Map<String, Long> map){
		//Map<String, Long> sorted = new LinkedHashMap<String, Long>(map);
		
		 Set<Entry<String, Long>> entrySet = map.entrySet();
		 ArrayList<Entry<String, Long>> arrayList = new ArrayList<>(entrySet);
		// Collections.sort(arrayList, Comparator.comparing(null).reversed().t
		 
		 
		
		System.out.println(arrayList);
	}

}
