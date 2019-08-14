package com.solution.my;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class SolutionTest {
	Set<String> dictionary = new DictionaryGenerator().genDictionary();
	List<Character> inputs = new ArrayList<>();
	Solution sol = new Solution();

	@Test
	public void testFindAllAnagrams() {
		inputs.add('A');
		inputs.add('i');
		inputs.add('d');
		inputs.add('S');
		
		int count = 0;
		Set<String> outputs = sol.findAllAnagrams(inputs, dictionary);
		
		for (String s: outputs) {
			assertTrue(dictionary.contains(s));
			count++;
		}
		assertEquals(3, count);
	}
}
