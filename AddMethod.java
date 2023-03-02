package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddMethod 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(50);
		al.add(40);
		al.add(10);
		al.add(60);
		
		System.out.println(al.toString());
		
		System.out.println("contains method : "+al.contains(10));
		
		System.out.println("indexOf method : "+al.indexOf(10));
//		
//		System.out.println("is Empty : "+al.isEmpty());
//		
//		System.out.println("Last index of : "+al.lastIndexOf(60));
//		
//		System.out.println("Remove method : "+al.remove(1));
//	
//		System.out.println("size method : "+al.size());
//		
//		System.out.println("get method : "+al.get(2));
//
//		//al.clear();
//		System.out.println("Clear method : "+al);
//		
//		al.set(1, null);
//		
//		System.out.println(al);
//		
//		Object[] a= al.toArray();
//		System.out.println(Arrays.toString(a));
		
		int start=1;
		int end=4;
		
		List<Integer> myList=al.subList(start, end);

		System.out.println("SubList : "+myList);
	
	
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		al1.add(50);
		al1.add(40);
		al1.add(10);
	
		
		boolean isEquals=al.equals(al1);
		
		System.out.println(isEquals);
		
		al.addAll(al1);
		System.out.println(al);
		
		
		ArrayList<Integer> myCloneArrayList =(ArrayList<Integer>)al1.clone();
		
		
		System.out.println(myCloneArrayList);
	
		
	
	
	
	}

}
