package com.collection.bll;

import java.util.ArrayList;
import java.util.Arrays;

public class MinToFront {

	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3,8,92,4,2,17,9));
		
		System.out.println("Before list :"+list);
		
		int min = minToFront(list);
		
		list.remove(new Integer(min));
		
		list.add(0,min);
		
		System.out.println("After list"+list);

	}
	public static int minToFront(ArrayList<Integer> list) {
		
		int minimum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (minimum > list.get(i))
                minimum = list.get(i);
        }
        return minimum;
	}

}

