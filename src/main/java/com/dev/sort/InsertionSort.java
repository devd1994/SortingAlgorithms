package com.dev.sort;

import java.util.Arrays;

public class InsertionSort {


    public static int[] getSortArrayInsertionArray(int[] inputArray){

        for (int i = 0; i <inputArray.length-1 ; i++) {

            int selectedElement=inputArray[i];
            int j=i-1;

            while(j>=0&&inputArray[j]>selectedElement){
                inputArray[j+1]=inputArray[j];
                j=j-1;

            }
              inputArray[j+1]=selectedElement;
        }


        return inputArray;
    }


    public static void main(String[] args) {
        int[] inpuArray=new int[]{34,26,17,19,42};
        System.out.println("input: "+ Arrays.toString(inpuArray));
        int[] sortArrayInsertionArray = getSortArrayInsertionArray(inpuArray);

        System.out.println("output: "+Arrays.toString(sortArrayInsertionArray));
    }

}
