package com.codepracto.samplePrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FindDigits {

	public FindDigits() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	static int countDigits = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1<=T<=15
		//0<N<10 raise to the power 9
		
		//int n =12;
	
	 Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    int tmp = 0;
	    int modlus = 0;
	    if(t>=1 && t<=15)
	    {
		    for(int a0 = 0; a0 < t; a0++){
		        int n = in.nextInt();
		        
		        if(n>0 && n< Math.pow(10, 9))
		        {
		        	countDigits=0;
		        	//addToIntegerList(n);
		        	//int count = findEvenDivisibleCount(n,dividend);
		        	//System.out.println("counter: "+FindDigits.countDigits);
		        	System.out.println(FindDigits.countDigits);
		        	//System.out.println(((123456789/7))%2);
		        }
		    }
	    }
	    
		//System.out.println((12/2)%2);
	    //System.out.println(Math.pow(10, 9));
	}

	
	private static void addToIntegerList(int n) {
		ArrayList<Integer> intArray  = new ArrayList<Integer>();
		int length = String.valueOf(n).length();
		//System.out.println("length:"+length);
		while(length>0)
		{
			
			int tmp = n/10;//2012=101	
			intArray.add(n);
			n=tmp;//101
	    	length=length-1;
		}
		Iterator it = intArray.iterator();
		while(it.hasNext())
		{
			int j = (int) it.next();
			System.out.println("item: "+j%10);
			int k = j%10;
			if(k>0)
			{
				
				if((n/k)%2==0)
	    		{
	    			FindDigits.countDigits++;
	    			
	    		}
			}
			
		}
		//System.out.println("FindDigits.countDigits"+ FindDigits.countDigits);
		
	}

}
