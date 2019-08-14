package com.solution.my;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	public Set<String> findAllAnagrams(List<Character> chars, Set<String> dictionary) {
		Set<String> results = new HashSet<>();
		Set<String> permutations = new HashSet<>();
		
		//avoid exception
		if (chars == null || chars.size() < 1) {
			return results;
		}
		
		//find all permutations of the input chars
		StringBuilder sb = new StringBuilder();
		for (char c : chars) {
			sb.append(c);
		}
		String str = sb.toString().toLowerCase();
		permute(str.toCharArray(), 0, permutations);
		
		//judge if the permutation in the dictionary
		for (String s : permutations) {
			if (dictionary.contains(s)) {
				results.add(s);
			}
		}
		return results;
	}
	
	//dfs to find all permutations
	private void permute(char[] chars, int index, Set<String> results) {
		if (index == chars.length - 1) {
			results.add(new String(chars));
			return;
		}
		for (int i = index; i < chars.length; i++) {
			//avoid duplicates
			if (index != i && chars[index] == chars[i]) {
				continue;
			}
			
			swap(chars, index, i);
			permute(chars, index + 1, results);
			swap(chars, index, i);
		}
	}
	
	//swap character
	private void swap(char[] chars, int i, int j) {
		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;
	}
}
