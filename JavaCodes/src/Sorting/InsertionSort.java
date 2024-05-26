package Sorting;

import java.util.Random;

public class InsertionSort {
    public static void main(String[] args){
        Random random=new Random();
        int[] numbers=new int[10];
        for(int i=0;i<10;i++){
            numbers[i]=random.nextInt(100);
        }
        //int[] numbers=new int[]{40,90,73,31,41,11,61,90,96,82};
        System.out.println("Before");
        display(numbers);
        insertionSort(numbers);
        System.out.println("After");
        display(numbers);
    }
    private static void insertionSort(int[] arr){
        for (int i=1;i<arr.length;i++){
            int currentValue=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>=currentValue){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=currentValue;
        }
    }
    private static void display(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
