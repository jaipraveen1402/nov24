package org.sample;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SampleProgram1 {
	public static void main(String[] args) {
		Map<Integer,Integer> m = new LinkedHashMap<Integer, Integer>();
		m.put(10,10);
		m.put(20,20);
		m.put(30,30);
		m.put(40,40);
		m.put(50,50);
		m.put(60,60);
		m.put(10,10);
		m.put(50,50);
		m.put(40,40);
		System.out.println(m);
		Set<Integer> allkeys = m.keySet();

		System.out.println(allkeys);
		Collection<Integer> allvalues = m.values();
		System.out.println(allvalues);
		Set<Entry<Integer, Integer>> ent = m.entrySet();
		System.out.println(ent);
		for (Entry<Integer, Integer> itr : ent) {
			System.out.println(itr);
		}
		for (Entry<Integer, Integer> keys : ent) {
			Integer k = keys.getKey();
			Integer v = keys.getValue();
			System.out.println(k);
			System.out.println(v);
		}
		
	}
}
