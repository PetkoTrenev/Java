package JavaPIK.src.homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11 {
	public static void main(String args[]) {
        int[] myAArray = getAArray();
        int[] myBArray = getBArray();
        int[] mySortedAArray = sortArray(myAArray);
        int[] mySortedBArray = sortArray(myBArray);
        //printArrays(mySortedAArray);
        //printArrays(mySortedBArray);
        int[] myCArray = getCArray(mySortedAArray,mySortedBArray);
        printArrays(myCArray);
       
    }

     public static int[] getAArray() {
    	 
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter how many elements to sort");
     int number = sc.nextInt();
     int[] array = new int[number];
     System.out.println("Input numbers for A array");
     for (int i = 0; i<array.length; i++) {
         array[i] = sc.nextInt();
     }
     //System.out.println(Arrays.toString(array));
     return array;
     }
     
     public static int[] getBArray() {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter how many elements to sort");
    	 int number = sc.nextInt();
         int[] array = new int[number];
         
         System.out.println("Input numbers for B array");
         for (int i = 0; i < array.length; i++) {
             array[i] = sc.nextInt();
         }
         return array;
     }
     
     public static int[] getCArray(int[] aArray, int[] bArray) {
        int size3 = aArray.length+bArray.length;
        int size1 = aArray.length;
        //int size2 = bArray.length;
        int x = 0;
        int[] cArray = new int[size3];
        for (int i = 0; i < size1; i++) {
        	cArray[i] = aArray[i];
        	if (i == (size1-1)) {
        		for (int j = i+1; j < size3; j++) {
        			
        			cArray[j] = bArray[x];
        			x++;
        		}
        	}
        }
        
        return cArray;
         
     }
 
     public static int[] sortArray(int[] array) {
       
        int temp = 0;
        boolean fixed = false;
        while (fixed == false)  {
            fixed = true;
           
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    fixed = false;
                }
            }
        }
        return array;
    }
     
     public static void printArrays(int[] cArray) {
         
         //System.out.println(Arrays.toString(sortArray));
         System.out.println(Arrays.toString(cArray));
     }
 }

