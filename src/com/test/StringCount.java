package com.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCount {
	public static void main(String[] args) {

		String s = "welcome to java welcome to selenium welcome to python";
		String[] split = s.split("");
		Map<String,Integer> mp= new LinkedHashMap<String,Integer>();
		for (int i = 0; i < split.length; i++) {
		String s1 = split[i];
		if (mp.containsKey(s1)) {
		Integer x = mp.get(s1);
		mp.put(s1, x+1);
	    }else{
		mp.put(s1, 1);	
		}
        }
		System.out.println(mp);
        }
        }