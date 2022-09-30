package com.company;

public class MergeSortedArrays {
    public static void main(String[] args) {

        int arr1[] = {8, 12, 13, 18};
        int arr2[] = {2, 3, 14};
        int mergeArr[] = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        for (int k = 0; k < mergeArr.length; k++) {
            if(i > arr1.length-1){
                int temp1 = arr2[j];
                mergeArr[k] = temp1;
                j++;
            }
            else if(j > arr2.length-1 ){
                int temp1 = arr1[i];
                mergeArr[k] = temp1;
                i++;
            }
            else if(arr1[i] < arr2[j]){
                int temp1 = arr1[i];
                mergeArr[k] = temp1;
                i++;
            }
            else{
                int temp2 = arr2[j];
                mergeArr[k] = temp2;
                j++;
            }
        }
        for(int a: mergeArr){
            System.out.print(a + " ");
        }
    }
}
