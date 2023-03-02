package com.collection;

import java.util.ArrayList;

public class CopyList 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Black");
		al.add("Red");
		al.add("Pink");
		al.add("Green");
		
		ArrayList<String> al2=new ArrayList<>(al);
		
		System.out.println(al2);
		
		System.out.println("-------------------------------");
		
		


	}

}
