package org.sample;
import java.util.TreeMap;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SampleProgram2 {
	public static void main(String[] args) {
		Map<Character,Integer> m = new TreeMap<Character, Integer>();
		m.put('!',10);
		m.put('@',20);
		m.put('#',30);
		m.put('$',40);
		m.put('%',50);
		m.put('^',60);
		m.put('&',10);
		m.put('*',50);
		m.put('(',40);
		System.out.println(m);
		Set<Character> allkeys = m.keySet();
		System.out.println(allkeys);
		Collection<Integer> allvalues = m.values();
		System.out.println(allvalues);
		Set<Entry<Character, Integer>> dat = m.entrySet();
		System.out.println(dat);
		for (Entry<Character, Integer> val : dat) {
			System.out.println(val);
		}
		for (Entry<Character, Integer> v : dat) {
			Character vi = v.getKey();
			Integer k = v.getValue();
			System.out.println(vi);
			System.out.println(k);
		}
	}
}
