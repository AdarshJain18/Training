package com.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
		System.out.println(numList);
		
		List<Integer> listWithoutDuplicates = numList.stream().distinct().collect(Collectors.toList());
		System.out.println(listWithoutDuplicates);
	}
}
