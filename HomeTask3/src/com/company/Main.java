package com.company;


public class Main {

   public static int[] bubbleSort(int[] array){
        boolean sorted = false;
        int temp;
        while (!sorted){
            sorted = true;
            for(int i=0; i< array.length-1; i++){
                if (array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        for(int j=0; j< array.length; j++){
            System.out.println("Sorted Array: "+ array[j]);
        }
        return array;
    }

    public static void insertionSort(int[] array){
        for(int i = 1; i< array.length; i++){
            int current = array[i];
            int j = i-1;
            while (j>=0 && current<array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }



    public static void main(String[] args) {
        System.out.println("Массивы, сортировки:");
        int[] arr = {2, 8, 1, 65, 7, 2, 5};
        //arr = bubbleSort(arr);
        insertionSort(arr);
        for(int i=0; i< arr.length; i++){
            System.out.println("Sorted Array: "+ arr[i]+ " Index: "+i);
        }
        int[] arr1 = {2, 18 ,23 ,5};// Пробы foreach
        for(int i: arr1){
            System.out.print(i + ", ");
        }
        /*
        int[] arr = new int[6];
        for(int i=0; i<arr.length; i++){
            arr[i] = i;

            if( arr[5] == 5) {
                System.out.println(i + ".");
                break;
            }
            System.out.print(i + ", ");
         }

         */
        /* Можно вводить данные через сканер, но тогда нужно менять кол-во элементов в массиве
        int[] month = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature for each day of the month:");
        for (int i = 0; i < month.length; i++) {
            month[i] = sc.nextInt();
        }
        averageTemperature(month);*/

    }
}
