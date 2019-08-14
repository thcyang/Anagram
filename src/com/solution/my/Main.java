package com.solution.my;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DictionaryGenerator dicGen = new DictionaryGenerator();
		List<Character> inputs = new ArrayList<>();
		Solution s = new Solution();
		inputs.add('A');
		inputs.add('i');
		inputs.add('d');
		inputs.add('S');
		Set<String> outputs = s.findAllAnagrams(inputs, dicGen.genDictionary());
		System.out.println(outputs);
	}
}
