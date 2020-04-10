package com.dev.sort;
import java.util.Arrays;

public class BubbleSort {


    public static int[] getSortedArray(int[] inputarray){

        for (int outerIndex = 0; outerIndex < getLength(inputarray); outerIndex++) {

         boolean isSwapped=true;
            for (int innerIndex = outerIndex+1; innerIndex < getLength(inputarray); innerIndex++) {

                if(inputarray[innerIndex]<inputarray[outerIndex]){
                    int swap=inputarray[outerIndex];
                    inputarray[outerIndex]=inputarray[innerIndex];
                    inputarray[innerIndex]=swap;
                    isSwapped=false;
                }
            }

            if(isSwapped){
                break;
            }
        }

        return inputarray;
    }

    private static int getLength(int[] inputarray) {
        return inputarray.length;
    }

    public static void main(String[] args) {

        int[] inputArray=new int [] {26,34,7,8,19};
        System.out.println("input : "+Arrays.toString(inputArray));
        int[] sortedArray=getSortedArray(inputArray);
        System.out.println("output: "+Arrays.toString(sortedArray));


    }
}
