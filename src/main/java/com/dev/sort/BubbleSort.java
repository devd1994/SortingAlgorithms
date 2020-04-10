package com.dev.sort;
import java.util.Arrays;

public class BubbleSort {


    public static int[] getSortedArray(int[] inputarray){

        for (int outerIndex = 0; outerIndex < inputarray.length; outerIndex++) {

         boolean isSwapped=true;
            for (int innerIndex = outerIndex+1; innerIndex < inputarray.length; innerIndex++) {

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

    public static void main(String[] args) {

        int[] inputArray=new int [] {26,34,7,8,19};
        System.out.println("input : "+Arrays.toString(inputArray));
        int[] sortedArray=getSortedArray(inputArray);
        System.out.println("output: "+Arrays.toString(sortedArray));


    }
}
