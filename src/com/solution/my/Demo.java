package com.solution.my;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DictionaryGenerator dicGen = new DictionaryGenerator();
		List<Character> inputs = new ArrayList<>();
		Solution sol = new Solution();
		
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextLine()) {
			String str = scan.nextLine();
			if (str.equals("end")) {
				break;
			}
			inputs.add(str.charAt(0));
		}
		scan.close();
		
		Set<String> outputs = sol.findAllAnagrams(inputs, dicGen.genDictionary());
		System.out.println(outputs);
	}
}
