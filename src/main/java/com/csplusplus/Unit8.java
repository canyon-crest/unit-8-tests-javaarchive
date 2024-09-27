package com.csplusplus;

public class Unit8 {

    // 1. Method to calculate the sum of all elements in a 2D array
    // Instructions: Traverse the 2D array and calculate the sum of all elements.
    public static int sumOfElements(int[][] array) {
        // TODO: Implement this method
        int sum = 0;
        for(int[] subarray: array){
        	for(int x: subarray) sum += x;
        }
    	return sum;  // Placeholder return value
    }

    // 2. Method to count how many times a specific number appears in a 2D array
    // Instructions: Traverse the 2D array and count the number of times a specified value appears.
    public static int countOccurrences(int[][] array, int value) {
        // TODO: Implement this method
    	int count = 0;
        for(int[] subarray: array){
        	for(int x: subarray) {
        		if(x == value) count ++;
        	};
        }
        return count;  // Placeholder return value
    }

    // 3. Method to find the maximum element in a 2D array
    // Instructions: Traverse the 2D array and find the maximum element.
    public static int findMax(int[][] array) {
        // TODO: Implement this method
    	int max = array[0][0];
        for(int[] subarray: array){
        	for(int x: subarray) {
        		if(x > max) max = x;
        	};
        }
        return max; 
    }

    // 4. Method to reverse the rows of the 2D array
    // Instructions: Reverse the rows of the 2D array (e.g., the first row becomes the last, etc.).
    public static void reverseRows(int[][] array) {
    	for(int i = 0; i < array.length / 2; i ++) {
    		int[] temp = array[i];
    		array[i] = array[array.length - 1 - i];
    		array[array.length - 1 - i] = temp;
    	}
    }

    // 5. Method to transpose a 2D array (swap rows and columns)
    // Instructions: Create and return a new 2D array that is the transpose of the input array.
    public static int[][] transpose(int[][] array) {
        // TODO: Implement this method
    	int[][] newArray = new int[array[0].length][array.length];
    	for(int i = 0; i < array.length; i ++) {
    		for(int j = 0; j < array[i].length; j ++) {
    			newArray[j][i] = array[i][j];
    		}
    	}
        return newArray;  // Placeholder return value
    }

    // 6. Method to fill a 2D array with random integers
    // Instructions: Create a 2D array of size numRows x numCols and fill it with random integers between min and max.
    public static int[][] fillWithRandom(int min, int max, int numRows, int numCols) {
        // TODO: Implement this method
    	int[][] output = new int[numRows][numCols];
    	for(int[] arr: output) {
    		for(int i = 0; i < arr.length; i ++) {
    			arr[i] = (int) (min + (Math.random() * (max - min)));
    		}
    	}
        return output;  // Placeholder return value
    }
}