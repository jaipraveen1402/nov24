package org.sample;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class SampleProgram {
	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<Integer, String>();
		m.put(10,"java");
		m.put(20,"sql");
		m.put(20,"oops");
		m.put(40,"sql");
		m.put(50,"oracle");
		m.put(60,"db");
		m.put(10,"selenium");
		m.put(50,"psql");
		m.put(40,"haldoop");
		System.out.println(m);
		Set<Integer> allkeys = m.keySet();
		System.out.println(allkeys);
		Collection<String> allvalues = m.values();
		System.out.println(allvalues);
		
		Set<Entry<Integer, String>> ent = m.entrySet();
		System.out.println(ent);
		for (Entry<Integer, String> itrval : ent) {
			System.out.println(itrval);
			
		}
		for (Entry<Integer, String> keys : ent) {
			Integer k = keys.getKey();
			String v = keys.getValue();
			System.out.println(k);
			System.out.println(v);
			
		
		}
	}

}
