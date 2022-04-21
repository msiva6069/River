package com.test;

public class CharactorNumberOnly {

	public static void main(String[] args) {
		String d = "0";
		String s = "jhgdfuky8746546";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
			d = d + c;
			}
		    }
	     	System.out.println(d);
	        }
            }
