package org.sample;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class SampleProgram3 {
	public static void main(String[] args) {
		Map<String,String> m = new Hashtable<String, String>();
		m.put("vel","selenium");
		m.put("ganesh","framework");
		m.put("dinesh","oracle");
		m.put("venkat","corejava");
		m.put("subash","jira");
		System.out.println(m);
		Set<String> allkeys = m.keySet();
		System.out.println(allkeys);
		Collection<String> allvalues = m.values();
		System.out.println(allvalues);
		Set<Entry<String, String>> abc = m.entrySet();
		System.out.println(abc);
		for (Entry<String, String> def : abc) {
			System.out.println(def);
		}
		for (Entry<String, String> ent : abc) {
			String key = ent.getKey();
			String value = ent.getValue();
			System.out.println(key);
			System.out.println(value);
		}
	}
}
