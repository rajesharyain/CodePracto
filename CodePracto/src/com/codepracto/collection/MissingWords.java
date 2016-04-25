package com.codepracto.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MissingWords {

	public MissingWords() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "I am using program";
		String s2 = " am using ";
		String[] s11 = s1.split(" ");
		String[] s22 = s2.split(" ");
		

		
		HashSet<String> hSet = new HashSet<>();
		HashSet<String> hSet2 = new HashSet<>();
		
		for(int i=0; i<s22.length;i++)
		{
			hSet.add(s22[i]);
		}
		
		List<String> li = new ArrayList<>();
		
		for(int i=0; i<s11.length;i++)
		{
			if(hSet.add(s11[i]))
			{
				li.add(s11[i]);
				
			}
			
		}
		String frnames[]=li.toArray(new String[li.size()]);
		
	}

}
