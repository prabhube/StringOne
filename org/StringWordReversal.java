package one.org;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringWordReversal {
	public static void main(String[] args) {
		String s="java selenium java selenium java prabhu";
		Map<String,Integer> m=new LinkedHashMap();
		String[] split = s.split(" ");
		for (String string : split) {
			if(m.containsKey(string)) {
				Integer integer = m.get(string);
				m.put(string, integer+1);
			}
			else {
				m.put(string, 0);
			}
		}
		System.out.println(m);
	}
}
