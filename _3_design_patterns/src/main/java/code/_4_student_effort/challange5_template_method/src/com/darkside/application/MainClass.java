package com.darkside.application;

import java.util.Arrays;

import com.darkside.template_method.sort.*;

public class MainClass {

	 public static void main(String[] args) {
	        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
	        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
	        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

	        AscBubbleSort asc = new AscBubbleSort();
	        asc.sort(copy01OfArr);
	        DescBubbleSort desc = new DescBubbleSort();
	        desc.sort(copy02OfArr);

	        displaySorted(copy01OfArr);
	        displaySorted(copy02OfArr);
	    }

	    public static void displaySorted(Integer[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
}
