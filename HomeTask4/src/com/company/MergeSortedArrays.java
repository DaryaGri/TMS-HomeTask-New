package com.company;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {8, 12, 13, 18};
        int arr2[] = {2, 3, 14, 22, 29};
        mergeVariantOne(arr1, arr2);

        System.out.println();
        int res[] = mergeVariantTwo(arr1,arr2);
        for (int a : res){
            System.out.print(a + " ");
        }


    }

    public static void mergeVariantOne (int arr1[], int arr2[] ){

        int mergeArr[] = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        for (int k = 0; k < mergeArr.length; k++) {
            if (i > arr1.length - 1) {
                int temp1 = arr2[j];
                mergeArr[k] = temp1;
                j++;
            } else if (j > arr2.length - 1) {
                int temp1 = arr1[i];
                mergeArr[k] = temp1;
                i++;
            } else if (arr1[i] < arr2[j]) {
                int temp1 = arr1[i];
                mergeArr[k] = temp1;
                i++;
            } else {
                int temp2 = arr2[j];
                mergeArr[k] = temp2;
                j++;
            }
        }
        for (int a : mergeArr) {
            System.out.print(a + " ");
        }
    }
    public static int[] mergeVariantTwo (int arr1[], int arr2[] ){
        int mergeArr[] = new int[arr1.length + arr2.length];

        int i = 0; int j = 0; int k = 0;
        while(i< arr1.length && j< arr2.length){
            if(arr1[i]<arr2[j]){
               mergeArr[k++]= arr1[i];
               i++;
            }else {
                mergeArr[k++] = arr2[j];
                j++;
            }
        }
        while (i< arr1.length || j< arr2.length && k< mergeArr.length){
            if(i< arr1.length){
                mergeArr[k++]= arr1[i];
                i++;
            }else {
                mergeArr[k++] = arr2[j];
                j++;
            }
        }
        return mergeArr;
    }
}
