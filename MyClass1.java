package com.collection;

import java.util.*;

public class MyClass1 {

	public static void main(String[] args) 
	{
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Black");
		al.add("Red");
		al.add("Pink");
		al.add("Green");
		
		//for loop
		
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println(al.get(i));
		}
		System.out.println("----------------------------------------------");
		
		//WHILE LOOP
		
		int j=0;
		while(j<al.size())
		{
			System.out.println(al.get(j));
			j++;
		}
		System.out.println("----------------------------------------------");
		
		//adv for loop
		
		for (String data : al) 
		{
			System.out.println(data);
		}
		
		System.out.println("----------------------------------------------");

		Iterator<String> ar=al.listIterator();
		
		while(ar.hasNext())
		{
			System.out.println(ar.next());
		}
		
		System.out.println("----------------------------------------------");
		
		String ele="white";
		String ele2="red";
		
		for (int i = 0; i < al.size(); i++)
		{
			if(al.get(i).equals(ele2))
			{
				al.set(i, ele);
			}
		}
		System.out.println(al);
		
	}

}
